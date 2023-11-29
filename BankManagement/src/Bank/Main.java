package Bank;
import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
				Operation op=new Operation();
				while(true) {	
					System.out.println("Bank Of Maharashtra Ahmednagar");
					
					System.out.println("*********************************");
					System.out.println("Select Action From below");
					
				
					System.out.println("1 Create Account Number \n 2.deposite money \n 3.Withdrall \n 4.Show Detail \n 5.Check Balance");
					System.out.println(" ");
					int a=sc.nextInt();
					switch(a)
					{
					case 1:op.createAcc();
						break;
					case 2:op.Deposite();
					      break;
					case 3:op.Withdrall();
					         break;
					case 4:op.showDetails();
					        break;
					case 5:op.CheckBalance();
			               break;
					}
					}
	}

}
