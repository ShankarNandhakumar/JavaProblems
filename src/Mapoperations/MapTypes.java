package Mapoperations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypes {

	public static void main(String[] args) {
		Map<Integer, String> hashmap=new HashMap<>();
		Map<Integer, String> linkedhashmap=new LinkedHashMap<>();
		Map<Integer, String> treemap=new TreeMap<>();
		
		System.out.println("Adding Elements");
		long hmp=MapTypes.addElement(hashmap);
		System.out.println("addition of hashmap"+hmp+"ns");

		long lmp=MapTypes.addElement(linkedhashmap);
		System.out.println("addition of Linkedhashmap"+lmp+"ns");

		long tmp=MapTypes.addElement(treemap);
		System.out.println("addition of Treemap"+tmp+"ns");
		
		System.out.println("Retriving elements");
		long rhmp=MapTypes.retriveElement(hashmap);
		System.out.println("Retrival of hashmap"+rhmp+"ns");
		
		long rlmp=MapTypes.retriveElement(linkedhashmap);
		System.out.println("Retrival of hashmap"+rlmp+"ns");
		
		long rtmp=MapTypes.retriveElement(treemap);
		System.out.println("Retrival of treemap"+rtmp+"ns");
		
	}

	private static long addElement(Map<Integer, String> map)
	{
		long startime=System.nanoTime();
		for(int i=0;i<=1000;i++)  
		{									
			map.put(i, "val");
		}
		long endtime=System.nanoTime();
		return endtime-startime ;
		
	}
	private static long retriveElement (Map<Integer,String> map)
	{
		if(map.isEmpty())
			map.put(3, "three");
		
			for(int i=0;i<=1000;i++)
			{
			map.put(i, "value");	
		}
		long startime=System.nanoTime();
		for(int i=0;i<=1000;i++)
		{
			map.get(i);
		}
		long endtime=System.nanoTime();
		return endtime-startime;
		
	}
	//map.put(1,"one");
	//map.put(2,"two");
	//map.put(3,"three");
	//map.put(4,"four");
	
}
