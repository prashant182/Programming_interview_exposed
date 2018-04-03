public class Node<T> {
	Node<T> next;
	Node<T> prev;
	Node<T> child;
	T data;

	public Node(){
		this.data=null;
		this.next=null;
		this.prev=null;
		this.child=null;
	}	

	public Node(T data){
		this.data = data;
		this.next = null;
		this.prev = null;
		this.child = null;
	}
}
