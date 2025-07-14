public class Question6 {
    public static void main(String[] squaring_of_2_digits) {
        int num=26;
        int asquare,bsquare,ab2;
        int a=num/10;
        int b=num%10;
        asquare=a*a;
        bsquare=b*b;
        ab2=2*a*b;
        int bsquarelastnum=bsquare%10;
        int bsquarefirstnum=bsquare/10;
        int ab2lastnum=ab2%10;
        int ab2firstnum=ab2/10;
        System.out.println((asquare+ab2firstnum)+""+(bsquarefirstnum+ab2lastnum)+""+bsquarelastnum);

    }
}
