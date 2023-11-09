package Employee.org;

public class Sample {

	private void tallestInAClass(Float a,Float b,Float c) {
		if (a>b && a>c) {
			System.out.println("A is tallest");
		}
		else if (b>a && b>c) {
			System.out.println("B is tallest");
		}
		else {
			System.out.println("C is tallest");
		}

	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.tallestInAClass(130.5f, 135.6f, 150.3f);
		
	}
}
