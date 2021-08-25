import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DelBook {

	
		private List<Book> collection;

		public DelBook(){
			collection = new ArrayList<Book>();
		}
		public void removeBook(Book book){
	collection.remove(book);
	}
	@Override
		public String toString() {
			String total = "\n";
			/*
			for (int i=0; i<collection.size(); i++){
				Book b = collection.get(i);
				total = total + b.toString();
				
			}
			*/
			Iterator<Book> i = collection.iterator();
			while(i.hasNext()){
				Book b = (Book) i.next();
				total = total + b.toString();
			}
			return total;
		}

	}



