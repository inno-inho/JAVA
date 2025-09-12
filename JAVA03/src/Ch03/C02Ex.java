package Ch03;

abstract class OkPopCorn{
	
}

class 캬라멜 extends OkPopCorn{

	@Override
	public String toString() {
		return "캬라멜";
	}
	
}

class 버터옥수수 extends OkPopCorn{

	@Override
	public String toString() {
		return "버터옥수수";
	}
	
}



class PopCorn<T extends OkPopCorn>{
	private T 맛;
	
	public PopCorn(T 맛) {
		this.맛 = 맛;
	}

	@Override
	public String toString() {
		return "popCorn [맛=" + 맛 + "]";
	}
	
}




public class C02Ex {

	public static void main(String[] args) {
		
		PopCorn<캬라멜> ob1 = new PopCorn<>(new 캬라멜());
		System.out.println(ob1);
		
		PopCorn<버터옥수수> ob2 = new PopCorn<>(new 버터옥수수());
		System.out.println(ob2);

	}

}
