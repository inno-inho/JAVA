package Ch01;

class Buyer{
	private int myMoney;
	private int appleCnt;
	
	
	
	
	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getAppleCnt() {
		return appleCnt;
	}

	public void setAppleCnt(int appleCnt) {
		this.appleCnt = appleCnt;
	}

	// 모든인자 생성자
	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	
	public void payment(Seller 사과장수, int money) {
		myMoney -= money;
		int cnt = 사과장수.receive(money);		// Seller 클래스에 public으로 해놓은거
		this.appleCnt += cnt;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}

}

//我爱我的奴朋友


class Seller{
	private int myMoney;
	private int appleCnt;
	private int price;
	
	
	
	// 모든 인자 생성자
	public Seller(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
	
	public int receive(int money) {
		this.myMoney += money;
		int cnt = money / this.price;
		appleCnt -= cnt;
		
		return cnt;
	}
	
	// toString
	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}

	

}
public class C11 {
	public static void main(String[] args) {
		//
		Buyer 이노 = new Buyer(10000, 0);
		Buyer 헤렌 = new Buyer(20000, 0);
		
		//
		Seller 아오모리사과가게 = new Seller(50000, 100, 1000);
		
		// 
		이노.payment(아오모리사과가게, 3000);
		헤렌.payment(아오모리사과가게, 8000);
		
		//-------------------------
		System.out.println("이노:" + 이노);
		System.out.println("헤렌:" + 헤렌);
		System.out.println("아오모리사과가게: " + 아오모리사과가게);
		
		
		if(이노.getMyMoney() < 헤렌.getMyMoney() ) {
			System.out.println("ㅠㅅㅠ");
		}
	}

}
