package while_;

public class TestClass07 {

	public static void main(String[] args) {

//		for (int k =0; k < 3; k++) {
//			System.out.println("===상위 반복문 시작");
//			for(int i = 0; i < 3; i++) {
//				System.out.println(i + ".for");
//			}
//			
//			System.out.println("상위 반복문 끝===");
//		}
//		
		int i = 0;
		int k = 0;
		while (k < 3) {
			System.out.println("===상위 반복문 시작");
//			for(i = 0; i < 3; i++) {
//				System.out.println(i + ".for");
//			}
//			System.out.println("상위 반복문 끝===");
//			k++;
			while( i < 3) {
				System.out.println(i + ".for");
				i++;
			}
		}
	}

}
