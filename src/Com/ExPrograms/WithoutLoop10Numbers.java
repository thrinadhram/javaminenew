package Com.ExPrograms;

public class WithoutLoop10Numbers {
	
	
	static void printnumbers(int n) {
		if(n<=10) {
			System.out.println(n);
			printnumbers(n+1);
		}
	}

	public static void main(String[] args) {
	printnumbers(1);

	}

}
