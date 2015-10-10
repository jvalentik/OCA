//testing varargs
public class current {
	public static void main(String...params) {
		System.out.println(params.length);
		for (String parameter : params) {
			System.out.println(parameter);
		}
	}
}