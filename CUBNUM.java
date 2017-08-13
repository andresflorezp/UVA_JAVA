import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CUBNUM {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		int conta=1;
		for(;;){
			String linea = in.readLine();
			if(linea==null)break;
			int n = Integer.parseInt(linea);
			int k=(int) Math.cbrt(n);
			pr.println("Case #"+conta+": "+g(n,k+10));
			conta++;
			
		}
		pr.close();

	}
//	static int f(int n,int k){
//		if(n==0)return 0;
//		else if(k==0 && n>0)return Integer.MAX_VALUE;
//		else if((k*k*k)>n)return f(n,k-1);
//		else return Math.min(f(n,k-1), 1+f(n-(k*k*k),k));
//	}
	static int g(int n,int k){
		int dp[][]= new int[n+1][k+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=k;j++){
				if(i==0)dp[i][j]=0;
				else if(j==0 && i>0)dp[i][j]=Integer.MAX_VALUE;
				else if((j*j*j)>i)dp[i][j]=dp[i][j-1];
				else {
					if(dp[i-(j*j*j)][j]==Integer.MAX_VALUE)dp[i][j]=dp[i][j-1];
					else{
					dp[i][j]=Math.min(dp[i][j-1], 1+dp[i-(j*j*j)][j]);
					}
				}
				
				
				
			}
			
			
			
		}
		return dp[n][k];
		
		
		
	}
}
