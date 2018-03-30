public class Program{
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		try{
			System.out.println("Pop from the stack is "+stack.pop());
		} catch(Exception e){
			System.out.println("Trace"+e.toString());
		}
		//stack.push(10);
		//stack.push(20);
		//stack.push(30);
		System.out.println("The final version of the stack is "+stack);
	}
}
