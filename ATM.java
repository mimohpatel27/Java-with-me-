
import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {
        // initiating the varialble 
        int balance=5000, withdraw , deposite;
        Scanner sc= new Scanner (System.in);
        while(true){
            System.out.println("Well Come to the SBI ATM");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposite");
            System.out.println("3. Balance Enquire");
            System.out.println("4. Services ");
            System.out.println("5. Exit");
            // here we take the choice from the user what they want 
            int choice =sc.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("Enter Your Amount");
                    withdraw=sc.nextInt();
                    if(balance >= withdraw){
                        balance=balance-withdraw;
                        System.out.println("Collect your money");
                        System.out.println("Avialble Balance : " +balance);
                    } else {
                        System.out.println("Insufficient Balance in your account");
                    }
                    System.out.println(" ");
                break;
                case 2:
                    System.out.println("Enter Amount for deposite ");
                    deposite=sc.nextInt();
                    balance=balance+deposite;
                    System.out.println("Your Money Has been Deppsited Sucessfully");
                    System.out.println("Now Avilable Balance is : "+balance);
                break;
                case 3:
                    System.out.println(balance);
                break;
                case 4:
                    System.out.println("If you did not use the above services from ATM then visit your nearest branch of the bank");
                break;
                case 5:
                    System.out.println("\nThank You\nVisit Again ");  
                break;    
                default:
                    System.out.println("Invallid Choice ");  

            }                      
        
        }

    }
}