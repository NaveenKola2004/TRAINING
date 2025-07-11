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
            case 0:
            System.out.println("mon");
                break;
            case 1:
            System.out.println("tue");
            break;
            case 2:
            System.out.println("wen");
            break;
            case 3:
            System.out.println("thus");
            break;
            case 4:
            System.out.println("fri");
            break;
            case 5:
            System.out.println("sat");
            break;
            case 6:
            System.out.println("sun");
        }
        }
}
