package ListOperations;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTypes {
    public static void main(String[] args) {
      
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();

        // Measure and print performance of adding elements
        System.out.println("Adding Elements");
        long arraylist = addElemets(arrayList);
        System.out.println("ArrayListAdd: " + arraylist + " ns");

        long linkedlist = addElemets(linkedList);
        System.out.println("LinkedListAdd: " + linkedlist + " ns");

        long vectortime = addElemets(vector);
        System.out.println("VectorAdd: " + vectortime + " ns");

        
       // Measure and print performance of removing elements
       
        System.out.println("Removing Elements ");
        long arraylistremove = removeElements(arrayList);
        System.out.println("ArrayListRemoveal: " + arraylistremove + " ns");

        long linkedlistremove = removeElements(linkedList);
        System.out.println("LinkedListRemoveal: " + linkedlistremove + " ns");

        long vectorRemove =removeElements(vector);
        System.out.println("VectorRemoveal: " + vectorRemove + " ns");

        // Measure and print performance of sorting elements
        System.out.println("Sorting Elements");
        long arrayListSortTime = sortElements(arrayList);
        System.out.println("ArrayListSort: " + arrayListSortTime + "ns");

        long linkedListSortTime = sortElements(linkedList);
        System.out.println("LinkedListSort: " + linkedListSortTime + "ns");

        long vectorSortTime = sortElements(vector);
        System.out.println("VectoSort: " + vectorSortTime + "ns");
    }

    private static long addElemets(List<Integer> list) {
      
        long startTime = System.nanoTime();
        for(int i=0;i<=10;i++)
        {
        	list.add(i);
        }
      
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static long removeElements(List<Integer> list) {
    	
        long startTime = System.nanoTime();
        for (int i = 9; i >= 2; i--) {
            list.remove(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static long sortElements(List<Integer> list) {
        long startTime = System.nanoTime();
        Collections.sort(list);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}


