import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        String str = br.readLine();
        boolean isPass = true;
        int value = 0;
        int cnt = 0;
        for(char ch : str.toCharArray())
		{
			if((ch == 'I') == isPass)
			{
				isPass = !isPass;
				cnt++;
			}
			else
			{
				isPass = true;

				if(cnt > N*2)
					value += (cnt-N*2-1)/2+1;

				cnt = 0;
                if((ch == 'I') == isPass)
    			{
    				isPass = !isPass;
    				cnt++;
    			}
			}
		}
        if(cnt > N*2)
			value += (cnt-1-N*2)/2+1;
        
        System.out.println(value);
    }
}