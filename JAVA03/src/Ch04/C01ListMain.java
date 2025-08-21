package Ch04;

import java.util.ArrayList;
import java.util.List;

public class C01ListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();		// ArrayList는 List의 자식클래스 그러므로 list는 업캐스팅된것
		
		// 추가
		list.add("HTML/CSS/JS");	// idx번호 0
		list.add("NODEJS");			// idx번호 1
		list.add("SCSS");			// idx번호 2
		list.add("REACT");
		list.add("JAVA");
		list.add("JSP/SERVLET");
		list.add("STS");
		list.add("SPRING BOOT");
		
		// 조회
		System.out.println("개수 확인: " + list.size());
		System.out.println("idx로 조회: " + list.get(2));
		System.out.println("Value로 idx확인: " + list.indexOf("JAVA"));
		list.forEach(System.out::println);		// 값 하나하나 다 꺼내기
		
		// 삭제
		list.remove(0);
		list.remove("REACT");
		System.out.println("---");
		list.forEach(System.out::println);	// HTML/CSS/JS랑 REACT 삭제됨
		
		//전체삭제
//		list.clear();
		
		
		
	}

}
