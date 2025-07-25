import java.util.Scanner;
public class frepractnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] c=new int[100];
        for (int i=0;i<a.length;i++){
            int data=sc.nextInt();
            a[i]=data;
        }
        for (int i=0;i<a.length;i++){
            c[a[i]]++;
        }
        //8) printing the numbers the 
         for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }

        //7) printing the numbers by the repeated even numbers of times
        // for (int i=0;i<c.length;i++){
        //     if(c[i]>=2 && c[i]%2==0){
        //     System.out.print(i+" ");
        //     }
        // }


        //6) sorting the numbers withouting repeating numbers 
        // and print the numbers norepeating
        //  System.out.print(a[0] + " ");
        // for (int i=1;i<n;i++){
        //     if(a[i]!=a[i-1]){
        //     System.out.print(a[i]+" ");
        //     }
        // }


        // 5) sorting the numbers by desending(small to big ) order using the bubble sort
        // for (int i=0;i<n-1;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(a[j]<a[j+1]){ // Shift the less then grater then symbol it will be the print according or decending order
        //             int temp=a[j];
        //             a[j]=a[j+1];
        //             a[j+1]=temp;
        //         }
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
        
        //3)DUPLICATE NUMBERS
        // for(int i=0;i<a.length;i++){
        //     if(c[i]>1){
        //         System.out.println(i+" ");
        //     }
        // }
         
        
        // 2) UNIQUE ELEMENTS
        // for(int i=0;i<c.length;i++){
        //     if(c[i]==1){
        //     System.out.println(i+" ");
        //     }
        // }
        // 1) MIN AND MAXIMUM
    
        // int max=a[0];
        // for (int j:a){
        //     if(j>max){
        //         max=j;
        //     }
        // }
        // System.out.println(max);
    }
    
}
