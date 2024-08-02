package m.api.ex1;

public class C_Wrapper {
	/*
	 * Wrapper 클래스
	 * => 기본 자료형을 객체로 포장해줄 수 있는 클래스이다.
	 * 
	 * boolean(Boolean)
	 * char(Character)
	 * byte(Byte)
	 * short(Short)
	 * int(Integer)
	 * long(Long)
	 * float(Flat)
	 * double(double)
	 * 
	 * => 기본 자료형을 객체로 표현해야할 경우
	 * - 메소드 호출해야할 때
	 * - 메소드의 매개변수가 기본 자료형이 아닌 객체타입만 요구될 때
	 * - 다형성을 적용시키고 싶을 때
	 */
	public void method01() {
		// UnBoxing : Wrapper 클래스 자료형 -> 기본 자료형
		
		// 1. 해당 그 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해서 가능
		//int num3 = i3.intValue();
		//int num4 = i4.intValue();
		
		// 2. 메소드 사용하지 않고 바로 대입하는 방법
		//int num5 = i3;
		
		// 기본 자료형 <- -> String
		String str1 = "10";
		String str2 = "15.5";
		
		System.out.println(str1 + str2);
		
		// String -> 기본 자료형
		// "10"	  -> 10
		// "15.5" -> 15.5
		// 해당 Wrapper 클래스.parseXXX() 사용
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		System.out.println(i + d);
		
		// 기본 자료형 -> String
		System.out.println(i + "");
		System.out.println(String.valueOf(i));
		System.out.println(String.valueOf(d));
	}
}
