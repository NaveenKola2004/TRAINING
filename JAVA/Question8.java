// public class Question8 {
//     public static void main(String[] args) {
        
//         int values[]={0,1,0,1,1,0,1,1};
//         int zeros=0;
//         int onces=0;
//         for (int i=0;i<values.length;i++){
//             if(values[i]==0){
//                 zeros=zeros+1;
//             }
//             else{
//                 onces=onces+1;
//             }
//         }
//         if (onces>zeros){
//             System.out.println("TRUE");
//         }
//         else{
//             System.out.println("False");
//         }
//     }
    
// }

public class Question8 {

    public static void main(String[] args) {
        int nums[]={1,2,5,4};
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int length_nums=nums.length+1;
        int sum_of_total=((length_nums*(length_nums+1)/2));
        System.out.println(sum_of_total-sum); 
    }
}