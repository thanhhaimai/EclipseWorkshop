import java.util.ArrayList;

public class Hello {

	ArrayList<Object> list = new ArrayList<Object>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSomethingWrong(10);
		doSomethingWrong(0);

	}

	public static void doSomethingWrong(int number) {
		System.out.print("aaa");
		int a = 100 / number;
		System.out.print("aaa");
	}

}
