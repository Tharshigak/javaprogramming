package stackconcept;
import java.util.Stack;
public class StackBasics {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		System.out.println("peek: "+s.peek());
		System.out.println("pop: "+s.pop());
		System.out.println("After pop: "+s);
		System.out.println(s.empty());
		s.add(5);
		System.out.println(s);
        //s.clear();
		System.out.println(s.capacity());
	}

}
