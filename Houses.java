import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Houses {
static int M[][];
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int i=0;i<T;i++){
			int N = Integer.parseInt(in.readLine());
			M = new int[N][3];
			for(int j =0;j<N;j++){
				StringTokenizer st = new StringTokenizer(in.readLine());
				M[j][0]=Integer.parseInt(st.nextToken());
				M[j][1]=Integer.parseInt(st.nextToken());
				M[j][2]=Integer.parseInt(st.nextToken());
		
			}
			System.out.println(g(N,3));
			
			
			
			
			
			
		}

	}
//	static int f(int i,int j){
//		if(i==0)return 0;
//		else if(i>0 && j==0)return Integer.MAX_VALUE;
//		else{
//			if(f(i-1,j-1)==Integer.MAX_VALUE)return f(i-1,j-1);
//			return Math.min(M[i-1][j-1]+f(i-1,j-1), f(i,j-1));
//	
//		}
		
		
		
		
	
	static int g(int n,int m){
		int dp[][]= new int[n+1][m+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=m;j++){
				if(i==0)dp[i][j]=0;
				else if(i>0 && j==0)dp[i][j]=Integer.MAX_VALUE;
				else{
					if(dp[i-1][j-1]==Integer.MAX_VALUE)dp[i][j]=dp[i-1][j-1];
					else dp[i][j]=Math.min(M[i-1][j-1]+dp[i-1][j-1], dp[i][j-1]);
					
					
					
				}
				
				
				
				
				
				
				
			}
			
			
			
		}
		return dp[n][m];
		
		
		
		
		
		
	}
}
