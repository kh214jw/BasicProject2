package application;

public class Menu<E> {
	String mName;
	int mNum;
	int mCount;
	int mPrice;
	
	public Menu(String name, int count, int price) {
		this.mName = name;
		this.mCount = count;
		this.mPrice = price*count;
	}
	
	public String getM_name() {
		return mName;
	}
	public int getCount() {
		return mCount;
	}
	
	public int getPrice() {
		return mPrice;
	}
}
