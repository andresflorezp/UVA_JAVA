import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Longest {
	static char[] C1,C2;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			String guarda=in.readLine();
			if(guarda==null)break;
			C1=guarda.toCharArray();
			C2=in.readLine().toCharArray();
			System.out.println(g(C1.length,C2.length));
			
			
			
			
		}

	}
//	static int f(int i,int j){
//		if(i==0 || j==0)return 0;
//		else if(C1[i-1]==C2[j-1])return 1+f(i-1,j-1);
//		else return Math.max(f(i-1,j), f(i,j-1));
//		
//		
//		
//		
//		
//		
//	}
	static int g(int n,int m){
		int M[][] = new int[n+1][m+1];
		for(int i=0;i<=n;i++)for(int j=0;j<=m;j++){
			if(i==0 || j==0)M[i][j]= 0;
			else if(C1[i-1]==C2[j-1])M[i][j]= 1+M[i-1][j-1];
			else M[i][j]= Math.max(M[i-1][j], M[i][j-1]);
			
			
			
		}
		return M[n][m];
		
		
		
		
		
	}

}
