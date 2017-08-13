import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Testing {
	static ArrayList<Integer> M;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int count=1;
		for(;;){
			int valor = Integer.parseInt(in.readLine());
			M = new ArrayList();
			if (valor==-1)break;
			System.out.println();
			M.add(valor);
			for(;;){
				valor=Integer.parseInt(in.readLine().trim());
				if(valor==-1){
					
					Collections.reverse(M);
					System.out.println("Test #" + count + ":");
					if(f()==Integer.MIN_VALUE)System.out.println("  maximum possible interceptions: " + 1);
					else System.out.println("  maximum possible interceptions: " + f());
					break;
				}
				M.add(valor);
			}
			count++;

		}
	}
	static int f(){
		int C[] = new int[M.size()];
		for(int i=0;i<M.size();i++)C[i]=1;
		
		int maxi=Integer.MIN_VALUE;
		for(int i=1;i<M.size();i++){
			for(int j=0;j<i;j++){
				if(M.get(j)<=M.get(i) && C[j]>=C[i] ){
					C[i]=C[j]+1;
					if(maxi<C[i])maxi=C[i];
					
					
				}
				
				
				
			}
			
			
		}
		return maxi;
		
		
		
		
	}
}
