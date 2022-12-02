package polymorphismeandinterfaceassignment;

import polymorphismeandinterfaceassignment.models.AdultUser;
import polymorphismeandinterfaceassignment.models.BookType;
import polymorphismeandinterfaceassignment.models.KidsUser;
import polymorphismeandinterfaceassignment.models.LibraryUser;

public class MainRunner {

	public static void main(String[] args) {
		
		System.out.println("User = Kid , Age = 10, request = Kids");
		LibraryUser kidsUser1 = new KidsUser();
		System.out.println(kidsUser1.registerAccount(10));
		System.out.println(kidsUser1.requestABook(BookType.KIDS));
		
		System.out.println("User = Kid , Age = 18, request = Fiction ");
		LibraryUser kidsUser2 = new KidsUser();
		System.out.println(kidsUser2.registerAccount(18));
		System.out.println(kidsUser2.requestABook(BookType.FICTION));
		
		System.out.println("User = Adult , Age = 5, request = Kids");
		LibraryUser adultUser1 = new AdultUser();
		System.out.println(adultUser1.registerAccount(5));
		System.out.println(adultUser1.requestABook(BookType.KIDS));
		
		System.out.println("User = Kid , Age = 23, request = Fiction ");
		LibraryUser adultUser2 = new AdultUser();
		System.out.println(adultUser2.registerAccount(23));
		System.out.println(adultUser2.requestABook(BookType.FICTION));


	}

}
