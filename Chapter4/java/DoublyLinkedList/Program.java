public class Program{
	public static void main(String[] args){
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		list.addNext(5);
		list.addNext(33);
		list.addNext(17);
		list.addNext(2);
		list.addNext(1);
		list.addChild(list.head,6);
		list.addNextTo(list.head.child,25);
		list.addNextTo(list.head.child.next,6);
		list.addChild(list.head.child.next,8);
		list.addChild(list.head.child.next.next,9);
		list.addChild(list.head.child.next.next.child,7);
		list.addChild(list.tail.prev,2);
		list.addChild(list.tail.prev.child,12);
		list.addChild(list.tail.prev.child.child,21);
		list.addNextTo(list.tail.prev.child,7);
		list.addNextTo(list.tail.prev.child.child,5);
		list.addNextTo(list.tail.prev.child.child.child,3);
		list.flattenList();
		list.print();
	}
}

