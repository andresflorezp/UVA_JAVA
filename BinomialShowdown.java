import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomialShowdown {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			String linea = in.readLine();
			if(linea.equals("0 0"))break;
			StringTokenizer st = new StringTokenizer(linea);
			long n = Long.parseLong(st.nextToken());
			System.out.println((int)n);
			long k = Long.parseLong(st.nextToken());
			System.out.println(C(n,k));
			
		}
	}
//	static int c(int n ,int k){
//		if(n==k)return 1;
//		else if(k==0)return 1;
//		else{
//			return c(n-1,k)+c(n-1,k-1);
//			
//		}
//		
//		
//		
//	}
	static long C(long n,long k){
		System.out.println(n +" "+k);
		long dp[][]= new long[(int) (n+1)][(int) (k+1)];
		for(long i=0;i<=n;i++){
			for(long j=0;j<=k;j++){
				if(i==j)dp[(int) i][(int) j]=1;
				
				else if(j==0 || i==0)dp[(int) i][(int) j]=1;
				else dp[(int) i][(int) j]=dp[(int) (i-1)][(int) j]+dp[(int) (i-1)][(int) (j-1)];
				
				
				
				
			}
			
			
		}
		return dp[(int) n][(int) k];
		
		
		
	}


}
