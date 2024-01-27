import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int cnt = 1;
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int def = Integer.parseInt(st.nextToken());
	int val = Integer.parseInt(st.nextToken());
	
	while(true)
	{
		if(val == def)
			break;
		else if(val < def)
		{
			cnt = -1;
			break;
		}
		
		cnt++;
		if(val % 2 == 0)
			val /= 2;
		else if(val % 10 == 1)
			val /= 10;
		else
		{
			cnt = -1;
			break;
		}
	}
	
	
	System.out.println(cnt);
	}
}