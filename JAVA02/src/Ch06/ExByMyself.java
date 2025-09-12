package Ch06;

abstract class Converter {
    abstract protected double convert(double src);      // 변환 메소드
    abstract protected String getSrcString();           // 변환 전 단위 이름
    abstract protected String getDestString();          // 변환 후 단위 이름
    protected double ratio;                             // 비율
    
    public void run() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+" 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+res+getDestString()+"입니다");
//        scanner.close();
    }
}

	class Km2Mile extends Converter{

		@Override
		protected double convert(double src) {
			double mile = src / 1.609;
			
			return mile;
		}

		@Override
		protected String getSrcString() {	// 입력받을 값 -> ?km
			
			return "거리를 KM로";
		}

		@Override
		protected String getDestString() {	// 바꿀 값 -> mile
			return "mile";
		}
		
	}
	
	class Kg2Pound extends Converter{

		@Override
		protected double convert(double src) {
			double pound = src * 2.20462;
			return pound;
		}

		@Override
		protected String getSrcString() {
			// TODO Auto-generated method stub
			return "Kg";
		}

		@Override
		protected String getDestString() {
			// TODO Auto-generated method stub
			return "pound";
		}
		
	}


public class ExByMyself {
	
	public static void main(String[] args) {
		Km2Mile kmToMile = new Km2Mile();
		kmToMile.run();
		
		Kg2Pound kgToPound = new Kg2Pound();
		kgToPound.run();
		
	}
	
}

