package lab9;

import java.util.Scanner;;

public class Skeleton {

    public static void main(String[] args) {
        // Initialize array of integers
    	int[] grades= new int[5];
    	Scanner scanny=new Scanner(System.in);
    	
    	int attendance, midterm;
    	double sum=0, assignmentsPercent=0, attendancePercent, midtermPercent;
    	final int ROW=grades.length;
    	final int TOTAL=5;
    	
        // for loop to get user input & store in array
    	for(int idx=0;idx<ROW;idx++) {
    		
    		System.out.println("input the grade of assignment "+ (idx+1));
    		grades[idx]=scanny.nextInt();
    		
    		}
    	System.out.println("Input the number of attended labs");
    	attendance=scanny.nextInt();
    	
    	System.out.println("input midterm grade");
    	midterm= scanny.nextInt();
    	
        // for loop to iterate over the array & perform calculations
    	for(int idx=0;idx<ROW;idx++) {
    		sum +=grades[idx];
    		assignmentsPercent= 0.3*(sum/TOTAL);
    	}
    	
    	attendancePercent= attendance*100*0.05;
    	
    	midtermPercent=midterm*0.3;
    	
    	
        // display output to user
    	System.out.println("Assignments (30%): "+ assignmentsPercent+ "\nAttendance (5%): "+
    						attendancePercent+ " \nMidterm (30%): "+ midtermPercent );
    	scanny.close();
    }
}
