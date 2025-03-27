public class Main
{
	public static void main(String[] args) {
		Beverage b = new Whisky();
		System.out.println("For Whisky");
		b.templateMethod(30);
		b = new Rum();
		System.out.println("\nFor Rum");
		b.templateMethod(30);
		b = new Beer();
		System.out.println("\nFor Beer");
		b.templateMethod(300);
	}
}
