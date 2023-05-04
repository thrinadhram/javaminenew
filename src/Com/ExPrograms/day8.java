package Com.ExPrograms;

public class day8 {

	public static void main(String[] args) {
		String str="hello world mani kanta";
		
		int count=1;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)==' '){//&&str.charAt(i+1)!=' ') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
