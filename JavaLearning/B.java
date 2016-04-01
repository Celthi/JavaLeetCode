public class B extends A{
	public B() {
		System.out.println("I'm B");
	}
	static {
		System.out.println("Static B");
	}
	public void belongToB() {
		return;
	}
	public void method() {
		System.out.println("B method");
		
	}
}
