package practice_jungseok.practice09;

class Exercise9_3 {
	
	
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		
		// (1) 반복문을 사용해서 아래의 과정을 반복한다.
		while (true) {
			// 1. src에서 target을 pos의 위치부터 찾는다.
			pos = src.indexOf(target,pos);
			// 2. 찾으면 count의 값을 1 증가 시키고,
			// pos의 값을 target.length만큼 증가시킨다.
			if(pos!=-1) {
				count++;
				pos += target.length(); // pos를 찾은 단어 이후로 옮김.
			} else {
			// 3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환.
				break;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
	}
}
