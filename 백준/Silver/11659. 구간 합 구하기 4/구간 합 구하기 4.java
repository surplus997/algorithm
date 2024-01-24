import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int index = Integer.parseInt(st.nextToken());
        int testCnt= Integer.parseInt(st.nextToken());
        int total = 0;
        int[] arr = new int[index];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++)
        {
        	arr[i] = Integer.parseInt(st.nextToken());
        	total += arr[i];
        }
        for(int i = 0; i < testCnt; i++)
		{
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			int min = Integer.parseInt(st.nextToken());
			int max = Integer.parseInt(st.nextToken());
            
			if(max-min+1 > arr.length/2)
			{
				for(int j = 0; j < min-1; j++)
					sum += arr[j];
				for(int j = arr.length-1; j >= max; j--)
					sum += arr[j];
                sum = total-sum;
			}
			else
			{
				for(int j = min-1; j < max; j++)
					sum += arr[j];
			}
			
			sb.append(sum).append("\n");
		}
        
        System.out.println(sb);
    }
}