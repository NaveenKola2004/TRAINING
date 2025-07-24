import java.util.Scanner;
public class calculator {
public static void line(){
    System.out.println("|------------------------|");
}
public static void add(float a,float b){
    System.out.println(a+b);
}
public static void sub(float a,float b){
System.out.println(a-b);
}
public static void multi(int a,int b){
System.out.println(a*b);
}
public static void div(int a,int b){
    System.out.println(a/b);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);line();
        System.out.print(" Enter the Number 1 : ");
        int num1=sc.nextInt();
        line();
        System.out.print(" Enter the Number 2 : ");
        int num2=sc.nextInt();
        line();
        System.out.print("Enter the operator : ");
        String opp=sc.next();
        switch(opp){
            case "+":
            add(num1, num2);
            break;
            case "-":
            sub(num1, num2);
            break;
            case "*":
            sub(num1, num2);
            break;
            case "/":
            div(num1, num2);
            break;
            default:
            System.out.println("Opperator not found");
        }
        sc.close();
    }
}