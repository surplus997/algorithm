import java.util.Scanner;

public class Main {
	// 초콜릿 자르기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int col = sc.nextInt();
		int row = sc.nextInt();
		
		System.out.println(col*row-1);
	}

}