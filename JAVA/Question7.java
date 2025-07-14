public class Question7 {
    public static void main(String[] args) {
        int num = 173;
        int numberlast=num%10;
        int middle1=(num/10)/10;
        int middle2=(num/10)%10;
        int first=(num/100);
        System.out.println((first )+""+(first+middle2+middle1)+""+((middle2+numberlast>9)? "0":"")+""+numberlast);
    }
}

