import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
	public static int plus(String str)
	{
		int value = 0;
		StringTokenizer add = new StringTokenizer(str);
		
		while(add.hasMoreTokens())
		{
			value += Integer.parseInt(add.nextToken("+"));
		}
		return value;
	}
	
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        int value = plus(st.nextToken("-")); 
        while(st.hasMoreTokens())
        	value -= plus(st.nextToken());
        
        
        System.out.println(value);
    }
}