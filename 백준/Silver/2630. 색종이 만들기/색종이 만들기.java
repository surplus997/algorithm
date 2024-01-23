import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int cnt0 = 0;
	static int cnt1 = 0;
	
	public static void divide(int[][] arr, int x, int y, int cnt)
	{
		int value = arr[x][y];
		boolean isPass = true;
		
		for(int i = x; i < x+cnt; i++)
		{
			for(int j = y; j < y+cnt; j++)
			{
				if(arr[i][j] != value)
				{
					i = x+cnt;
					isPass = false;
					break;
				}
			}
		}
		if(isPass)
		{
			if(value == 1)
				cnt1++;
			else if(value == 0)
				cnt0++;
		}
		else
		{
			divide(arr, x, y, cnt/2);
			divide(arr, x, y+cnt/2, cnt/2);
			divide(arr, x+cnt/2, y, cnt/2);
			divide(arr, x+cnt/2, y+cnt/2, cnt/2);
		}
	}
	
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[index][index];
        
        for(int i = 0; i < arr.length; i++)
		{
        	StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
        br.close();
        
        divide(arr, 0, 0, index);
        
        
        System.out.println(cnt0+"\n"+cnt1);
    }
}