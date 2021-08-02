import java.util.*;
public class Arraycopy {

	public static void main(String[] args) {
		
			      ArrayList<String> al = new ArrayList<String>();

			      //Adding elements to the ArrayList
			      al.add("sobha");
			      al.add("raju");
			      al.add("ravi");

			      System.out.println("ArrayList Elements are: "+al);

			      //Adding elements to a List
			      List<String> list = new ArrayList<String>();
			      list.add("arjun");
			      list.add("rani");
			      list.add("pooja");
			      //Adding all elements of list to ArrayList using addAll
			      al.addAll(list);
			      System.out.println("Updated ArrayList Elements: "+al);
			   }
			}
			

	
