public class Frequency {

	public static void main(String args[]){
		int num[]={1,5,3,1,2,5,6};
		int c[]=new int[100];
	for (int i=0;i<num.length;i++){
		c[num[i]]++;
	}
	for (int i=0;i<c.length;i++){
	// for (int i=c.length-1;i>=0;i--){
		if((c[i]&1)==0&(c[i]>1)){
			System.out.print(i+" ");
		}
	}
	}

}