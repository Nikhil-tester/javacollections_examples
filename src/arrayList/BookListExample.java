package arrayList;

import java.util.ArrayList;

public class BookListExample {

	public static void main(String[] args) {
		
		Book b1= new Book(11, "Art of Leaving", "H C Varma", "H C Varma", 8);
		Book b2= new Book(12, "Dont Quit", "Tom Harryiesn", "Gupta copier", 12);
		Book b3= new Book(13, "I M possiable", "Rechard", "john copier", 14);
		
		ArrayList<Book> arr=new ArrayList<Book>();
		arr.add(b1);
		arr.add(b2);
		arr.add(b3);
		
		for(Book it:arr) {
			System.out.println(it.id+" , "+it.bookName+" , "+it.author+" , "+it.publisher+" , "+it.quantity);
		}
		

	}

}
