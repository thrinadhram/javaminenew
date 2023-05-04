package Com.ExPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class day9 {

	public static void main(String[] args)
	{
		ArrayList<Integer> duplicate= new ArrayList<Integer>();
		duplicate.add(1);
		duplicate.add(2);
		duplicate.add(3);
		duplicate.add(1);
		System.out.println(duplicate);
		TreeSet<Integer>set=new TreeSet<Integer>(duplicate);
		ArrayList<Integer>duplicate1=new ArrayList<Integer>(set);
		System.out.println(duplicate1);

	}

}
