import java.util.ArrayList;
import java.lang.Object;
//import List.*;

public class Main {
	Main() {

	}

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		List l = new List(arr);
		System.out.println(l);
		return;
	}
}