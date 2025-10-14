package conditionaloperator;

public class IfElseIfLadder {
	public static void main(String[] args) {
		int mark=99;
		if(mark>85) {
			System.out.println("excellent");
		}
		else if((mark>=50)&&(mark<85)) {
			System.out.println("good");
		}
		else if((mark>=35)&&(mark<50)) {
			System.out.println("average");
		}
		else {
			System.out.println("fail");
		}
	}

}
