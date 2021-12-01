package application;

public class MenuNode {
	String mName;
	int mNum;
	int mCount;
	int mPrice;
	public MenuNode next;
	
	//���ο� �ֹ���� �߰�, ù ��� �߰�
	public MenuNode(int number, String name, int price) {
		this.mNum = number;
		this.mName = name;
		this.mCount = 1;
		this.mPrice = price;
		this.next = null;
	}
	
	
	public int getmCount() {
		return mCount;
	}
	public void setmCount(int count) {
		this.mCount+=1;
	}
	public void setmCountMinus(int count) {
		this.mCount-=1;
	}
	public int getmPrice() {
		return mPrice;
	}
	public void setmPrice(int price) {
		this.mPrice += price;
	}
	
	public void setmPriceMinus(int price) {
		this.mPrice-=price;
	}
	
	public String getName() {
		return mName;
	}

	public int getNum() {
		return mNum;
	}
}
