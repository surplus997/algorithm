import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
//		ATM
//		https://www.acmicpc.net/problem/11399
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		num = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			num += arr[i];
			sum += num; 
		}
		System.out.println(sum);
		
		
	}
}