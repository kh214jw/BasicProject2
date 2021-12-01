package application;

public class MenuList{
	private MenuNode head;
	private MenuNode tail;

	public MenuList() { 
		this.head = null;
		this.tail = null;
	}

	//�޴�Ž��(�޴��� ��ȣ�� ����) - Ž�� ���� ����� �� ��� return(������ ����� ����)
	public MenuNode searchNode(int number) {
		//head�� null�̸� ���0��
		if(head == null) return null;
		MenuNode preNode = head; 	
		MenuNode tempNode = head.next;
		
		//��尡 1���� ���(head��常 ����)
		if(tempNode == null) { 
			if(number == head.getNum())  return head; //��ġ�� return head 
			else	return null;					//����ġ�� Ž�� ���� return null
		}
		
		while(tempNode != null) {
			//��ġ�ϴ� ��� (���� ��� ����) return preNode
			if(number== tempNode.getNum()) return preNode;  //��ġ�ѳ����(�� ���)
			preNode = tempNode;
			tempNode = tempNode.next;			
		}
		return null;  //����� ��尡 ���� ���, Ž���� ������ ���
	}
	
	//�޴��߰�
	public void insertMenuNode(int number, String name, int price, User user) { 
		MenuNode findNode = searchNode(number); //��� Ž�����
		//��ġ�ϴ� ��� ����	
		if(findNode != null){
			if(findNode == head) {
				head.setmCount(1);
				head.setmPrice(price);
			}else {
				findNode.next.setmCount(1);
				findNode.next.setmPrice(price);
			}
		}
		//������ ������(���ο� ��带 �߰�)
		else {
			MenuNode newNode = new MenuNode(number, name, price);
			//��� 0���� ���(ù ��� ����)
			if(head == null){  
				//������
				head = newNode;
				tail = head;
			}
			//���ο� ��� �߰��� ���
			else {           //���ο� ��� �߰�
				tail.next = newNode;
				tail = tail.next;
			}
		}
	}
	
	//�޴�����
	public void deleteMenuNode(int number) {
		if(searchNode(number) == head) head = null; //���1���� ���
		else searchNode(number).next = searchNode(number).next.next; //���2���̻��� ���
	}

	//(+)���� �߰�
	public void countPlus(int number, int price) {
		MenuNode findNode = searchNode(number);
		findNode.next.setmCount(findNode.next.getmCount()); 
		findNode.next.setmPrice(price);
	}
	
	//(-)���� ����
	public void countMinus(int number, int price) {
		MenuNode findNode = searchNode(number);
		findNode.next.setmCountMinus(findNode.next.getmCount());
		if(findNode.next.getmCount() == 0)
			 deleteMenuNode(number);
		findNode.next.setmPriceMinus(price);
	}
	
	public void printMenu() {
		MenuNode tempNode = this.head; 
		while(tempNode != null) {
			System.out.println(tempNode.mName+"\t"+tempNode.mCount+"\t"+ tempNode.mPrice);
			tempNode = tempNode.next;
		}
	}
}
