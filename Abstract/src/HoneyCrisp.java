
public class HoneyCrisp extends Apple implements discount {


	private String taste;
	private boolean difference;
	
	public HoneyCrisp(String name, int q, double p, String t, boolean d) {
		super(name, q, p);
		this.taste =t;
		this.difference = d;
	}
	
	public String tasteGreenApple() {
		return this.taste;
	}
	
	public double calprice() {
		return super.price * super.quantity;
	}
	
	public boolean differ() {
		return this.difference;
	}
	
	public String toString() {
		return ("Total price = RM" + paid+ "\n" + this.name + " taste is " + this.taste);
	}


}
