package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

//제공되는 함수형 인터페이스들
//Function<T, R>:
//apply 메서드를 가지고 있어서 하나의 인자(T)를 받아서 결과(R)를 반환하는 함수형 인터페이스 입니다.

//Supplier<T>:
//get 메서드를 가지고 있어서 어떠한 인자도 받지 않고 결과만을 제공하는 함수형 인터페이스 입니다.
//
//Consumer<T>:
//accept 메서드를 가지고 있어서 어떠한 인자를 받아서 결과를 반환하지 않는 함수형 인터페이스 입니다.
//
//Predicate<T>:
//test 메서드를 가지고 있어서 어떠한 인자를 받아서 불리언 결과를 반환하는 함수형 인터페이스 입니다.
//
//UnaryOperator<T>:
//apply 메서드를 가지고 있어서 하나의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.
//
//BinaryOperator<T>:
//apply 메서드를 가지고 있어서 두 개의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.

public class C03FunctionalInterfaceMain {
	// 01
	public static Function<Integer, Integer> func1 = x -> x * x;

	// 02
	public static Function<Integer, Integer> func2 = x -> x + x;
	
	// 03
	public static Function< List<Integer>, Integer> func3 = (x) -> x.stream().reduce(0, (sum, el) -> {return  sum + el;}); 	// (누적변수의 초기값, (누적변수, 요소변수) -> {return  누적연산})
		
	// 04
	public static Function<List<Object>, Integer> func4 = (li) -> {
		// 01 List의 각 요소중 Integer만 filter
		// 02 필터링된 Integer의 재구성(map)
		// 03 누적함(reduce)
		
		return li.stream().filter((el) -> {return el instanceof Integer;})		// Integer인지 확인
					.map((el) -> {return (Integer)el;})			// Integer로 다운캐스팅
					.reduce(0, (sum, el) -> {return sum + el;});
		};
		
	// 05
	public static Function<List<Object>, List<String>> func5 = (li) -> {
		return li.stream().filter((e) -> {return e instanceof String;})
					.map((e) -> {return "- " + (String)e + " -";})
					.collect(Collectors.toList());
	};
	
	// 06 두개의 함수형 프로그래밍 합치기
	public static Function<Integer, Integer> func6 = func1.andThen(func2);	// func1하고나서 func2하기
		
	// 07 
	public static Function<List<Integer>, Integer> func7 = func3.andThen(func1).andThen(func2);	// func3하고나서 func1하고나서 func2하기
	
	// 08 반환을 함수형 Interface형으로 반환
	public static Function<Integer, Function<Integer, Integer>> func8 = (x) -> {
	
		//
		System.out.println("func 8 x: " + x);	// x가 첫번째 인자 받음
		return (n) -> {
			
			//
			System.out.println("func 8 n: " + n);	// n이 두번째 인자 받음
			return x + n;
	
		};
	};
	
	// 09 8번함수 줄인거
	public static Function<Integer, Function<Integer, Integer>> func9 = x -> y -> x + y;
	
	public static void main(String[] args) {
	
		// 01
		Integer a = func1.apply(10);
		System.out.println("첫 번째: " + a);
		
		// 02
		System.out.println(func2.apply(10));	
		
		// 03
		System.out.println(func3.apply(Arrays.asList(10, 20, 30, 50)));
		
		// 04
		System.out.println(func4.apply(Arrays.asList(10, 10.5, "이노", 50, 40, "헤렌", 23)));
		
		// 05
		System.out.println(func5.apply(Arrays.asList(10, 10.5, "이노", 50, 40, "헤렌", 23)));
		
		// 06
		System.out.println(func6.apply(10));
		
		// 07 
		System.out.println(func7.apply(Arrays.asList(10, 20, 30, 40 ,50)));
		
		// 08 
		System.out.println(func8.apply(10).apply(20));
		
		// 09
		System.out.println(func9.apply(10).apply(20));
		
		// 我想结婚我的奴朋友
	}
}