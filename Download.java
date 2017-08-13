import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Download {
	static int T[],D[];
	static int S;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n= Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		T = new int[n];
		D = new int[n];
		for(int i=0;i<n;i++){
			st = new StringTokenizer(in.readLine());
			T[i]=Integer.parseInt(st.nextToken());
			D[i]=Integer.parseInt(st.nextToken());
			
		}
		System.out.println(f(0,S));
		
		
		
		

	}
	static int f(int i,int S){
		if(S==0)return 0;
		else if(i>=T.length && S>0)return Integer.MAX_VALUE;
		else if(D[i]>S)return f(i+1,S);
		else return Math.min(f(i+1,S), T[i]+f(i,S-D[i]));

		
	}

}
