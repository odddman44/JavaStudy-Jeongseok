package practice_jungseok.practice09;

class Exercise9_5 {
	public static String delChar(String src, String delCh) {
		
		StringBuffer sb = new StringBuffer(src.length());
		
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);
			
			// ch가 delCh에 포함되어 있지 않으면, (indexOf() 로 못찾으면) sb에 추가
			if(delCh.indexOf(ch)==-1) // indexOf(int ch)를 호출
				sb.append(ch);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}
