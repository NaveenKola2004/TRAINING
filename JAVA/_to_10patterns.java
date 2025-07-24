
public class _to_10patterns {
public static void main(String args[]){
        int n=5;
        int m=5/2+1;
        for (int i=1;i<=n;i++){
            for (int j=1,k=n;j<=n;j++){
                if (i==1||j==n||i==n||j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.err.println();
          for (int i=1;i<=n;i++){
            for (int j=1,k=n;j<=n;j++,k--){
                if (i==n||j==3||(i==2&j==2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
    System.out.println();
    for (int i=1;i<=n;i++){
            for (int j=1,k=n;j<=n;j++,k--){
                if (i==1||i==n||i==k||(i==2&j==1)){
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