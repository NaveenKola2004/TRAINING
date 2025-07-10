public class QUESTION1 {
    public static void main(String[] args){
        int whe=40;
        int veh=10;
        int tw=(((veh*4)-whe)/2);
        if ((whe%2==0)&&(whe>veh)){
        System.out.println("TW : " +tw + " FW : "+(veh-tw));
        }
        else{
            System.out.println("Invalid");
        }
    }
}