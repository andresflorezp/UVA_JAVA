import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Compromise {
	static ArrayList<String> C1,C2;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea1,linea2;
		loop : for(;;){
		C1=new ArrayList<>();
		C2=new ArrayList<>();
		for(;;){
			linea1=in.readLine();
			if(linea1==null)break loop;
			if(linea1.equals("#"))break;
			StringTokenizer st = new StringTokenizer(linea1);
			while(st.hasMoreTokens()){
				C1.add(st.nextToken());
		
			}
		}
		for(;;){
			linea2=in.readLine();
			if(linea2.equals("#"))break;
			StringTokenizer st = new StringTokenizer(linea2);
			while(st.hasMoreTokens()){
				C2.add(st.nextToken());
		
			}
			
			
		}
		f(C1.size(),C2.size());

	}
	}
	
	static void f(int n,int m){
		int M[][] = new int[n+1][m+1];
		for(int i=0;i<=n;i++)for(int  j=0;j<=m;j++){
			if(i==0 || j==0)M[i][j]=0;
			else if(C1.get(i-1).equals(C2.get(j-1)))M[i][j]=1+M[i-1][j-1];
			else M[i][j]=Math.max(M[i-1][j],M[i][j-1]);
			
			
			
		}
		g(M);
		
		
	}
	static void g(int C[][]){
		int i=C1.size();
		int j=C2.size();
		ArrayList<String> V= new ArrayList();
		while(i>0 && j>0){
			if(C1.get(i-1).equals(C2.get(j-1))){
				V.add(C1.get(i-1));
				i--;
				j--;
				
			}
			else if(C[i-1][j]>=C[i][j-1])i--;
			else j--;
			
			
			
			
		}
		Collections.reverse(V);
		String re="";
		for(String b :V){
			re+=b+" ";
			
		}
		System.out.println(re.trim());

		
		
		
		
		
	}
}
