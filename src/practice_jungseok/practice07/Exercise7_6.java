package practice_jungseok.practice07;

class Outer {
	int value = 10; // Outer.this.value

	class Inner { // 인스턴스 클래스(instance inner class)
		int value = 20; // this.value

		void method1() {
			int value = 30; // value
			System.out.println(value);
			System.out.println(this.value); // 20
			System.out.println(Outer.this.value); // 10
		}
		
	} // Inner클래스의 끝
	
} // Outer클래스의 끝

class Exercise7_6 {
	public static void main(String args[]) {
		
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		inner.method1();
	}
}
