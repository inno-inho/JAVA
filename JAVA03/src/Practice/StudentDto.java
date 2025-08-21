package Practice;

public class StudentDto {
	
	private int id;
	private String grade;
	private String name;
	private String major;
	
	// 디폴트 생성자
	public StudentDto() {}
	// 모든 인자 생성자

	public StudentDto(int id, String name, String major, String grade) {
		super();
		this.id = id;
		this.grade = grade;
		this.name = name;
		this.major = major;
	}


	
	// setter getter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	// toString()재정의
	
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", grade=" + grade + ", name=" + name + ", major=" + major + "]";
	}


}
