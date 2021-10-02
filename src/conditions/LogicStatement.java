package conditions;

import java.text.BreakIterator;

public class LogicStatement {

	public static void main(String[] args) {
		//if statement
		int num1 = 12;
		if(num1<11) {
			System.out.println("this number is less then 11");
		}
		
		//if and else statement 
		int num=9;
		if(num % 2 == 0) {
			System.out.println("this number is even");
		}
		else {
			System.out.println("this number is odd");
		} 
		
		//if, else if and else 
		String month = "Dec";
		if (month.equals("Jan")) {
			System.out.println("this is the first month of the year");
		}else if (month.equals("Dec")) {
			System.out.println("this is the last month of the year");
		}else if(month.equals("Feb")){
			System.out.println("this is a sepcial month");
		}else {
			System.out.println("this is regular month");
		}
		
		
		//switch statement
		int day = 2;
		String currentDay;
		switch(day) {
		case 1: currentDay = "Mon";
			break;
		case 2: currentDay = "Tue";
			break;
		case 3: currentDay = "Wed";
			break;
		case 4: currentDay = "Thu";
			break;
		case 5: currentDay = "Fri";
			break;
		case 6: currentDay = "Sat";
			break;
		case 7: currentDay = "Sun";
			break;
		default: currentDay = "incorrect number";
		}
		System.out.println("today is: "+currentDay);
			

	}

}
