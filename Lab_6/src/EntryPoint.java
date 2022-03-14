import java.util.Scanner;

public class EntryPoint {
	public static void main(String[] args) {
	
		Scanner scanny = new Scanner(System.in);
		
		int numb;
		String str="";
		do {
		
		System.out.println("Which service would you like to use?" +"\n"+"[1]: Basic week visualizer"+"\n"+"[2]: Advanced week visualizer"+"\n"+"[3]: Basic calculator"+"\n"+"[4]: Employee repertoire");
		do {
		numb= scanny.nextInt();
		scanny.nextLine();
			if(numb<1 || numb>4) {
				System.out.println("Please make sure you pick a number between 1 and 4");
			}
		}while(numb<1 ||numb>4);
	
		switch(numb) {
		case 1:
			BasicWeek myWeek = new BasicWeek();
			myWeek.printDays();
			break;
			
		case 2:
			AdvancedWeek myWeek2 = new AdvancedWeek();
			myWeek2.printDays();
			break;
		
		case 3:
			Calculator calcy = new Calculator();
			break;
			
		case 4:
			Employee emp = new Employee();
			System.out.print(emp);
			break;
			
		}
		System.out.println("Would you like to perform another operation? (y/n)");
		str = scanny.nextLine();
	}while (str.equals("y"));
	}

}
