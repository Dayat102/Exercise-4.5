package Exercise4__5;

public abstract class Fruit {
	
	protected String name; //universe cannot access the data
	public Fruit(String name) {
		this.name = name;
	    System.out.println("Fruit constructor is invoked");
	  }
	
	public abstract double totalPrice();
	public abstract double totalPrice(double pp);
	public abstract double totalPrice(double pp,double qq);
}
