package libraryOOP;

public class Main {
    public static void main(String[] args) {
         Library myLibrary = new Library();

         																																								
        myLibrary.addBook(new Book("Profitable Paradigms: Unleashing Success in Changing Markets", "Stephanie Chen", 2019));
        myLibrary.addBook(new Book("Leadership in the Digital Age: Navigating Disruption with Confidence", "David Robertson", 2020));
        myLibrary.addBook(new Book("From Startup to Success: Building a Thriving Business", "Jennifer Lee", 2018));

        
        System.out.println("Books in the library:");
        for (Book book : myLibrary.getBooks()) {
            System.out.println(book);
        }
    }
}