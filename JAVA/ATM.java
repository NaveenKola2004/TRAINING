import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        System.out.println("Welcome to the MEC ATM");
        Scanner sc=new Scanner(System.in);
        int otp=12345;
        int pin_number=123;
        float balance=5000f;
        for (int attempt=3;attempt>0;){
            
        System.out.print("Enter your pin number :");
        int pin=sc.nextInt();
        if (pin==pin_number){
            System.out.println("WElcome user");
            for (int x=1;x==1;){
            System.out.println("\n1. Credit\n2. Debit\n3.Check Balance\n4.Change Pin number\n5.0Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to be credit : ");
                    int amount_c=sc.nextInt();
                    balance=balance+amount_c;
                    System.out.printf("Balence : %.2f ",balance);
                    break;
                case 2:
                System.out.print("Enter the amount to Debit : ");
                int amount_d=sc.nextInt();
                balance=balance-amount_d;
                if (balance>0){
                    System.out.printf("Amount "+amount_d+"rs debited \n Balence %.2f:",balance);
                }
                else{
                    System.out.println("Insuffcent balance");
                }
                break;
                case 3:
                System.out.printf("Balance is %.2f",balance);
                break;
                case 4:
                System.out.print("Enter the 5 digits otp to change pin : ");
                int user_otp=sc.nextInt();
                if (otp==user_otp){
                    System.out.print("Please enter the new pin 4 digits : ");
                    int newpin=sc.nextInt();
                    pin=newpin;
                    System.err.println("Sucessfully pin changed\n New pin is "+pin);
                }
                else{
                    System.out.print("Incorrect otp");
                }
                break;
                case 0:
                x=0;
                break;
            }
        }
            break;
    }
        else{
            --attempt;
            if(attempt>0){
                System.out.println("Enter correct pin number "+attempt+((attempt>1)?" attempts left":" attempt left"));
            }
        }
    }
    sc.close();

    }
}

