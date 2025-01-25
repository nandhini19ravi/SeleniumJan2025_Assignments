package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		Library obj = new Library();
		obj.bookTitle = "Two States";
		String add = obj.addBook("Revolution 2020");
		System.out.println(add+" Book added to library");
		obj.issueBook();

	}

}
