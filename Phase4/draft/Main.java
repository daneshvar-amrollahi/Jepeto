import java.util.ArrayList;
import java.lang.Object;
//import List.*;

public class Main {
	Main() {

	}

	public Integer f() {
		return Integer.valueOf(2);
	}

	public static void main(String[] args) {
		Main m = new Main();

		Fptr fp = new Fptr(m, "f");
		ArrayList<Object> arr2 = new ArrayList<>();
		System.out.println(fp.invoke(arr2).getClass());
		return;
	}
}