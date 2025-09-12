package Ch20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) 	// 어노테이션의 유지기간(프로그램 동작중인 상태에서만 실행)
@Target({ElementType.TYPE, ElementType.METHOD})	// 어디에 적용시킬지, 적용대상을 제한하는데 사용됨
												// ElementType.TYPE : 클래스, 인터페이스, eum .. 적용
												// ElementType.METHOD : 메서드에 적용

// 어노테이션 만드는 법 -> @interface 붙이기
// 쓰는 법 @CustomAnnotation(value = "", nuber = ..., isOpen = ...)
public @interface CustomAnnotation {
	String value() default "Hello Helen";		// default는 기본값 넣는법
	int number() default 1; 
	boolean isOpen() default false;
	
}
