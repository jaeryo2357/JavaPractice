package Practice4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Practice4_2 {

	
	 static void addIntegersToList(List<Integer> list,int count)
	 {
		 for(int i=0;i<count;++i)
		 {
			 list.add(i);
		 }
		 
	 }
	 
	 static void removeOddNumvers(List<Integer> list) {
		 Iterator<Integer> iterator=list.iterator();
		 while(iterator.hasNext()) {
			 int i=iterator.next();
			 if(i%2==1)iterator.remove();
		 }
	 }
	 
	 static void printList(List<Integer> list) {
		 for(int i : list)
			 System.out.printf("%d",i);
		 System.out.println();
	 }
	 
	 static void doSomething(List<Integer> list) {
		 addIntegersToList(list,20);
		 removeOddNumvers(list);
		 printList(list);
	 }
	 
	 public static void main(String[] args) {
		 doSomething(new ArrayList<Integer>());
		 doSomething(new LinkedList<Integer>());
	 }
}
