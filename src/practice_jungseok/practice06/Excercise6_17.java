package practice_jungseok.practice06;

class Excercise6_17 {
	
	public static int[] shuffle(int[] arr) {
		if(arr == null || arr.length == 0) {
			return arr;
		}
		
		for(int i = 0; i < arr.length; i++) {
			int j = (int)(Math.random() * arr.length); // j의 범위는 0~7
			
			// arr[i]와 arr[j]의 값 바꾸기
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original)); // 어떻게 나올까?
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
