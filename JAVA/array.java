import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<arr.length;i++){
            int user_data=sc.nextInt();
            arr[i]=user_data;
        }
        int lowest=arr[0];
        int highest=arr[0];
        for (int j:arr){
            if(j<lowest){
                lowest=j;
            }
            if (j>highest){
                highest=j;
            }
        }
System.out.println(lowest+" "+highest);
sc.close();
    }
}
