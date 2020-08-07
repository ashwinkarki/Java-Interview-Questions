public class Cow  extends Animal {

	@Override
	public String sound() {
		return "foo";
	}
	
	public Cow() {
		System.out.println("cow con");
	}
	
}