import java.util.*;

public class Main {
	Main() {

	}

	public static Integer f(Integer x) {
		if (x < 1)
			return 1;
		else
			return f(x - 1) + f(x - 2);
	}

	public static void main(String[] args) {
		Integer x = Integer.valueOf(2);
		Integer y = Integer.valueOf(3);
		System.out.println(f(x + y));
		System.out.println(new ArrayList<Integer>());
		Boolean z = (2000 + 1200 == 3200);
	}
}