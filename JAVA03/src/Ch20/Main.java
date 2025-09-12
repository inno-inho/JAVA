package Ch20;


@CustomAnnotation(value = "헤렌", number = 10000, isOpen = true)
class Simple {
	String value;
	int number;
	boolean isOpen;
	
	Simple(){
		CustomAnnotation ref = this.getClass().getAnnotation(CustomAnnotation.class);
		System.out.println("Value: " + ref.value());
		System.out.println("Number: " + ref.number());
		System.out.println("isOpen: " + ref.isOpen());
		this.value = ref.value();
		this.number = ref.number();
		this.isOpen = ref.isOpen();
	
	}
	
}

public class Main {

	public static void main(String[] args) {
		Simple ob = new Simple();
		System.out.println(ob);

	}

}
