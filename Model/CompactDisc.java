package Model;

import Model.Product;

public class CompactDisc extends Product{
	private String discname;
	private String singername;
	
	public void addCompactDisc() {
		this.addProduct();
		
		System.out.println("举裹 力格>> ");
		this.discname = this.s.next();
		System.out.println("啊荐>> ");
		this.singername = this.s.next();
	}
	
	@Override
	public void showAllProperty() {
		this.showProduct();
		
		System.out.println("举裹 力格>>"+this.discname);
		System.out.println("啊荐>>"+this.singername);
	}
	
//	public String getDiscname() {
//		return discname;
//	}
//	public void setDiscname(String discname) {
//		this.discname = discname;
//	}
//	public String getSingername() {
//		return singername;
//	}
//	public void setSingername(String singername) {
//		this.singername = singername;
//	}	
}
