import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Dancing_Cows {
	static ArrayList<Integer> C,B;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String casos= in.readLine();
		StringTokenizer st = new StringTokenizer(casos);
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		C = new ArrayList();
		B = new ArrayList();
		for(int i=0;i<N;i++)C.add(Integer.parseInt(in.readLine()));
		for(int j=0;j<M;j++)B.add(Integer.parseInt(in.readLine()));
		Collections.sort(C);
		Collections.sort(B);
		System.out.println(g(N,M));
			
		
	}
//	static int f(int i,int j){
//		if(i==0 && j==0 )return 0;
//		else if(i==0 && j>0)return 0;
//		else if(i>0 && j==0)return Integer.MAX_VALUE;
//		else {
//			if(f(i-1,j-1)==Integer.MAX_VALUE)return f(i,j-1);
//			else return Math.min(f(i,j-1),Math.abs(C[i-1]-B[j-1])+f(i-1,j-1));
//		}
//	}
	static int g(int n,int m){
		int dp[][]= new int[n+1][m+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=m;j++){
				if(i==0 && j==0 )dp[i][j]= 0;
				else if(i==0 && j>0)dp[i][j]= 0;
				else if(i>0 && j==0)dp[i][j] =Integer.MAX_VALUE;
				else {
					if(dp[i-1][j-1]==Integer.MAX_VALUE)dp[i][j] =dp[i][j-1];
					else dp[i][j]= Math.min(dp[i][j-1],Math.abs(C.get(i-1)-B.get(j-1))+dp[i-1][j-1]);
				}
				
				
				
				
			}
			
			
			
			
			
		}
		return dp[n][m];
		
		
		
	}
}
