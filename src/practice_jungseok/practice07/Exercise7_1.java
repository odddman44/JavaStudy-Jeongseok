package practice_jungseok.practice07;

class SutdaDeck {
	final int CARD_NUM = 20; // 카드의 총 갯수
	SutdaCard[] cards = new SutdaCard[CARD_NUM]; // 카드 배열 정보

	SutdaDeck() {
		for(int i = 0; i < cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i<10) && (num == 1 || num == 3 || num == 8);
			
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
	
	void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int j = (int)(Math.random() * cards.length); // j도 i와 같은 범위로 만들어줌. 대신 랜덤값.
			
			// cards[i]와 cards[j] 바꾸기
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) // 유효성 검사
			return null;
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0)); // 1K
		System.out.println(deck.pick()); // 랜덤 카드 
		deck.shuffle(); // 섞기 
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0)); // 섞인 것 중 첫번째 배열값
	}
}
