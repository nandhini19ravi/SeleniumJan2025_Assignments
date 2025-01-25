package week2.day1;

public class Library {
	String bookTitle;
	public String addBook(String bookTitle2) {
		return bookTitle2;
	}
	public void issueBook() {
		System.out.println(bookTitle+" Book issued successfully");
	}
	public static void main(String[] args) {
		Library lib = new Library();
		lib.bookTitle = "Twilight";
		String book = lib.addBook("Breaking Dawn");
		System.out.println(book+" Book added successfully");
		lib.issueBook();
	}
}
