package practice_jungseok.practice07;

class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	Product() {
	
	}

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		// super(); // Product()를 호출하는거 컴파일러가 자동으로 생성해 줘서 생략.
	}

	public String toString() {
		return "Tv";
	}
}

public class Exercise7_3 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}
