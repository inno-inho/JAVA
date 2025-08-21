package Ch06;

interface Remocon{
	int MAX_VOL = 100;		// public static final	-> 어디서든 쓸 수 있는 고정된 변수
	int MIN_VOL = 0;		// public static final	-> 어디서든 쓸 수 있는 고정된 변수
	
	
	void powerOn();		// 추상메서드
	void powerOff();	// 추상메서드
	void setVolumn(int vol);	// 추상메서드
}

interface Browser{
	void searchURL(String url);
}

class TV implements Remocon{
	private int nowVol;
	
	@Override
	public void powerOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("TV를 끕니다");
	}
	
	@Override
	public void setVolumn(int vol) {
		if(vol >= MAX_VOL) {
			this.nowVol = MAX_VOL;
		}else if(vol <= MIN_VOL) {
			this.nowVol = MIN_VOL;
		}else {
		this.nowVol = vol;
		}
		System.out.println("TV 현재볼륨:" + nowVol);
	}
}

 class SmartTV extends TV implements Browser{	// TV의 하위객체 SmartTV가 Browser도 구현해야함

	@Override
	public void searchURL(String url) {
		System.out.println("검색하신" + url + "로 이동합니다");
	}		
	 
 }







class Radio implements Remocon{
	private int nowVol;
	
	@Override
	public void powerOn() {
		System.out.println("라디오를 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("라디오를 끕니다");
	}
	
	@Override
	public void setVolumn(int vol) {
		if(vol >= MAX_VOL) {
			this.nowVol = MAX_VOL;
		}else if(vol <= MIN_VOL) {
			this.nowVol = MIN_VOL;
		}else {
		this.nowVol = vol;
		}
		System.out.println("Radio 현재볼륨:" + nowVol);
	}
}



public class C03InterfaceMain {
	public static void Turnon(Remocon controller) {	
		controller.powerOn();			// 각각 들어오는 객체의 클래스에 맞는 powerOn함수를 실행시킴-> 업캐스팅 된 객체가 들어오는 거니까
	}
	
	public static void Turnoff(Remocon controller) {
		controller.powerOff();
	}
	
	public static void ChangeVolumn(Remocon controller, int vol) {
		controller.setVolumn(vol);
	}
	
	public static void Internet(Browser browser, String url) {		// SmartTV의 객체가 들어오게되면 Brwoser클래스에 업캐스팅 그러므로 browser는 SmartTV의 필드 전부 사용 가능
		browser.searchURL(url);
	}
	
	
	

	public static void main(String[] args) {
		 TV tv = new TV();
		 Radio radio = new Radio();
		 SmartTV samrtTv = new SmartTV();
		 
		 Turnon(samrtTv);
		 ChangeVolumn(samrtTv, 33);
		 Internet(samrtTv, "www.naver.com");
		 
		 Turnoff(samrtTv);
		
//		 Turnon(tv);	// Remocon클래스의 controller가 TV의 객체가 연결 -> UpCasting
//		 Turnon(radio);	// Remocon클래스의 controller가 Radio의 객체가 연결 -> UpCasting
//		 
//		 Turnoff(tv);
//		 Turnoff(radio);
//		 
//		 ChangeVolumn(tv, 50);
//		 ChangeVolumn(tv, 120);
//		 ChangeVolumn(radio, -20);
//		 ChangeVolumn(radio, 70);
//		 
	}

}
