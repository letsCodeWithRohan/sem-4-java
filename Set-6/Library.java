/* Define a custom exception class BookNotAvailableException that extends Exception.
●	Create a class Library with:
●	An instance variable availableBooks (integer).
●	A method issueBook(int count) that:
o	If count <= availableBooks, reduce the number of books and display "Book issued successfully".
o	Otherwise, throw BookNotAvailableException with the message "Requested books not available".
In the main() method:
●	Initialize the library with 3 available books.
●	Try issuing 2 books (valid).
●	Then try issuing 2 more books (should throw the custom exception).
 */

public class Library {
    public static void main(String[] args) {
        
    }
}