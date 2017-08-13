import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Palindromo {
	static char[] P;
	static int M[][];
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		P=in.readLine().toCharArray();
		M= new int[P.length+1][P.length+1];
		for(int[] b:M)Arrays.fill(b, -1);
		System.out.println(f(0,P.length-1));

	}
	
	static int f(int i ,int j){
		if (i>=j)return 0;
		if( M[i][j]!=-1)return M[i][j];
		else if(P[i]==P[j])return f(i+1,j-1);
		else return M[i][j]=1+Math.min(f(i,j-1),Math.min(f(i+1,j-1),f(i+1,j)));
			
	}
	

}
