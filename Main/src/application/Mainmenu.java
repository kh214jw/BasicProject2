package application;
import java.util.ArrayList;
import java.util.List;

public class Mainmenu {

	public static void main(String[] args) {
		String[][] menu = {
				{"�Ƹ޸�ī��", "3000"}, {"ī���" , "5000"},
				{"�ٴҶ��", "5000"}, {"ȭ��Ʈ��ī", "5000"},
				{"�����̵�", "4000"}, {"�ڸ����̵�", "4000"},
				{"������Ʈ", "6000"}, {"ġ������ũ", "6000"},
				{"��������ũ", "6000"}, {"��������ũ", "7000"}
		};
		
		//����ȣ, ��, �� (fx�� �ޱ�)
		String phone = "010-9918-6657";
		int time1 = 12;
		int time2 = 50;
		
		//[�ֹ��Ϸ� ����]������ ����
		MenuList order = new MenuList();
		User newUser = new User(phone, time1, time2);
		
		System.out.println("�޴���ȭ: "+newUser.getPhone());
		System.out.println("�ð�(��): "+newUser.getTime1()+"��");
		System.out.println("�ð�(��): "+newUser.getTime2()+"��");
/*		
		�߰��ϱ� ������(number)
		insertMenuNode(number, menu[number][0], menu[number][0], newUser)

		�����ϱ� ������(number)
		deleteMenuNode(number)
			
		+������(number, price)
		countPlus(number, menu[number][1])
		
		-������(number, price)
		
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
