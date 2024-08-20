package SetOperations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTypes {

	public static void main(String[] args) {
		
		Set<Integer>hashset=new HashSet<Integer>();
		Set<Integer>linkedhashset=new LinkedHashSet<>();
		Set<Integer>treeset=new TreeSet<>();
		System.out.println("set adding hashset");
		addElements(hashset);
		System.out.println("set adding linkedhashset");
		addElements(linkedhashset);
		System.out.println("set adding treeset");
		addElements(treeset);
		System.out.println("set removing hashset");
		removeElements(hashset);
		System.out.println("set removing linkedhashset");
		removeElements(linkedhashset);
		System.out.println("set removing treeset");
		removeElements(treeset);
		System.out.println("checking the element");
		CheckElements(hashset);
		CheckElements(linkedhashset);
		CheckElements(treeset);
		
	}
	private static void addElements(Set<Integer> set)
	{
		set.add(20);
		set.add(40);
		set.add(30);
		set.add(80);
		set.add(50);
		set.add(40);
		System.out.println("set addition "+set);
	}
	
	private static void removeElements(Set<Integer> set)
	{
//		set.remove(20);
//		set.remove(40);
//		set.remove(30);
//		set.remove(20);
		
		Iterator<Integer> ir=set.iterator();
		while(ir.hasNext())
		{
			Integer value=ir.next();
			if(value % 20==0)
			{
				ir.remove();
			}
		}
		System.out.println("set Removal "+set);
	}
	private static void CheckElements(Set<Integer> set)
	{
		if(set.contains(30))
		System.out.println(set+"elemnt is present");
		else
		System.out.println(set+"element is not present");
	}
	
}
