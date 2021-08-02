import java.util.*;
public class linkedaddend {

	public static void main(String[] args) {
		 LinkedList<String> linkedlist = new LinkedList<String>();
		 
		    //Populating it with String values
		    linkedlist.add("AA");
		    linkedlist.add("BB");
		    linkedlist.add("CC");
		    linkedlist.add("DD");
		    linkedlist.add("EE");

		    //Displaying LinkedList elements
		    System.out.println(linkedlist);
		 
		    //Adding an element at the beginning 
		    linkedlist.addFirst("FIRST");
		 
		    //Displaying the List after addition
		    System.out.println(linkedlist);
		 
		    //Adding an element at the end of list 
		    linkedlist.addLast("LAST");
		 
		   System.out.println(linkedlist);

	}

}
