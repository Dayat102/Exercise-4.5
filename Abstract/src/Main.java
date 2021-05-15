public class Main{
	
	public static void main(String[]args) {
		System.out.println();
		
		Apple a=new Apple ("Apple",100,0.99); //new object for sub class
		System.out.println(a);
		System.out.println();
		
		HoneyCrisp b = new HoneyCrisp("HoneyCrisp",80,0.58,"Sweet",true);
		System.out.println(b);
		System.out.println();
		
		Mango c= new Mango("Mango");
		System.out.println(c);
		
	}
}