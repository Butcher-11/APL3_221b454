public class Main
{
	public static void main(String[] args) {
		Offering offering = new IceCream();
		offering = new Rum(offering);
		offering = new Gin(offering);
		System.out.println(offering.getName() + " :- " + offering.getPrice());
	}
}
