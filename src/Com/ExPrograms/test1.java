package Com.ExPrograms;

public class test1 {

	public static void main(String[] args) {
		String str="Mani| ]-'Kanta /?!@#$%^&*()";
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			
			if(ch>65&&ch<90||ch>96&&ch<122) {
				System.out.print(ch);
			}
			
		}
	}

}
