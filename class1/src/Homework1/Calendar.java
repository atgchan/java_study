package Homework1;

import java.util.Arrays;

public class Calendar {
	
	private int year;
	private int month;
	private int day;
	
	public Calendar(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public boolean IsValidDay() {
		
		boolean isValid = false;
		
		int[] month_31 = {1, 3, 5, 7, 8 ,10 ,12};
		int[] month_30 = {4, 6, 9, 11};
		int[] month_29 = {2};
		int maxMonth = 0;
				
		if(Arrays.binarySearch(month_31, month) == 0) {
			maxMonth = 31;
		}
		else if (Arrays.binarySearch(month_30, month) == 0) {
			maxMonth = 30;
		}
		else if(Arrays.binarySearch(month_29, month) == 0) {
			if(year % 4 == 0) {
				maxMonth = 29;
			}
			else {
				maxMonth = 28;
			}
		}
		
		if(day >= 1 && day <= maxMonth) {
			isValid = true;
		}
		
		return isValid;
	}
	
}
