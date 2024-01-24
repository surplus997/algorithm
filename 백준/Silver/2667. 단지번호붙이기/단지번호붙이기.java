import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
	static int count = 0;
	public static void point(int[][] arr, int x, int y)
	{
		int[] X = {-1,0,0,1};
		int[] Y = {0,-1,1,0};
		
		if(x < 0 || y < 0 || arr.length <= x || arr[x].length <= y || arr[x][y] == 0)
			return;

		count++;
		arr[x][y] = 0;
		for(int i = 0; i < Y.length; i++)
			point(arr, x+X[i], y+Y[i]);
		
	}
	
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int index = Integer.parseInt(br.readLine());
        int[][] arr= new int[index][index];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++)
		{
        	String str = br.readLine();
        	for(int j = 0; j < arr[i].length; j++)
        		if(str.charAt(j) == '1')
        			arr[i][j] = 1;
		}
        
        for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(arr[i][j] == 1)
				{
					point(arr,i,j);
					list.add(count);
					count = 0;
				}
			}
		}
        
        Collections.sort(list);
        
        sb.append(list.size()).append("\n");
        for(int i = 0; i < list.size(); i++)
			sb.append(list.get(i)).append("\n");
        
        System.out.println(sb);
    }

}