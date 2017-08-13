import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LCS {
	static char[] A,B;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		A=in.readLine().toCharArray();
		B=in.readLine().toCharArray();
		System.out.println(g(A.length,B.length));
	}
	static int f(int i,int j){
		if(i==0 || j==0)return 0;
		else if(A[i-1]==B[j-1])return 1+f(i-1,j-1);
		else{
			return Math.max(f(i-1,j),f(i,j-1));
			
			
		}
		
		
		
		
	}
	static int g(int n,int m){
		int M[][]= new int[n+1][m+1];
		M[0][0]=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if (A[i-1]==B[j-1])M[i][j]=1+M[i-1][j-1];
				else{
					M[i][j]=Math.max(M[i-1][j], M[i][j-1]);
					
					
				}
				
				
			}
			
			
			
		}
		
		
	return M[n][m];	
	}
}
