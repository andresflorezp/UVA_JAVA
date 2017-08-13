import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DBALLZ {
	static long[] T,B;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
		int casos = Integer.parseInt(in.readLine());
		for(int i=0;i<casos;i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			long E = Integer.parseInt(st.nextToken());
			long L = Integer.parseInt(st.nextToken());
			StringTokenizer b = new StringTokenizer(in.readLine());
			StringTokenizer  t= new StringTokenizer(in.readLine());
			B=new long[(int)L];
			T = new long[(int)L];
		for(int j=0;j<L;j++){
			B[j]=Long.parseLong(b.nextToken());
			T[j]=Long.parseLong(t.nextToken());
			
		}
		
		System.out.println(g(E,L));	
		
		}
		}
		catch(Exception ex){System.out.println("Error");}
}
//	static int f(int E,int i){
//		if (i==0) return 0;
//		else if(B[i-1]>E) return f(E,i-1);
//		else return Math.max(f(E,i-1), f(E-B[i-1],i)+T[i-1]);
//
//	}
	static int g(long e,long l){
		int dp[][] = new int[(int) (e+1)][(int) (l+1)];
		for(int i=0;i<=e;i++){
			for(int j=0;j<=l;j++){
				if (j==0 || i==0)dp[i][j]=0;
				else if(B[j-1]>i)dp[i][j]=dp[i][j-1];
				else dp[i][j]=(int) Math.max(dp[i][j-1], dp[(int) (i-B[j-1])][j]+T[j-1]);
				
				
				
			}
			
			
			
		}
		return dp[(int) e][(int) l];	
		
		
		
		
	}
}
