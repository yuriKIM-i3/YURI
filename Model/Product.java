package Model;

import java.util.Scanner;

public class Product {
	protected int id;
	protected String explain;
	protected String maker;
	protected int price;
	
	protected Scanner s;
	
    public Product() {
    	this.id = 0;
    	this.s = new Scanner(System.in);		//앞으로도 쓰이기 때문에 생성자에 넣어둠  다시 타자칠필요 없음  (드라이원칙)
    }
	
	public void addProduct() {
		this.id++;
		
		System.out.println("상품 설명>> ");
		this.explain = this.s.next();
		System.out.println("생산자>> ");
		this.maker = this.s.next();
		System.out.println("가격>> ");
		this.price = this.s.nextInt();
	}
	
	public void showProduct() {
		System.out.println("상품 ID>>"+this.id);
		System.out.println("상품 설명>>"+this.explain);
		System.out.println("생산자>>"+this.maker );
		System.out.println("가격>>"+this.price );
	}
	
	public void showAllProperty() {
		
	}
	
	
	public int getId() {
		return id;
	}
	//리펙토리 과정 중 셋아이디는 필요없을거같아서 지웁니다 ㅎ
//	public void setId(int id) {
//		this.id = id;
//	}
	
	public String getExplain() {
		return explain;
	}
//	public void setExplain(String explain) {
//		this.explain = explain;
//	}
	public String getMaker() {
		return maker;
	}
//	public void setMaker(String maker) {
//		this.maker = maker;
//	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
}
