package Com.ExPrograms;

import java.util.Arrays;
import java.util.List;

public class day10 {
public static void main(String[] args) {
	String s[]= {"mani","ram","ravi"};
	List<String> a=Arrays.asList(s);
	System.out.println(a);
	a.add("ganesh");
	a.add("suresh");
	System.out.println(a);
}
}
