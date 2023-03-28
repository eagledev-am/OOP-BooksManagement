# OOP-BooksManagement
An OOP task
## About Task
#### Implement class Book that has next properties
```
int id - unique identifier
String name - name of a book
Author[] authors - array of authors
Publisher publisher - book publisher
int publishingYear - year of publishing
int amountOfPages - amount of pages
BigDecimal price - price of a book
CoverType coverType - type of book binding, enum (Paperback, Hardcover)

```
#### Implement Author class that has next properties
```
int id - unique identifier
String firstName - author’s first name
String lastName - author’s last name
```
#### Implement Publisher class that has next properties:
```
int id - unique identifier
String publisherName - name of a publisher

```
#### Constraints 
```
Implement multiple constructors for Book, Author and Publisher class.

Implement enum type CoverType with two enums - Paperback and Hardcover

Override toString methods for Book, Author and Publisher class.

```
#### Implement class BookService with the next methods
```
public Book[] filterBooksByAuthor(Author author, Book[] books) {
	<write your code here>
}

public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
	<write your code here>
}

// methods keeps books with publishing year inclusively. 
public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
	<write your code here>
}
```
#### Implement a Demo class that has the main method
In demo class perform next actions:

1- Create an array of books. You can use the next variable for demo purposes. 
```
Book[] books = new Book[] {
new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),

new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),

new Book(3, "Book_3", new Author[] { new Author(3, "Walter", "Peterson") }, new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),


new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK) };

```
2- Create an instance of the BookService type and demonstrate the work of BookService methods, namely - filterBooksByAuthor, filterBooksByPublisher, filterBooksAfterSpecifiedYear



