package Model;

import Model.Book;

public class ConversationBook extends Book{
	private String language;

	public void addConversationBook() {
		this.addBook();
		
		System.out.println("언어>> ");
		this.language = this.s.next();
	}

	@Override
	public void showAllProperty() {
		System.out.println("상품 ID>>"+this.getId());
		System.out.println("상품 설명>>"+this.getExplain());
		System.out.println("생산자>>"+this.getMaker() );
		System.out.println("가격>>"+this.getPrice() );
		
		System.out.println("ISBN>>"+this.getISBN() );
		System.out.println("저자>>"+this.getAuthor());
		System.out.println("책 이름>>"+this.getBookname());
		
		System.out.println("언어>>"+this.language);
	}
	
//	public String getLanguage() {
//		return language;
//	}

//	public void setLanguage(String language) {
//		this.language = language;
//	}
}
