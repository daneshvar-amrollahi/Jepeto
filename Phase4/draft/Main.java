import java.util.ArrayList;
import java.lang.Object;
//import List.*;

public class Main {
	Main() {

	}

//	public void f(List l, Integer x) {
//		return;
//	}

	public static void main(String[] args) {
		Main m = new Main();

		//Fptr fptr = new Fptr(m, )
//		ArrayList<Object> arr = new ArrayList<>();
//		arr.add(1);
//		arr.add(2);
//		List l = new List(arr);
//		System.out.println(l);
//		l.addElement(100);
//		l.getElement(2);
//		l.getSize();
//
		Fptr fp = new Fptr(m, "f");
		ArrayList<Object> arr2 = new ArrayList<>();
		System.out.println(fp.invoke(arr2));
		return;
	}
}