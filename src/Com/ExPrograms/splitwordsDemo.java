package Com.ExPrograms;

public class splitwordsDemo {

	public static void main(String[] args) {
		String str="mani kanta hello hi";
		String s[]=str.split(" ", 4);
		for(String i:s) {
			System.out.println(i);
		}
	}

}
