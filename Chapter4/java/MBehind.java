public class MBehind{

	public static ListElement mBehindToListEnd(ListElement<Integer> element,int m){
		ListElement<Integer> current,mBehind;
		if(element == null){
			return null;
		}
		current = element;
		for(int i=0;i<m;i++){
			if(current.next() !=null){
				current= current.next();
			}
			else{
				return null;
			}
		}
		mBehind = element;
		while(current.next()!=null){
			current = current.next();
			mBehind = mBehind.next();
		}
		return mBehind;
	}
		
	public static void main(String[] args){

		ListElement<Integer> head = new ListElement(0);
		ListElement<Integer> one = new ListElement(1);
		ListElement<Integer> two = new ListElement(2);
		ListElement<Integer> three = new ListElement(3);
		ListElement<Integer> four = new ListElement(4);
		ListElement<Integer> five = new ListElement(5);

		head.setNext(one);
		one.setNext(two);
		two.setNext(three);
		three.setNext(four);
		four.setNext(five);
		System.out.println("The element is "+mBehindToListEnd(head,7).value());
	}
}

