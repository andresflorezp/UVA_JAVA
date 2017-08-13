import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Battery {
static int M[];
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T =Integer.parseInt(in.readLine());
		for(int i=0;i<T;i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			int n= Integer.parseInt(st.nextToken());
			int m= Integer.parseInt(st.nextToken());
			M = new int[n];
			StringTokenizer V = new StringTokenizer(in.readLine());
			for(int j=0;j<n;j++){
				
				M[j]=Integer.parseInt(V.nextToken());
				
				
				
				
			}
			System.out.println(g(n,m));
			
			
			
			
			
			
		}

	}
	
	static int f(int i,int k){
		if(k<=0)return 0;
		else if(i==0 && k>0)return Integer.MAX_VALUE;
		else{
			if(f(i-1,k-M[i-1])==Integer.MAX_VALUE)return f(i-1,k-M[i-1]);
			return Math.min(f(i-1,k), 1+f(i-1,k-M[i-1]));
			
			
			
		}
		
		
		
		
		
		
	}
	static int g(int n,int k){
		int dp[][]= new int[n+1][k+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=k;j++){
				if(j<=0)dp[i][j]=0;
				else if(i==0 && j>0)dp[i][j]=Integer.MAX_VALUE;
				else{
					if(dp[i-1][k-M[i-1]]==Integer.MAX_VALUE)dp[i][j]=dp[i-1][k-M[i-1]];
					else dp[i][j]=Math.min(dp[i-1][j], 1+dp[i-1][j-M[i-1]]);
					
					
					
				}
				
				
				
				
				
			}
			
			
			
		}
		return dp[n][k];
		
		
		
		
	}
}
