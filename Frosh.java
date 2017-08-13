import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Frosh {
	static int M[];
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
		String linea=in.readLine();
		if(linea == null)break;
		int caso = Integer.parseInt(linea);
		M=new int[caso];
		for(int i=0;i<caso;i++)M[i]=Integer.parseInt(in.readLine());
		System.out.println(bubble());
		}

	}
	static int bubble(){
		int conta=0;
		for(int i=M.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(M[j]>M[j+1]){
					
					M[j] = M[j] ^ M[j+1] ^ (M[j+1] = M[j]);
					conta++;
					
					
					
				}
				
				
				
			}
			
			
		}
		return conta;
		
		
		
		
		
	}
}
