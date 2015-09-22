package trainStation;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;

import customer.customer;
import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class trainStation {
	private static final int START_TIME = 0;
	private static final int END_TIME = 70;
	
	private ArrayList<customer> customerList = new ArrayList<customer>();
	/*
	 * counter 의 전략은 basic과 optimize 2가지가 존재합니다.
	 * */
	private ArrayList<counter> counter = new ArrayList<counter>();
	
	private ArrayList<customer> counterLine = new ArrayList<customer>();
	private ArrayList<customer> trainLine = new ArrayList<customer>();
	
	public void welcomeCustomers(){
		Workbook workbook = null;
		Sheet sheet = null;
		
		try{
			workbook = Workbook.getWorkbook(new File("./info.xls"));
			if(workbook != null){
				sheet = workbook.getSheet(0);
				
				if(sheet != null){
					int nRowStartIndex = 1;
					int nRowEndIndex = sheet.getColumn(2).length;
					int nColumnStartIndex = 1;
					int nColumnEndIndex = sheet.getRow(2).length;
					String szValue = "";
					customer c;
					
					for(int nRow = nRowStartIndex; nRow<nRowEndIndex; nRow++){
						c = new customer(nRow);
						for(int nCol = nColumnStartIndex; nCol<nColumnEndIndex; nCol++){
							szValue = sheet.getCell(nCol, nRow).getContents();
							c.setInfos(nCol, szValue);
						}
						customerList.add(c);
						//c.printInfos();
					}
				}
				else{
					System.out.println("Sheet is missing!!");
				}
			}
			else{
				System.out.println("Workbook is null!!");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(workbook != null){
				workbook.close();
			}
		}
	}

	public void startTicketing() throws RowsExceededException, WriteException, IOException {
		counter.add(new counter("basic"));
		counter.add(new counter("optimize"));
		
		File excelFile = new File("./record.xls");
		WritableWorkbook workbook = Workbook.createWorkbook(excelFile);
		
		for(int j=0; j<counter.size(); j++){
			for(int i=START_TIME; i<=END_TIME; i++){
				addCustomerToCounterLine(i);
				updateTrainLine(i);
				counter.get(j).updateClerkStatus(i, trainLine);
				if(counterLine.size()>0){
					counter.get(j).recieveCustomer(counterLine, trainLine, i);
				}
			}
			writeRecord(workbook, counter.get(j));
		}
		workbook.write();
		workbook.close();
	}

	private void writeRecord(WritableWorkbook workbook, counter counter) throws RowsExceededException, WriteException, IOException {
		WritableSheet sheet = null;
		Label label = null;
		
		try {
			workbook.createSheet(counter.getStrategyName(), counter.getStrategyNumber());
			sheet = workbook.getSheet(counter.getStrategyNumber());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		label = new Label(0, 0, "아이디");
		sheet.addCell(label);
		label = new Label(1, 0, "이름");
		sheet.addCell(label);
		label = new Label(2, 0, "도착시간");
		sheet.addCell(label);
		label = new Label(3, 0, "대기시간");
		sheet.addCell(label);
		label = new Label(4, 0, "디켓팅시간");
		sheet.addCell(label);
		label = new Label(5, 0, "기차탑승시간");
		sheet.addCell(label);
		label = new Label(6, 0, "출발지");
		sheet.addCell(label);
		label = new Label(7, 0, "도착지");
		sheet.addCell(label);
		label = new Label(8, 0, "소요시간");
		sheet.addCell(label);
		
		int waitTimeSum = 0;
		for(int i=0; i<customerList.size(); i++){
			customer c = customerList.get(i);
			waitTimeSum += c.getWaitTime();
			label = new Label(0, i+1, String.valueOf(c.getId()));
			sheet.addCell(label);
			label = new Label(1, i+1, c.getName());
			sheet.addCell(label);
			label = new Label(2, i+1, String.valueOf(c.getArrivedTime()));
			sheet.addCell(label);
			label = new Label(3, i+1, String.valueOf(c.getWaitTime()));
			sheet.addCell(label);
			label = new Label(4, i+1, String.valueOf(c.getTimeTake()));
			sheet.addCell(label);
			label = new Label(5, i+1, String.valueOf(c.getDepartTime()));
			sheet.addCell(label);
			label = new Label(6, i+1, c.getDepartStation());
			sheet.addCell(label);
			label = new Label(7, i+1, c.getDestiStation());
			sheet.addCell(label);
			label = new Label(8, i+1, String.valueOf(c.getTravelTime()));
			sheet.addCell(label);
		}
		label = new Label(3, 51, String.valueOf(waitTimeSum));
		sheet.addCell(label);
	}

	private void updateTrainLine(int currentTime) {
		if(currentTime % 3 == 0){
			for(int i=0; i<trainLine.size(); i++){
				trainLine.get(i).setDepartTime(currentTime);
				trainLine.remove(i);
			}			
		}
	}

	private void addCustomerToCounterLine(int currentTime) {
		for(int i=0; i<customerList.size(); i++){
			if(customerList.get(i).getArrivedTime() == currentTime){
				counterLine.add(customerList.get(i));
			}
		}
	}
}
