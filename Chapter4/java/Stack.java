public class Stack<T>{
	ListElement<T> head;

	public Stack(){
		head = null;
	}
	
	public boolean push(T data){
		if(head == null){
			head = new ListElement<T>(data);
			return true;
		}
		ListElement<T> element = new ListElement<T>(data);
		element.setNext(head);
		head = element;
		return true;
	}
	
	public T pop() throws Exception {
		if (head == null){
			throw new Exception("Unable to pop from emptry stack");
		}
		T data = head.value();
		head = head.next();
		return data;
	}
	
	public String toString(){
		ListElement<T> elem = head; 
		StringBuffer strBfr = new StringBuffer();
		while (elem!=null){
			strBfr.append(" "+elem.value());
			elem = elem.next();
		}
		strBfr.append("\n");
		return strBfr.toString();
	}

}
