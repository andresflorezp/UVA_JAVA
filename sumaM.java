import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sumaM {
	static int M[];
	static int MAX,MIN;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int i=0;i<T;i++){
			int n= Integer.parseInt(in.readLine());
			M = new int[n];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int j=0;j<n;j++){
				M[j]=Integer.parseInt(st.nextToken());
				
				
				
				
			}
			f();
			System.out.println(MAX+" "+MIN);
			
			
			
		}
		
	}
	static void f(){
		MAX = Integer.MIN_VALUE;
		MIN = Integer.MAX_VALUE;
		for(int i=0;i<M.length;i++){
			for(int j=i+1;j<M.length;j++){
				if((M.length/2)*Math.abs(M[i]-M[j])>MAX){
					MAX=(M.length/2)*Math.abs(M[i]-M[j]);
					System.out.println(M[i]+" "+M[j]);
				}
				if((M.length/2)*Math.abs(M[i]-M[j])<MIN)MIN=(M.length/2)*Math.abs(M[i]-M[j]);
				
				
				
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}
}
