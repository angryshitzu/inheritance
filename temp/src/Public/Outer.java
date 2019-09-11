package Public;

public class Outer {
	//class 안에 만들어진 내부 클래스
	//이 클래스는 Outer  안에서만 사용 가능
	//대신에 public이기 때문에 Outer 객체는 접근 가능
	public static class Inner  {
		//내부 클래스에 static이 있는 경우 클래스에 static을 추가해 줘야 한다.
		public static void innerMethod() {
			System.out.printf("내부 클래스의 메소드\n");
		}
	}

	public void outerMethod() {
		//inner 클래스의 객체 만들기
		Inner inner = new Inner();
		inner.innerMethod();

	}

}
