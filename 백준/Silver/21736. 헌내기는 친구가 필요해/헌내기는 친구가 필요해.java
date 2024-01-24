import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
	static int friend = 0;
	public static void point(char[][] arr, int x, int y)
	{
		int[] X = {-1,0,0,1};
		int[] Y = {0,-1,1,0};
		
		if( x<0 || y<0 || x>=arr.length ||  y>=arr[x].length || arr[x][y] == ' ' || arr[x][y] == 'X')
			return;
		
		char value = arr[x][y];
		if(value == 'P')
			friend++;
		
		arr[x][y] = ' ';

        for(int i = 0; i < Y.length; i++)
			point(arr, x+X[i], y+Y[i]);
		
	}
	
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        char[][] arr = new char[Integer.parseInt(st.nextToken())][];
        
        int x = -1;
        int y = -1;
        
        boolean isPass = true;
        for(int i = 0; i < arr.length; i++)
		{
        	arr[i] = br.readLine().toCharArray();
        	if(isPass)
	        	for(int j = 0; j < arr[i].length; j++)
					if(arr[i][j] == 'I')
					{
						x = i;
						y = j;
						isPass = false;
						break;
					}
		}
        br.close();

        point(arr, x, y);
        
        
        if(friend > 0)
        	System.out.println(friend);
        else
        	System.out.println("TT");
    }
}