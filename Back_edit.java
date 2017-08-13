import java.util.*;
import java.io.*;

public class Back_edit {
	static int[] C1,C2;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int caso = Integer.parseInt(in.readLine());
		int count=1;
		for(int i=0;i<caso;i++){
			int T = Integer.parseInt(in.readLine());
			C1= new int[T];
			C2= new int[T];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int j=0;j<C1.length;j++){
				C1[j]=Integer.parseInt(st.nextToken());
				
			}
			st = new StringTokenizer(in.readLine());
			for(int h=0;h<C2.length;h++){
				C2[h]=Integer.parseInt(st.nextToken());
				
			}
			System.out.println("Case "+count+": "+ f(C1.length,C2.length));
			count++;	
			
		}

	}
	static int f(int n,int m){
		int M[][]= new int[n+1][m+1];
		for(int i=0;i<=n;i++)for(int j=0;j<=m;j++){
			if(i==0)M[i][j]=j;
			else if(j==0)M[i][j]=i;
			else if(C1[i-1]==C2[j-1])M[i][j]=M[i-1][j-1];
			else{
				M[i][j]=1+Math.min(M[i-1][j], M[i][j-1]);
				
				
			}
	
		}
		return M[n][m];
		
		
		
	}
}
