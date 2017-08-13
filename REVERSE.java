import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class REVERSE {
	static char C[];
    public static void main(String args[])throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        for(int i=0;i<T;i++){
        	ArrayList V= new ArrayList();
        	
            C= in.readLine().toCharArray();
            for(int j=0;j<C.length;j++){
            	V.add(C[j]);
            	
            	
            	
            	
            }
            System.out.println(f());
            
            
        }
        
        
        
        
    }
    static int f(){
        HashSet M = new HashSet();
        for(int i=1;i<=C.length;i++){
          char aux=C[C.length-1];  
            for(int j=C.length-2;j>=0;j--){
                C[j+1]=C[j];
                
                
            } 
            C[0]=aux;
            M.add(C);
            
            
        }
        return M.size();
        
        
    
    
    
    
}
}
