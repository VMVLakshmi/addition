import java.util.*;
public class Arrayupdate {

	public static void main(String[] args) {
		 
			    ArrayList<Integer> arraylist = new ArrayList<Integer>();
			    arraylist.add(1);
			    arraylist.add(2);
			    arraylist.add(3);
			    arraylist.add(4);
			    arraylist.add(5);
			    arraylist.add(6);
			    arraylist.add(7);
			    System.out.println("ArrayList before update: "+arraylist);
			    //Updating 1st element
			    arraylist.set(0, 11);
			    //Updating 2nd element
			    arraylist.set(1, 22);
			    //Updating 3rd element
			    arraylist.set(2, 33);
			    //Updating 4th element
			    arraylist.set(3, 44);
			    System.out.println("ArrayList after update: +arraylist");

	}

}