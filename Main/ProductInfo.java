package jiho;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.*;
import constant.Operation;

public class ProductInfo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		selectOperation(s);		
	}
	
	private static void selectOperation(Scanner s) {
		boolean isInfinitWhile = true;
		List<Product> products = new ArrayList<Product>();
//		왜 배열보다 리스트? >> 리스트에서 제공하는 함수가 프로그래밍에 편리하다 예를들면 아래 get(), add()같은것 		
		
		while(isInfinitWhile) {
			System.out.println("상품 추가(1), 모든 상품 조회(2), 끝내기(3)>> ");
			int currentOpertaion = s.nextInt();
			
			switch (currentOpertaion) {
			case Operation.ADD_PRODUCT:
				products.add(selectOperationModel(s));
				
				break;
			case Operation.SHOW_ALL:
				for (int i = 0; i < products.size(); i++) {
					products.get(i).showAllProperty();
				}
				
				break;
			case Operation.FINISH_PROGRAM:
				isInfinitWhile = false;
				break;
			}
		}
		
	}
	
	private static Product selectOperationModel(Scanner s) {	//이 작업은 Productinfo 내에서만 쓰인다는 뜻으로 private을 씀ㅎ, product타입으로 변환한다. =>> 메소드에 반환값 타입이 필요한데 북이든 컴팩트든 컨벌세이션의 조상인 프로덕트를 쓰면 에러가 안난다
		System.out.println("상품 종류 책(1), 음악CD(2), 회화책(3)>> ");
		int currentOpertaion = s.nextInt();
		Product addedProduect = null;	//널값으로 초기화하는 이유> 혹시모를 자바내에서의 오류를 막기위ㅎ함, 어떤타입인지 명시적으로 보여줌	
		
		switch (currentOpertaion) {
		case Operation.BOOK:
			Book tempBook = new Book();
			tempBook.addBook();
			addedProduect = tempBook;
			break;
			
		case Operation.DISC:
			CompactDisc tempCompactDisc = new CompactDisc();
			tempCompactDisc.addCompactDisc();
			addedProduect = tempCompactDisc;
			break;
			
		case Operation.CONVERSTAION_BOOK:
			ConversationBook tempConversationBook = new ConversationBook();
			tempConversationBook.addConversationBook();
			addedProduect = tempConversationBook;
			break;
		}
		
		return addedProduect;
	}
	
}
