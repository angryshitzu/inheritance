package interface9010;

public class Main {
	
	//Main 클래스 안에서 String 클래스가 사용 됨 - has a
	//이 경우는 인스턴스 변수로 선언돼서 main 과 수명이 같기 때문에 composition 
	String str;

	public static void main(String[] args) {
		String str; //aggregation
		
		// Servicimpl 객체를 생성
		//Serviceimpl service = new Serviceimpl();
		
		//인터페이스를 implements 한 클래스의 객체를 만들 때는 변수를 만들 때 인터페이스의 이름을 사용하기도 한다.
		Service service = new Serviceimpl();	
		
		service.insert();
		service.read();
		service.update();
		service.remove();

	}

}
