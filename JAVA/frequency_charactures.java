import java.util.Scanner;
public class frequency_charactures {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char[] a=new char[n];
    int[] c=new int[26];
    for(int i=0;i<n;i++){
        a[i]=sc.next().charAt(0);
        c[a[i]-'a']++;
    }
    for (int i=0;i<c.length;i++){
        if(c[i]>=1){
            System.out.println(c[i]);
        }
        }
}
}
