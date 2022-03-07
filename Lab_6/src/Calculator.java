import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private int result;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
        System.out.print("Input the first number: ");
        num1 = scanCalc.nextInt();
        
        scanCalc.nextLine();
        System.out.print("Input the operator: ");
        operator = scanCalc.nextLine();
        
        System.out.print("Input the second number: ");
        num2 = scanCalc.nextInt(); 
        scanCalc.close();
        
        switch(operator) {
        case "+" :
        	
        	System.out.println(add(num1, num2));
        	break;
        	
        case "-":
        	
        	System.out.println(subtract(num1, num2));
        	break;
        	
        case "*":
        	
        	System.out.println(multiply(num1, num2));
        	break;
        	
        case "/":
        	
        	System.out.println(divide(num1, num2));
        	break;
        	
        	
        	
        	
        }
        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    }

    public String add(int a, int b) {
    	result = a + b;
    	return a + "+" + b + "=" + result;
    }

    public String subtract(int a, int b) {
    	result = a-b;
    	return a + "-"+ b+ "=" +result;
    }

    public String multiply(int a, int b) {
    	result = a * b;
    	return a + "*"+ b+ "="+ result;
    }

    public String divide(int a, int b) {
    	result = a / b;
    	return a + "/"+ b+"=" +result;
    }
}