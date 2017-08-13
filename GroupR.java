import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GroupR {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			String linea = in.readLine();
			if(linea.equals("0"))break;
			StringTokenizer st = new StringTokenizer(linea);
			int G=Integer.parseInt(st.nextToken());
			String P=st.nextToken();
			f(G,P);
			
			
		}
	}
	static void f(int n,String P){
		StringBuilder sb = new StringBuilder();
		String re="";
		String re2="";
		for(int i=0;i<P.length();i++){
			if(i>n && i%n==0){
				for(int j=re.length()-1;j>=0;j--){
					re2+=re.charAt(j);
					
					
				}
				sb.append(re2);
				re="";
				re2="";
				
				
			}
			else{
				re+=P.charAt(i);
				
				
			}
			
			
			
			
			
		}
		System.out.println(sb);
		
		
		
		
		
	}

}
