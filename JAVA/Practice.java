// 1
// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int num=sc.nextInt();
//         System.out.println((num%2)==0? "even" :"odd");
//         if(num%2==0)
//         System.out.println("Even");
//         else
//         System.out.println("odd");
//         sc.close();
//     }
//     }
    
// 10
// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         System.out.println(num1*num2);
//         System.out.println(num1/num2);
//         System.out.println(num1%num2);
//         sc.close();
//     }
// }

// 3

// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int length=sc.nextInt();
//         int quantity=sc.nextInt();
//         System.out.println(2*(length+quantity));
//         System.out.println(length*quantity);
//         sc.close();
//     }
// }

// 4
// import java.util.Scanner;
// import java.text.DecimalFormat;;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         float amount=sc.nextFloat();
//         float rate=sc.nextFloat();
//         float time=sc.nextFloat();
//         double intrest = (amount*rate*time)/100;
//         double discount = (intrest*0.02)%100;
//         DecimalFormat df = new DecimalFormat("0.00");
//         // System.out.printf(df.format((amount*rate*time)/100));
//         System.out.println(discount);
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);

//         sc.close();
//     }
// }



// public class Practice {

//     public static void main(String[] args) {
//         int N=3;
//         if ((N&1)!=0){
//             System.out.println("Weird");
//         }
//         else{
//             if (N>=2 & N<=5){
//             System.out.println("Not Weird");
//             }
//             else if (N >=6 &N<=20){
//                 System.out.println("Weird");
//             }
//             else{
//                 System.out.println("Not Weird");
//             }
//         }
//     }
// }

// import java.util.Scanner;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         System.out.println(a+"\n"+b+"\n"+c);
//         sc.close();
//     }
// }


// public class Practice {
// public static void main(String[] args) {
//         int N=2;
//         for (int i=1;i<=10;i++){
//             System.out.println(N+" X "+i+" = "+*i);
//         }
//     }
// }

//FACTORIAL

// import java.util.Scanner;

// class CSE{
//     public int factorial(int n){
//         if(n==0){
//             return 1;
//         }
//         else{
//             return n*factorial(n-1);
//         }
//     }
// }
// public class practice2 {

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         CSE student=new CSE();
//         int num=sc.nextInt();
//         System.out.println(student.factorial(num));
//         sc.close();
//     }
// }



//Hackrank question answer

// import java.util.Scanner;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         double num2=sc.nextDouble();
//         sc.nextLine();
//         String data=sc.nextLine();

//         System.out.println("String : "+data);
//         System.out.println("Double : "+num2);
//         System.out.println("Int : "+num);
//         sc.close();
//     }
// }

//terv question

// import java.util.Scanner;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         for (int i=num1;i<=num2;i++){
//             if(i%2!=0){
//                 System.out.print(i+" ");
//             }
//         }
//         System.out.println();
//         for (int i=num1;i<=num2;i++){
//             if(i%2==0){
//                 System.out.print(i+" ");
//             }
//         }
//         sc.close();
//     }
// }

// public class Practice {

//     public static void main(String[] args) {
//         int num=4;
//         int sum=0;
//         for (int i=1;i<=num;i++){
//             sum=sum+i;
//         }
//         System.out.println(sum);
//     }
// }

// public class Practice {

//     public static void main(String[] args) {
//         int num=7;
//         int sq=num*num;
//         if ((sq%10)==num){
//             System.out.println("Automorphic Number");
//         }
//         else{
//             System.out.println("Not Automorphic Number");
//         }
//     }
// }


// 5
// import java.util.Scanner;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int temp=num;
//         int sum=0;
//         while(num>0){
//             int def =num%10;
//             sum=sum+def;
//             num=num/10;
//         }
//         if (temp%sum==0){
//             System.out.println("Harshad Number");
//         }
//         else{
//             System.out.println("Not Harshad Number");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         float millage=sc.nextFloat();
//         int liters=sc.nextInt();
//         int distance=sc.nextInt();
//         System.out.println((millage*liters>=distance)?"can reach":"cannot reach");
//         sc.close();
//     }
// }

public class Practice {

    public static void main(String[] args) {
        byte c='a';
        System.out.println(c);
    }
}