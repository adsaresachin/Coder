package Bank;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Operation {
	Scanner sc=new Scanner(System.in);
	Account ac=new Account();
	
	public void createAcc() {
		
		System.out.println("Enter Account Number");
		ac.setAcco(sc.nextInt());
		
		System.out.println("Enter Customer Name");
		ac.setName(sc.next());
		System.out.println("Enter Customer Address");
		
		ac.setAddress(sc.next());
        
		
		while(true) {
			System.out.println("Enter Deposite");
			double d=sc.nextDouble();
			if(d>=500) {
				ac.setMoney(d);
				break;
			}
			else {
				System.out.println("Deposite Ammount should be  greater than or eqa; to Rs 500");
				
			}
		}
		System.out.println("Account Sucessfully");
	}
	
	public void Deposite() {
		System.out.println("ENter Account Number ");
		int accNumber=sc.nextInt();
		if(ac.getAcco()==accNumber) {
			System.out.println("Account Verify");
			System.out.println("Enter Ammount:");
			double depositedMoney=sc.nextDouble();
			if(depositedMoney>0) {
				double totalMoney=ac.getMoney()+depositedMoney;
				ac.setMoney(totalMoney);
				System.out.println("---------------------------------");
				System.out.println("Availabel Balance is ="+ac.getMoney());
				System.out.println("---------------------------------");
				
			}
		}
		
		
		
	}
	public void Withdrall() {
		System.out.println("ENter Account Number ");
		int accNumber=sc.nextInt();
		if(ac.getAcco()==accNumber) {
			System.out.println("Account Verify");
			System.out.println("Enter Ammount:");
			double depositedMoney=sc.nextDouble();
			if(depositedMoney>0) {
				double totalMoney=ac.getMoney()-depositedMoney;
				ac.setMoney(totalMoney);
				System.out.println("---------------------------------");
				System.out.println("Availabel Balance is ="+ac.getMoney());
				System.out.println("---------------------------------");
				
			}
		}
		
		
		
	}
	public void showDetails() {
		System.out.println("Enter Account Number");
		int accNumber=sc.nextInt();
		if(ac.getAcco()==accNumber) {
			System.out.println("Account Verify");
			System.out.println("---------------------------------");
			System.out.println("Account Number:-" +ac.getAcco());
			System.out.println("Customer Name:-" +ac.getName());
			System.out.println("Customer Address:-" +ac.getAddress());
			System.out.println("Available Balance:-"+ac.getMoney());
			System.out.println("---------------------------------");
			
		}
	}
	
	public void CheckBalance() {
		System.out.println("Enter Account Number");
		int accNumber=sc.nextInt();
		if(ac.getAcco()==accNumber) {
		
			System.out.println("Account Verify");
			System.out.println("Availbale Balance "+ac.getMoney());
		
		}
		else {
			System.out.println("Please check Account Number!..");
			
			
		}
			
			
		
	}

}


