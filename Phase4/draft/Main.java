import java.util.ArrayList;
import java.lang.Object;

public class Main {
	Main() {

	}

	public static void main(String[] args) {
		List L = new List(new ArrayList<Object>());
		List L2 = new List(L);

		L.addElement(Integer.valueOf(1));
		L.addElement(Integer.valueOf(2));
		System.out.print("[");
		boolean flag = false;
		for (int i = 0; i < L.getSize(); ++i) {
			if (flag)
				System.out.print(",");
			flag = true;
			System.out.print(L.getElement(i));
		}
		System.out.println("]");
		return;
	}
}