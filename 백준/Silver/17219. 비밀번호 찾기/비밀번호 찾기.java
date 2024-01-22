import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int siteCnt = Integer.parseInt(st.nextToken());
	int searchCnt = Integer.parseInt(st.nextToken());
	
	HashMap hash = new HashMap();
	
	for (int i = 0; i < siteCnt; i++) 
	{
		st = new StringTokenizer(br.readLine());
		hash.put(st.nextToken(), st.nextToken());
	}
	for (int i = 0; i < searchCnt; i++) 
	{
		st = new StringTokenizer(br.readLine());
		sb.append(hash.get(st.nextToken())).append("\n");
	}
	
	System.out.println(sb);
	}
}