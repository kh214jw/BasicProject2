package application;

public class MenuList{
	private MenuNode head;
	private MenuNode tail;

	public MenuList() { 
		this.head = null;
		this.tail = null;
	}

	//메뉴탐색(메뉴의 번호를 전달) - 탐색 성공 노드의 전 노드 return(삭제시 사용을 위해)
	public MenuNode searchNode(int number) {
		//head가 null이면 노드0개
		if(head == null) return null;
		MenuNode preNode = head; 	
		MenuNode tempNode = head.next;
		
		//노드가 1개인 경우(head노드만 존재)
		if(tempNode == null) { 
			if(number == head.getNum())  return head; //일치시 return head 
			else	return null;					//불일치시 탐색 실패 return null
		}
		
		while(tempNode != null) {
			//일치하는 경우 (이전 노드 리턴) return preNode
			if(number== tempNode.getNum()) return preNode;  //일치한노드의(전 노드)
			preNode = tempNode;
			tempNode = tempNode.next;			
		}
		return null;  //저장된 노드가 없는 경우, 탐색에 실패한 경우
	}
	
	//메뉴추가
	public void insertMenuNode(int number, String name, int price, User user) { 
		MenuNode findNode = searchNode(number); //노드 탐색결과
		//일치하는 노드 존재	
		if(findNode != null){
			if(findNode == head) {
				head.setmCount(1);
				head.setmPrice(price);
			}else {
				findNode.next.setmCount(1);
				findNode.next.setmPrice(price);
			}
		}
		//동일한 노드없음(새로운 노드를 추가)
		else {
			MenuNode newNode = new MenuNode(number, name, price);
			//노드 0개인 경우(첫 노드 삽입)
			if(head == null){  
				//꼬리와
				head = newNode;
				tail = head;
			}
			//새로운 노드 추가인 경우
			else {           //새로운 노드 추가
				tail.next = newNode;
				tail = tail.next;
			}
		}
	}
	
	//메뉴삭제
	public void deleteMenuNode(int number) {
		if(searchNode(number) == head) head = null; //노드1개인 경우
		else searchNode(number).next = searchNode(number).next.next; //노드2개이상인 경우
	}

	//(+)수량 추가
	public void countPlus(int number, int price) {
		MenuNode findNode = searchNode(number);
		findNode.next.setmCount(findNode.next.getmCount()); 
		findNode.next.setmPrice(price);
	}
	
	//(-)수량 감소
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
