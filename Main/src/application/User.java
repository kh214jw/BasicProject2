package application;

public class User {
	String phone; //���ڸ�4��
	int time1; //�� 9~17 
	int time2; //�� 0~59
	public MenuNode link;
	
	 public User(String phone, int time1, int time2){
		  this.phone = phone;
		  this.time1 = time1;
		  this.time2 = time2;
		  this.link = null;
	 }
	 
	 public String getPhone(){
		 return phone;
	 }
	 public int getTime1(){
		 return time1;
	 }
	 public int getTime2(){
		 return time2;
	 }
}