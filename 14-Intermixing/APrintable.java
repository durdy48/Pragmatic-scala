public class APrintable implements Printable {
	public void print() {
		System.out.println("We can reuse the trait here if we like...");
		Printable$class.print(this);
	}

	public static void use(Printable printable) {
		printable.print();
	}

	public static void main(String[] args) {
		APrintable aPrintable = new Aprintable();
		use(aPrintable);
	}
}
