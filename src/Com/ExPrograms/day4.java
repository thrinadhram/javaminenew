package Com.ExPrograms;

public class day4 {

	public static void main(String[] args) {
		String str="Mani Kanta";
	   int upper=0,lower=0;
		for(int i=0;i<=str.length()-1;i++) {
			
			char ch=str.charAt(i);
			
			if(ch>=65&&ch<=90) {
				upper++;
			}
			else {
				lower++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
	}

}
