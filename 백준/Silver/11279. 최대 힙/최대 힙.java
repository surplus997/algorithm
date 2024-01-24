import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int index = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < index; i++)
		{
        	int val = Integer.parseInt(br.readLine());
        	
    		if(val == 0)
    		{
    			if(queue.peek() == null)
    				sb.append(0);
    			else
    				sb.append(queue.poll());
    			sb.append("\n");
    		}
    		else
    			queue.offer(val);
		}
        
        System.out.println(sb);
    }
}