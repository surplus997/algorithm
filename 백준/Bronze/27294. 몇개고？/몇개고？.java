import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int time = sc.nextInt();
		int sul = sc.nextInt();
		boolean	lunch = 12 <= time && time <= 16;
		boolean sulToF = sul == 1;
		if (!lunch || sulToF) {
			System.out.println(280);
		}else if(lunch && !sulToF){
			System.out.print(320);
		}
	}
}
