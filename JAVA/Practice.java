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
import java.util.Scanner;
import java.text.DecimalFormat;;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        float rate=sc.nextFloat();
        float time=sc.nextFloat();
        double intrest = (amount*rate*time)/100;
        double discount = (intrest*0.02)%100;
        DecimalFormat df = new DecimalFormat("0.00");
        // System.out.printf(df.format((amount*rate*time)/100));
        System.out.println(discount);
        sc.close();
    }
}

// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);

//         sc.close();
//     }
// }