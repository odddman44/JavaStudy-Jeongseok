package practice_jungseok.practice06;

class Exercise6_4 {
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
//		return Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2)); // 메서드는 단순 연산보다 비용이 많이 드는 작업이라는 것을 기억!
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 지역변수
		
	}
	
	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}
}
