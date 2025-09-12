package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface			// 함수형 인터페이스로 지정하는 애노테이션0
interface Func1{
	void say(String message);
}

@FunctionalInterface
interface Func2{
	int sum(Integer ...args);
}

@FunctionalInterface
interface Func3{
	List<Integer> sum(Object ...args);		// 자료형이 뭐든 다 받겠다
}

public class C01FunctionalInterfaceMain {

	public static void main(String[] args) {
		// 01
		Func1 func1 = (message) -> {System.out.println(message + "!");};
		func1.say("안녕 나는 이노야");
		
		Func1 func1_2 = System.out :: println;
		func1_2.say("안녕 나는 이노사마야");
		
		// 02
		Func2 func2 = (arr) -> {
			int sum = 0;
			for(Integer n : arr)
				sum += n;
			return sum;
		};
		System.out.println(func2.sum(10, 20, 30, 40, 50, 60));
		
		Func3 func3 = (arr) -> {
			return Arrays.stream(arr)
//						.filter((obj) -> {return obj instanceof Integer;})
						.filter(obj -> obj instanceof Integer)
						.map(obj -> (Integer)obj)
						.collect(Collectors.toList());
		};
		System.out.println(func3.sum(10, 20, 30, "이노", true));
		
		
	}

}
