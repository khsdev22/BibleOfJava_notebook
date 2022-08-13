package ch6;

class Data1 {
	int value;
} // Data1에는 정의되어 있는 생성자가 하나도 없으므로 컴파일러가 기본 생성자를 추가해주었지만

class Data2{
	int value;
	
	Data2(int x){ // 매개변수가 있는 생성자
		value = x; // 기본 생성자가 추가되지 않는다. 왜? 생성자가 이미 정의되어있으므로
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2();
	}

}
