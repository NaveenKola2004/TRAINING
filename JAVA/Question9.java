public class Question9 {

    public static void main(String[] args) {
        int num=128;
        int start=1;
        int binay=1;
        while(binay<=num){
            binay=binay*2;
        }
        binay=binay/2;
        int ans=(2*(num-binay)+start)%num;
        System.out.println(ans);
    }
}