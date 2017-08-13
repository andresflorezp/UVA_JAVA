import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Esprimo {
	static int M[][];
	static int conta;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		M = new int[n][n];
		for(int i=0;i<n;i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int j=0;j<n;j++){
				M[i][j]=Integer.parseInt(st.nextToken());
		
			}
			
			
			
			
			
		}
		sumarM();
		System.out.println(conta);
	}
	static void sumarM(){
		int dx[]={1,0,-1,0};
		int dy[]={0,-1,0,1};
		int total=0;
		for(int i=0;i<M.length;i++){
			
			for(int j=0;j<M.length;j++){
				total=0;
				for(int k=0;k<4;k++){
					if(i+dx[k]<M.length && i+dx[k]>=0 && j+dy[k]<M.length && j+dy[k]>=0){
						total+=M[i+dx[k]][j+dy[k]];
						
						
						
					}
					
					
					
					
				}
				
				conta+=f(total);
				
				
				
			}
			
			
			
		}
		
		
		
		
		
	}
	static int f(int V){
		BigInteger val = BigInteger.valueOf(V);
		if(val.isProbablePrime(20)){
			return 1;
		}
		else return 0;
		
		
		
		
	}
}
