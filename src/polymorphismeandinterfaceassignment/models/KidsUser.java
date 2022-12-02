package polymorphismeandinterfaceassignment.models;

public class KidsUser implements LibraryUser{

	@Override
	public String registerAccount(int age) {
		if (age <=11) {
			return "You have successfully registred under a kids account";
		}
		return "Sorry, age must be less than 12 to register as a kid";
		
	}

	@Override
	public String requestABook(BookType bookType) {
		if (bookType.equals(BookType.KIDS)) {
			return "Book Issued successfully, please return the book within 10 days";
		}
		return "Oops, you are allowed to take only kids books";
	}

}
