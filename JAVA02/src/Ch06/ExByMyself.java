package Ch06;

abstract class Converter {
    abstract protected double convert(double src);      // 변환 메소드
    abstract protected String getSrcString();           // 변환 전 단위 이름
    abstract protected String getDestString();          // 변환 후 단위 이름
    protected double ratio;                             // 비율
    
    public void run() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+"을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+res+getDestString()+"입니다");
        scanner.close();
    }
}

public class ExByMyself {

}
