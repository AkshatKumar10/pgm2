package pgrm1;

public class Even {
	public static String display(int n) {
		if(n%2==1) return "odd";
		else return "even";
	}
	public static void main(String[] args) {
		System.out.println(display(55));
	}
}
