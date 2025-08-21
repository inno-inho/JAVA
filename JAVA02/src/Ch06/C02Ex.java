//package Ch06;
//
//
//  //다음은 단위를 변환하는 추상 클래스 Converter이다.
//import java.util.Scanner;
//
//abstract class Converter {
//   abstract protected double convert(double src); // 추상 메소드
//   abstract protected String getSrcString(); // 추상 메소드
//   abstract protected String getDestString(); // 추상 메소드
//   protected double ratio; // 비율
//   public void run() {
//      Scanner scanner = new Scanner(System.in);
//      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
//      System.out.print(getSrcString()+"을 입력하세요>> ");
//      double val = scanner.nextDouble();
//      double res = convert(val);
//      System.out.println("변환 결과: "+res+getDestString()+"입니다");
//      scanner.close();
//   }
//}
//
//class 섭씨to화씨 extends Converter{
//	
//	
//	@Override
//	protected double convert(double src) {		// 사용자가 입력한 숫자
//		return (src * (9/5)) + 32;		// 사용자가 입력한 온도가 ratio 공식의 src에 대입되고 계산된걸 리턴
//	}
//
//	@Override
//	protected String getSrcString() {
//		
//		return "섭씨";
//	}
//
//	@Override
//	protected String getDestString() {
//		
//		return "화씨";
//	}
//	
//}
//
//
//
// //원화 -> 달러 
//class Won2Dollar extends Converter{
//	private double raito;
//	
//	public Won2Dollar(double ratio) {
//		this.ratio = ratio;
//	}
//	
//	@Override
//	protected double convert(double src) {
//		// TODO Auto-generated method stub
//		return src/ratio;
//	}
//
//	@Override
//	protected String getSrcString() {
//		// TODO Auto-generated method stub
//		return "원화";
//	}
//
//	@Override
//	protected String getDestString() {
//		// TODO Auto-generated method stub
//		return "달러";
//	}
//		
//}
//
//
//
// //섭씨 -> 화씨
// //class 섭씨to화씨 extends Converter{
// //	
// //}
//
//public class C02Ex {
//
//	public static void main(String[] args) {
//
//		// 환전
//		
//		//[3번] Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하라. main() 메소드와 실행 결과는 다음과 같다.
// //		   Won2Dollar toDollar = new Won2Dollar(1399); // 1달러는 1399원
// //		   toDollar.run();
// //		   
//		   //결과
// //		   원을 달러로 바꿉니다.
// //		   원을 입력하세요>> 24000
// //		   변환 결과: 20.0달러입니다
//
//		   // 섭씨화씨
//		   
//		 //섭씨(℃)화씨(℉) 공식 : 화씨 = (섭씨 × 9/5) + 32
//		   섭씨to화씨 test = new 섭씨to화씨();
//		   test.run();
//		   
//		   
//	}
//
//}