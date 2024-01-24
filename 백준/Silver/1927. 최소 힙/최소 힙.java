import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1,o2)->{
        	return o1-o2;
        });
        
        for(int i = 0; i < num; i++)
		{
        	int val = Integer.parseInt(br.readLine());
        	if(val == 0)
			{
				if(heap.peek() == null)
					sb.append(0);
				else
					sb.append(heap.poll());
				sb.append("\n");
            }
            else
        		heap.offer(val);
		}
        
        System.out.println(sb);
    }
}