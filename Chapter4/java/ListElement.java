public class ListElement<T>{
	private ListElement<T> next;
 	private	T data;

	public ListElement(T data){
		this.data = data;
		this.next = null;
	}

	public T value(){
		return this.data;
	}

	public ListElement<T> next(){
		return this.next;
	}

	public void setValue(T data){
		this.data = data;
	}

	public void setNext(ListElement<T> element){
		this.next = element;
	}
}

