package polymorphismeandinterfaceassignment.models;

public class AdultUser implements LibraryUser {

	@Override
	public String registerAccount(int age) {
		if (age >= 12) {
			return "You have successfully registered under an Adult Account";
		}		
		return "Sorry, Age must be greater than 12 to register as an adult";
	}

	@Override
	public String requestABook(BookType bookType) {
		if (bookType.equals(BookType.FICTION)) {
			return "Book Issued successfully, please return the book within 7 days";
		}
		
		return "Oops, you are allowed to take only adult Fiction books" ;
	}

}
