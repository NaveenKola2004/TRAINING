public class Question3 {
    public static void main(String[] args) {
        int Day=7;
        int Calculat_Day=Day%7;

        if (Calculat_Day==1){
            System.out.println("Mon");
        }
        else if (Calculat_Day==2){
            System.out.println("Tue");
        }
        else if(Calculat_Day==3){
            System.out.println("Wen");
        }
        else if (Calculat_Day==4){
            System.out.println("THU");
        }
        else if(Calculat_Day==5){
            System.out.println("fri");
        }
        else if(Calculat_Day==6){
            System.out.println("sat");
        }
        else{
            System.out.println("Sunday");
        }
    }   
}
