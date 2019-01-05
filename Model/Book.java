package Model;

import Model.Product;		//Product클래스가 어디 있는지 알기 위함

public class Book extends Product{
	private int ISBN;
	private String author;
	private String bookname;
	
	public void addBook() {
		this.addProduct();
		
		System.out.println("ISBN>> ");
		this.ISBN = this.s.nextInt();
		System.out.println("저자>> ");
		this.author = this.s.next();
		System.out.println("책 이름>> ");
		this.bookname = this.s.next();
	}
	
	@Override
	public void showAllProperty() {
		this.showProduct();
		
		System.out.println("ISBN>>"+this.ISBN );
		System.out.println("저자>>"+this.author);
		System.out.println("책 이름>>"+this.bookname);
	}
	
	
	public int getISBN() {
		return ISBN;
	}
//	public void setISBN(int iSBN) {
//		ISBN = iSBN;
//	}
	public String getAuthor() {
		return author;
	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
	public String getBookname() {
		return bookname;
	}
//	public void setBookname(String bookname) {
//		this.bookname = bookname;
//	}

}
