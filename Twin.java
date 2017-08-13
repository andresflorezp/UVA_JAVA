import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Twin {
	static int[] C1,C2;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int count =1;
		for(;;){
			StringTokenizer st = new StringTokenizer(in.readLine());
			C1=new int[Integer.parseInt(st.nextToken())];
			C2=new int[Integer.parseInt(st.nextToken())];
			if(C1.length==0 && C2.length==0)break;
			st = new StringTokenizer(in.readLine());
			int i=0;
			int j=0;
			while(st.hasMoreTokens()){
				C1[i]=Integer.parseInt(st.nextToken());
				i++;
			}
			st = new StringTokenizer(in.readLine());
			while(st.hasMoreTokens()){
				C2[j]=Integer.parseInt(st.nextToken());
				j++;
			}
			System.out.println("Twin Towers #"+count);
			System.out.println("Number of Tiles : "+f(C1.length,C2.length));
			System.out.println();
			count++;
			
		}

	}
	static int f(int n,int m){
		int M[][]= new int[n+1][m+1];
		for(int i=0;i<=n;i++)for(int j=0;j<=m;j++){
			if(i==0 || j==0)M[i][j]=0;
			else if(C1[i-1]==C2[j-1])M[i][j]=1+M[i-1][j-1];
			else M[i][j]=Math.max(M[i-1][j],M[i][j-1]);
			
			
			
		}
		return M[n][m];
	
	
	}
}
