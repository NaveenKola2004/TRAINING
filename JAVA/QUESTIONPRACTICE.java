import java.util.Scanner;
public class QUESTIONPRACTICE {
        
    public static void Armstrong(int number){
        int origonal=number,sum=0,digit;
        int len=String.valueOf(origonal).length();
        while(number!=0){
            digit=number%10;
            sum=sum+(int)Math.pow(digit,len);
            number/=10;
        }
        if(origonal==sum){
            System.out.print("Yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static void Line(){  // print lines 
        System.out.println("\n------------------");
    }
    public static int count_digits(int number){ // count of numbers
        int count =0,digit;
        while (number!=0){
            digit=number%10;
            count++;
            number/=10;
        }
        return count;
    }
    public static void Even_odd(int number){//even odd check
    System.out.println((number&1)==0?"Even":"Odd");
    }
    public static int factorial(int number){
        if (number==0||number==1){
            return 1;
        }
        return number *factorial(number-1);
    }
    public static int sum_of_digits(int number){ //sum of digits 
        int sum=0,digit;
        if(count_digits(number)<=1){
                    System.out.println("Take atleast 2 numbers choose 7 update the new value");
        }
        else{
        while (number!=0){
            digit=number%10;
            sum=sum+digit;
            number/=10;
        }
    }
        return sum;
    }
    public static void polindrome(int number,int reversed){ //polindrome
        if(count_digits(number)<=1){
                    System.out.println("Take atleast 2 numbers choose 7 update the new value");
        }
        else if(number==reversed){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
public static int reverse(int number){ // reverse number 
    int digit,reverse=0;
    if(count_digits(number)<=1){
        System.out.println("Take atleast 2 numbers choose 7 update the new value");
    }
    else{
    while (number!=0){
        digit=number%10;
        reverse=reverse*10+digit;
        number/=10;
    }
}
    return reverse;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt(),reversed=reverse(number);
        
        for (int x=1;x==1;){
        System.out.println("\n1.reverseNumber \n2.Polindrome check \n3.Sum of number \n4.factorial\n5.Even(or)Odd\n6.Number of digits\n7.Update the number\n8.Armstrong Number  \n0.Exit");
        System.out.print("choose one :");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            Line();
                System.out.printf("%d Reverse is : %d",number,reverse(number));
                Line();
                break;
            case 2:
            Line();
            System.out.printf("%d is polindrome : ",number);
            polindrome(number, reversed);
            Line();
            break;
            case 3:
            Line();
            System.out.printf("%d Sum of numbers is :%d ",number,sum_of_digits(number));
            Line();
            break;
            case 4:
            Line();
            System.out.printf("%d factorial is : %d",number,factorial(number));
            Line();
            break;
            case 5:
            Line();
            System.out.printf("%d is : ",number);
            Even_odd(number);
            Line();
            break;
            case 6:
            Line();
            System.out.printf("In %d Number of digits : %d",number,count_digits(number));
            Line();
            break;
            case 7:
            System.out.print("Enter the new number : ");
            int newNum=sc.nextInt();
            number=newNum;
            break;
            case 8:
            Line();
            System.out.printf("%d is Armstrong number : ",number);
            Armstrong(number);
            Line();
            break;
            case 0:
            System.out.println("Bye");
            x=0;
            break;
            default:
            System.out.println("INvalid choice! try again");
            break;
        }
    }
    sc.close();
    }

}