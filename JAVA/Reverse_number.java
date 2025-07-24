import java.util.Scanner;
public class Reverse_number {

    public static int reverse(int num) {
        int rev=0;
        int digit;
       while (num!=0) {
        digit=num % 10;
        rev=rev*10+digit;
        num=num/10;
       }
       return rev;
    }
    public static void main(String[] Reverse_number) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        System.out.println(reverse(number)+" is reverse of "+number);
    sc.close();
    }
}