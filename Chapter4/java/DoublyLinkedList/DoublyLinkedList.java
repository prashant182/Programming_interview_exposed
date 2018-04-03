public class DoublyLinkedList<T>{
	public Node<T> head; 
	public Node<T> tail = head;
	
	public boolean addNext(T data){
		if(head == null){
			head = new Node<T> (data);
			return true;
		}
		Node<T> node = new Node<T>(data);
		if (head.next == null){
			head.next=node;
			node.prev=head;
			tail=node;
			return true;
		}
		Node<T> current = head;
		while(current.next!=null){
			current=current.next;
		}
		current.next = node;
		tail = node;
		node.prev = current;
		return true;
	}
	public boolean addNextTo(Node<T> left, T data){
		if(left == null){
			return false;
		}
		Node<T> node = new Node<T>(data);
		left.next = node;
		node.prev = left;
		return true;
	}

	public boolean addChild(Node<T> parent,T data){
		if(parent.child!=null){
			return false;
		}
		Node<T> child = new Node<T>(data);
		parent.child = child;
		return true;
	}

	public boolean flattenList(){
		Node<T> current = head;
		while(current.next != null){
			if(current.child != null){
				tail.next = current.child;
				current.child.prev = tail;
				while(tail.next!=null){
					tail = tail.next;
				}
			}
			current = current.next;
		}
		return true;
	}
	
	public void print(){
		Node<T> current = head;
		while(current != null){
			System.out.print(" "+current.data);
			current = current.next;
		}
		System.out.println();
		System.out.println("Head = "+head.data);
		System.out.println("Tail = "+tail.data);
	}

}






