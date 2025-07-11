public class Question4 {
    public static void main(String[] args) {
        int year=2050;
        year%=100;
        int leap_year= (year /4 )+1;
        int odd_days_leap=leap_year*2;
        int non_leap_year=year-leap_year;
        int total=(odd_days_leap+non_leap_year)%7;
        System.out.println(total);
        switch (total) {
            case 1:
            System.out.println("sunday");
                break;
            case 2:
            System.out.println("monday");
            break;
            case 3:
            System.out.println("tuesady");
            break;
            case 4:
            System.out.println("wensday");
            break;
            case 5:
            System.out.println("thuesday");
            break;
            case 6:
            System.out.println("friday");
            break;
            case 0:
            System.out.println("saterday");
        }
        }
}
