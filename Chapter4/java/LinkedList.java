//package java;

public class LinkedList{
	public static ListElement<Integer> insertAtTop(ListElement<Integer> list, int data){
		ListElement<Integer> head = list;
		ListElement<Integer> elem = new ListElement<Integer>(data);
		elem.setNext(list);
		head = elem;
		return head;
	}
	public static void main(String[] args){
		ListElement<Integer> list = new ListElement<Integer>(5);
		printLinkedList(list);
		list = insertAtTop(list,10);
		list = insertAtTop(list,90);
		list = insertAtTop(list,60);
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
		


