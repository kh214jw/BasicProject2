package application;
import java.util.ArrayList;
import java.util.List;

public class Mainmenu {

	public static void main(String[] args) {
		String[][] menu = {
				{"아메리카노", "3000"}, {"카페라떼" , "5000"},
				{"바닐라라떼", "5000"}, {"화이트모카", "5000"},
				{"레몬에이드", "4000"}, {"자몽에이드", "4000"},
				{"딸기요거트", "6000"}, {"치즈케이크", "6000"},
				{"초코케이크", "6000"}, {"딸기케이크", "7000"}
		};
		
		//폰번호, 시, 분 (fx로 받기)
		String phone = "010-9918-6657";
		int time1 = 12;
		int time2 = 50;
		
		//[주문하러 가기]누르면 실행
		MenuList order = new MenuList();
		User newUser = new User(phone, time1, time2);
		
		System.out.println("휴대전화: "+newUser.getPhone());
		System.out.println("시간(시): "+newUser.getTime1()+"시");
		System.out.println("시간(분): "+newUser.getTime2()+"분");
/*		
		추가하기 누르면(number)
		insertMenuNode(number, menu[number][0], menu[number][0], newUser)

		삭제하기 누르면(number)
		deleteMenuNode(number)
			
		+누르면(number, price)
		countPlus(number, menu[number][1])
		
		-누르면(number, price)
		
*/
	
		order.insertMenuNode(2,menu[2][0], Integer.parseInt(menu[2][1]),newUser);
		order.insertMenuNode(0,menu[0][0], Integer.parseInt(menu[0][1]),newUser);
		order.insertMenuNode(1,menu[1][0], Integer.parseInt(menu[1][1]),newUser);
		order.insertMenuNode(2,menu[2][0], Integer.parseInt(menu[2][1]),newUser);
		order.insertMenuNode(2,menu[2][0], Integer.parseInt(menu[2][1]),newUser);
		order.insertMenuNode(0,menu[0][0], Integer.parseInt(menu[0][1]),newUser);
//		order.insertMenuNode(1,menu[1][0], Integer.parseInt(menu[1][1]),newUser);
//		order.insertMenuNode(2,menu[2][0], Integer.parseInt(menu[2][1]),newUser);
//		order.insertMenuNode(3,menu[3][0], Integer.parseInt(menu[3][1]),newUser);

		order.printMenu();
		
	
	}


}
