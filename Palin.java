import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Palin {
	static char[] C1;
	static int[][] dp;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(in.readLine());
		for(int i=0;i<casos;i++){
			C1 = in.readLine().toCharArray();
			dp= new int[C1.length+1][C1.length+1];
			for(int j=0;j<C1.length;j++)Arrays.fill(dp[j], -1);
			System.out.println("Case "+ (i+1)+": "+f(0,C1.length-1));
			
		}
	}
	static int f(int i ,int j){
		if (i>=j)return 0;
		if( dp[i][j]!=-1)return dp[i][j];
		else if(C1[i]==C1[j])return f(i+1,j-1);
		else return dp[i][j]=1+Math.min(f(i+1,j),Math.min(f(i,j-1),f(i+1,j-1)));
			
	}
	
}
