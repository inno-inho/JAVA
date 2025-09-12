package Ch05;

class Point2D{
	int x;
	int y;
	
	Point2D(){
		System.out.println("Point2D 디폴트생성자 호출!");
	}
	
	Point2D(int x){
		System.out.println("Point2D(int x) 디폴트생성자 호출!");
	}
	Point2D(int x, int y){
		System.out.println("Point2D(int x, int y) 디폴트생성자 호출!");
	}
}

class Point3D extends Point2D{					// Point2D를 상속받겠다
	int z;
	
	Point3D(){
		// super(); -> 상위클래스 Point2D()생성자 호출하는 super()가 기본적으로 숨어져있음
		System.out.println("Point3D 디폴트생성자 호출!");
	}
	Point3D(int x){
		super(x); 		// 상위클래스 Point2D(int x) 생성자 호출하는 거
		System.out.println("Point3D(int x) 생성자 호출!");
	}
	
	
	@Override
	public String toString() {
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
}

public class C02Inheritance {

	public static void main(String[] args) {
		Point3D  ob = new Point3D(10);			//  Point2D(int x) 디폴트생성자 호출!, Point3D(int x) 생성자 호출!
												// 	Point3D가 Point2D를 상속했기때문에 Point2D의 생성자를 먼저 호출하는거
		ob.x = 10;
		ob.y = 20;
		ob.z = 30;
		
		System.out.println(ob);

	}

}
