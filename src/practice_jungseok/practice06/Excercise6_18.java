package practice_jungseok.practice06;

class Excercise6_18 {
	
	public static boolean isNumber(String str) {
		// 유효성 검사
		if(str == null || str.equals(""))
			return false;
		
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch < '0' || ch >'9') { // if(!('0'<=ch && ch<='9'))와 같다.
				return false;
			}
		} // for문 마지막
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		}
}
