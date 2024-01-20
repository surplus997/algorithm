import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int index = Integer.parseInt(br.readLine());
	
	PriorityQueue<Integer> que = new PriorityQueue<Integer>((o1,o2)->{
		return Math.abs(o1)-Math.abs(o2) == 0 ? o1>o2?1:-1 : Math.abs(o1)-Math.abs(o2);
	});
	
	for (int i = 0; i < index; i++) 
	{
		int idx = Integer.parseInt(br.readLine());
        
        if(idx == 0)
        	sb.append(que.peek() == null ? 0 : que.poll()).append("\n");
        else
        	que.offer(idx);

	}
	
	System.out.println(sb);
	}
}