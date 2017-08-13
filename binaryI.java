import java.util.*;

public class binaryI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> L = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		while(st.hasMoreTokens())L.add(Integer.parseInt(st.nextToken()));
		int val = Integer.parseInt(sc.nextLine());
		System.out.println(binary(L,val));
	}
	public static int binary(ArrayList<Integer> C,int x){
		int i=0;
		int j = C.size()-1;
		while(true){
			int mid = (i+j)/2;
			if (C.get(mid)==x)return mid;
			else if(i>=j)return -1;
			else{
				if (C.get(mid)>x){
					j=mid-1;
				}
				else{
					i=mid+1;
				}
				
			}
			
			
		}
		
		
	}

}
