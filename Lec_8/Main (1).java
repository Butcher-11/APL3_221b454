
public class Main
{
	public static void main(String[] args) {
		Crow crow = new IndianCrow();
		//Swan swan  = new Indianswan();
		CrowAdapter crowadapter = new CrowAdapter(crow);
		client(crowadapter);
	}
	public static void client(Swan swan){
	    swan.eat();
	    swan.sing();
	    swan.swim();
	}
}
