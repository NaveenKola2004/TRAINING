// import java.util.Scanner;
// public class Questionpractice2 {

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String word=sc.nextLine();
//         char ch=sc.next().charAt(0);
//         int count=0;
//         for (int i=0;i<word.length();i++){
//             if(word.charAt(i)==ch){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

import java.util.Scanner;
public class Questionpractice2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            int val=sc.nextInt();
            arr[i]=val;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}