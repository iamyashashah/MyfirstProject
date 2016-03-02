package taxcode;
import java.util.Scanner;

public class salesRecord {

	public static void main(String[] args) {
		String custnum, name, taxcode;
		double salesamt;
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("enter customer number:");
		custnum = keyboard.next();
		
		System.out.print("enter customer name:");
		name = keyboard.next();
		
		System.out.print("enter sales amount:");
		salesamt =  keyboard.nextDouble();
		
		System.out.print("enter tax code");
		taxcode = keyboard.next();
		
		if (taxcode.equals("NRM")){
			System.out.println("Total amount owed including tax : $" + (salesamt+((6*salesamt)/100)));
		}
			
		else if (taxcode.equals("NPF")){
			System.out.println("Total amount owed including tax : $" + (salesamt+((0*salesamt)/100)));
			
			}
		else if (taxcode.equals("BIZ")){
			System.out.println("Total amount owed including tax : $" + (salesamt+((4.5*salesamt)/100)));
		}
		
		else 
		{
			System.out.println("you have enter incorrect code");
			
		}
		keyboard.close();	

	}

}
