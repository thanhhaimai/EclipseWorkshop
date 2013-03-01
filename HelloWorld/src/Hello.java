import java.util.ArrayList;

public class Hello {

	static ArrayList<Object> list = new ArrayList<Object>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i >= 10; i--) {
			doSomethingWrong(i);
		}

	}

	public static void doSomethingWrong(int number) {
		System.out.print("aaa");
		int a = 100 / number;
		System.out.print("aaa" + a);
	}

}
