package Com.ExPrograms;

public class HighestNumberinArray {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		//int max=a[0];
		/*int secondmax=a[3];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println("highest number"+max);
		System.out.println("second number"+secondmax);*/
		int highest=0;
		int sehighest=0;
		for(int n:num) {
			if(highest>n) {
				sehighest=highest;
				highest=n;
			}
			else if(sehighest>n) {
				sehighest=n;
			}
			//System.out.println(highest);
		System.out.println(sehighest);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
