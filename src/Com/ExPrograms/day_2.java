package Com.ExPrograms;

public class day_2 {

	public static void main(String[] args) {
		int k=1;
		for(int i=0;i<=4;i++) {
			for(int j=4;j>=i;j++) {
				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println(" ");
		}

	}

}
