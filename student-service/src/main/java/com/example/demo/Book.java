package com.example.demo;




public class Book {
  int BookId;
  String BookName;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int bookId, String bookName) {
	super();
	BookId = bookId;
	BookName = bookName;
}
public int getBookId() {
	return BookId;
}
public void setBookId(int bookId) {
	BookId = bookId;
}
public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	BookName = bookName;
}
@Override
public String toString() {
	return "Book [BookId=" + BookId + ", BookName=" + BookName + "]";
}
  
  
}
