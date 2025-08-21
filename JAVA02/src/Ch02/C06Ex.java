package Ch02;

class Profile{
	// 속성
	private String name;
	private String addr;
	private String job;
	private String major;
	
	//생성자
		//1)디폴트생성자 삽입
		
		Profile() {}
		
	
		//2)모든 인자 받는 생성자 삽입 -> 각멤버에 대입
		
		public Profile(String name, String addr, String job, String major) {
			super();
			this.name = name;
			this.addr = addr;
			this.job = job;
			this.major = major;
			
		}


	

		
		//3)모든 인자 받는 생성자 삽입 -> , 를기준으로 잘라내어 각속성에 저장
		//ex, "홍길동,대구,프로그래머,컴퓨터공학" ->[홍길동,대구,프로그래머,컴퓨터공학]
		
		
		public Profile(String arg) {
			String params [] = arg.split(",");		// arg에 받은 값들을 ,를 기준으로 나눈다음 params에 저장
			
			this.name = params[0];					// Profile 객체의 name에 받은 params[0]를 저장
			this.addr = params[1];					// Profile 객체의 addr에 받은 params[1]을 저장
			this.job = params[2];					// Profile 객체의 job에 받은 params[2]을 저장
			this.major = params[3];					// Profile 객체의 major에 받은 params[3]을 저장
		}



//		String str6 = "등산,탁구,축구,골프,독서,영화감상";
//		String [] result = str6.split(",");			// ,를 기준으로 나눠서 그 값들을 result에 배열형식으로 넣어줘
//		
//		for(String hobby : result)					// 배열 result에 있는 값을 뽑아보기위한 향상된 for문
//			System.out.println(hobby);
		
		
		
		
		//기능
		//1) 멤버변수를 은닉화 하고 getter and setter 를 만들어줍니다
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getAddr() {
			return addr;
		}


		public void setAddr(String addr) {
			this.addr = addr;
		}


		public String getJob() {
			return job;
		}


		public void setJob(String job) {
			this.job = job;
		}


		public String getMajor() {
			return major;
		}


		public void setMajor(String major) {
			this.major = major;
		}


	
		
		//2) toString  코드를 삽입 

		@Override
		public String toString() {
			return "Profile [name=" + name + ", addr=" + addr + ", job=" + job + ", major=" + major + "]";
		}
		
	
		//3) boolean isContain(String findstr) 함수 완성하기
		
//		boolean isContain(String findstr) {
				//findstr의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true 리턴
				//아니면 false 리턴
		
		
		public boolean isContain(String findstr) {
			
			if(this.name.contains(findstr))
				return true;
			else if(this.name.contains(findstr))
				return true;
			else if(this.name.contains(findstr))
				return true;
			else if(this.name.contains(findstr))
				return true;
			else
				return false;
			
		}

	
		
//		}
	


		//4)
		boolean isEquals(String str) {
			//all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
			//"name,addr,job,major" 와 일치 하면 true
			//아니면 false 를 리턴
			
			String params [] = str.split(",");
			if(
					this.name.equals(params[0])&&		// 입력된 값(params[0])의 값이 이 객체의 this.name값과 일치하는지
					this.addr.equals(params[1])&&
					this.job.equals(params[2])&&
					this.major.equals(params[3])
					)
				return true;
			else {
				return false;
			}
		}
		
	}

	public class C06Ex {

		public static void main(String[] args) {
			Profile hong = new Profile("홍길동","대구","프로그래머","컴퓨터공학");
			System.out.println(hong.toString());
			System.out.println("길동 포함여부 : " + hong.isContain("길동"));	//true
			System.out.println("컴퓨터 포함여부 : " + hong.isContain("컴퓨터"));	//true
			System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,대구,프로그래머,컴퓨터공학"));//True
			System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,울산,프로그래머,컴퓨터공학"));//false
		}

	}






