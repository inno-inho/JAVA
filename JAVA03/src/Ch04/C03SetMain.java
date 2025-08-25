package Ch04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class C03SetMain {

	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet();
		
		set.add("HTML/CSS/JS");	// idx번호 0
		set.add("NODEJS");			// idx번호 1
		set.add("SCSS");			// idx번호 2
		set.add("REACT");
		set.add("JAVA");	// older
		set.add("JAVA");	// newer(적용)
		set.add("JSP/SERVLET");
		set.add("STS");
		set.add("SPRING BOOT");	// older
		set.add("SPRING BOOT");	// newer(적용)
		
		// 삭제
		set.remove("REACT");
		
		// 확인
		System.out.println("개수 확인" + set.size());
		
		// 탐색(고전) - Iterator
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		// 탐색(최근)
//		for(String el : set) {
//			System.out.println(el);
		
		set.clear(); 	// 모두 삭제
		
	
	}
		
	}
}
