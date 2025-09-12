package Ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;




public class C04Ex {

	public static void main(String[] args) {
		// 1 ~ 45 까지의 숫자를 6개를 랜덤으로 받아(Random클래스를 이용) set에 저장 / 출력 
		
		Set<Integer> lotto = new HashSet();
		Random rnd = new Random();
		
		
		while(lotto.size() < 6) {
			int num = rnd.nextInt((45) + 1);
			lotto.add(num);
		}
		
		for(Integer el : lotto) {
			System.out.printf("%d ", el);
		}

		System.out.println("");
		// 저장된 set의 오름차순 정렬을 해보세요(스트림함수)
		
//		1번째 방법
//		List<Integer> list = lotto.stream().sorted().collect(Collectors.toList());
//		list.stream().forEach(System.out::println);
		
//		2번째 방법

		
		List<Integer> sortedLotto = new ArrayList<>(lotto);
		Collections.sort(sortedLotto);
		sortedLotto.stream().forEach(System.out::println);
		


		
	}

}
