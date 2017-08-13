import java.util.*;
import java.io.*;

public class AdaQueue {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Deque A = new ArrayDeque();
		int T = Integer.parseInt(in.readLine());
		for(int i=0;i<T;i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			String val = st.nextToken();
			if(val.equals("toFront"))A.offerFirst(st.nextElement());
			if(val.equals("push_back"))A.offerLast(st.nextElement());
			if(val.equals("back")){
				if(!A.isEmpty())System.out.println(A.removeLast());
				else System.out.println("No job for Ada?");
			}
			if(val.equals("front")){
				if(!A.isEmpty())System.out.println(A.remove());
				else System.out.println("No job for Ada?");
				
				
			}
			if(val.equals("reverse")){
				A.toArray();
				Collections.reverse((List<?>) A);
			}
			
		}
	}

}
