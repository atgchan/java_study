package customer;


public class customer {
	
	public customer(int id){
		this.id = id;
	}
	
	//고객의 기본정보
	private int id;
	private String name;
	private int arrivedTime;
	private int timeTake;
	private String departStation;
	private String destiStation;
	private int travelTime;
	
	//고객의 추가정보
	private boolean hasTicket = false;
	private int waitTime;
	private int checkInTime;
	private int departTime;
	private int arrivalTime;
	
	public int getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(int currentTime) {
		this.waitTime = currentTime - arrivedTime;
		departTime = currentTime;
	}
	
	public int getTimeTake(){
		return timeTake;
	}
	
	public boolean getHasTicket(){
		return hasTicket;
	}
	
	public int getArrivedTime(){
		return arrivedTime;
	}
	
	public void setInfos(int nCol, String szValue) {
		switch(nCol){
		case 1:
			name = szValue;
			break;
		case 2:
			arrivedTime = Integer.parseInt(szValue);
			break;
		case 3:
			timeTake = Integer.parseInt(szValue);
			break;
		case 4:
			departStation = szValue;
			break;
		case 5:
			destiStation = szValue;
			break;
		case 6:
			travelTime = Integer.parseInt(szValue);
			break;
		}
	}

	public void printInfos() {
		System.out.print(id);System.out.print("\t");
		System.out.print(name);System.out.print("\t");
		System.out.print(arrivedTime);System.out.print("\t");
		System.out.print(timeTake);System.out.print("\t");
		System.out.print(departStation);System.out.print("\t");
		System.out.print(destiStation);System.out.print("\t");
		System.out.print(travelTime);System.out.print("\t");
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public int getDepartTime() {
		return departTime;
	}

	public void setCheckInTime(int currentTime) {
		hasTicket = true;
		checkInTime = currentTime;
	}

	public int getCheckInTime() {
		return checkInTime;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}
	
	public void setDepartTime(int departTime) {
		hasTicket = false;
		this.departTime = departTime;
		arrivalTime = departTime + travelTime;
		waitTime = departTime - arrivedTime - timeTake;
	}

	public int getId() {
		return id;
	}

	public String getDepartStation() {
		return departStation;
	}
	
	public String getDestiStation() {
		return destiStation;
	}

	public int getTravelTime() {
		return travelTime;
	}
}
