public class patterns {

    public static void main(String[] args) {
        int n=5;
        int m=n/2+1;
        int col=2*n-1;
        for (int i=1;i<=n;i++){
            // for(int j=1,k=n;j<=n;j++,k--){
            for (int j=col;j>=1;j--){
            if(j>=n-i+1&&j<=n+i-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
            System.out.println();
        }
    }
}