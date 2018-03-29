public class LinkedList{
	public static ListElement<Integer> insertAtTop(ListElement<Integer> list, int data){
		ListElement<Integer> head = list;
		ListElement<Integer> elem = new ListElement<Integer>(data);
		elem.setNext(list);
		head = elem;
		return head;
	}

	public static ListElement<Integer> insertAfter(ListElement<Integer> list, int data, int i){
		if(i==0){
			return insertAtTop(list,data);
		}
		int length = 0;
		ListElement<Integer> head = list;
		while(list != null){
			length++;
			list = list.next();
		}
		list = head;
		if(i > length-1){
			return list;
		}
		for(int j=0;j<i;j++){
			list = list.next();			
		}
		ListElement<Integer> newElem = new ListElement<Integer>(data);
		newElem.setNext(list.next());
		list.setNext(newElem);
		return head;
		
	}

	public static void main(String[] args){
		ListElement<Integer> list = new ListElement<Integer>(5);
		//case_insertAtTop(list);
		case_insertAfter(list);
	}

	public static void case_insertAtTop(ListElement<Integer> list){
		printLinkedList(list);
		list = insertAtTop(list,10);
		list = insertAtTop(list,90);
		list = insertAtTop(list,60);
		printLinkedList(list);
	}
	public static void case_insertAfter(ListElement<Integer> list){
		printLinkedList(list);
		list = insertAfter(list,2,0);
		list = insertAfter(list,4,1);
		list = insertAfter(list,6,1);
		list = insertAfter(list,7,2);
		printLinkedList(list);
	}

	public static void printLinkedList(ListElement<Integer> list){
		ListElement<Integer> head = list;
		while(head != null){
			System.out.print(" "+head.value());
			head = head.next();
		}
		System.out.println("");
	}
}
		


