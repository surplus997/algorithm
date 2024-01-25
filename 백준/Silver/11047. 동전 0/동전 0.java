import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int cnt = 0;
	int[] arr = new int[Integer.parseInt(st.nextToken())];
	int value = Integer.parseInt(st.nextToken());
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = Integer.parseInt(br.readLine());
	}
	for (int i = arr.length-1; i >= 0; i--) {
		cnt += value/arr[i];
		value %= arr[i];
	}
	
	System.out.println(cnt);
	}
}