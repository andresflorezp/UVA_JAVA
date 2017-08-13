import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LIS {
	static int M[];
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		M = new int[5];
		for(int i=0;i<5;i++){
			M[i]=Integer.parseInt(st.nextToken());
	
		}
		System.out.println(f());
	}
	static int f(){
		int [] dp=new int[5];
		int maxi = Integer.MIN_VALUE;
		for(int i=0;i<5;i++)dp[i]=1;
		for(int i=1;i<5;i++){
			for(int j=0;j<i;j++){
				if(M[i]>M[j] && dp[i]<=dp[j]){
					dp[i]=dp[j]+1;
					if (dp[i]>maxi)maxi=dp[i];
	
				}
		
				
			}
			
			
			
		}
		System.out.println(Arrays.toString(dp));
		return maxi;
		
		
		
		
	}
}
