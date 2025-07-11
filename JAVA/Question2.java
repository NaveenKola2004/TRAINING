public class Question2 {
    public static void main(String[] args) {
        int number=350;
        int final_number=number%8;
        int Seat_Number=final_number;
        if (Seat_Number==1){
            System.out.println("Lower");
        }
        else if (Seat_Number==2) {
            System.out.println("Middle");
        }
        else if (Seat_Number==3){
            System.out.println("Upper");
        }
        else if(Seat_Number==4){
            System.out.println("Lower");
        }
        else if (Seat_Number==5){
            System.out.println("Middle");
        }
        else if(Seat_Number==6){
            System.out.println("Upper");
        }
        else if(Seat_Number==7){
            System.out.println("Side Lower");
        }
        else{
            System.out.print("Side Upper");
        }
        // System.out.println((Seat_Number==1)?"Lower":(Seat_Number==2)?"Middle" : (Seat_Number==3)? "Upper": (Seat_Number==4)? "Lower" : (Seat_Number==5)? "Middle" :(Seat_Number==6)? "Upper" : (Seat_Number==7)?"Side Lower" :(Seat_Number==8)? "Side Upper" : "Invalid");
    }
}
