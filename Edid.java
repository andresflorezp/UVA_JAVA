import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Edid {
	static char C1[],C2[];
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(in.readLine());
		for(int i=0;i<casos;i++){
			C1 =in.readLine().toCharArray();
			C2 =in.readLine().toCharArray();
			System.out.println(g(C1.length,C2.length));
			
		}
		
	}
	static int g(int n,int m){
		int M[][]= new int[n+1][m+1];
		for(int j=0;j<=m;j++){
			M[0][j]=j;
			
			
		}
		for(int i=0;i<=n;i++){
			M[i][0]=i;			
			
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(C1[i-1]==C2[j-1])M[i][j]=M[i-1][j-1];
				else{
					M[i][j]=1+Math.min(M[i-1][j], Math.min(M[i][j-1],M[i-1][j-1] ));
					
					
				}

				
			}
			
			
		}
		return M[n][m];
		
		
		
		
	}
}
