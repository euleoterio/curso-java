package classe;

public class AreaCircTest {

	public static void main(String[] args) {

		AreaCirc a = new AreaCirc(10);
//		a.pi = 10;
		AreaCirc a2 = new AreaCirc(5);
//		a2.pi = 0;

//		AreaCirc.pi = 3.1415;

		System.out.println(a.area());
		System.out.println(a2.area());

		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		System.out.println(AreaCirc.area(100));

	}

}
