import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MCD {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(MCD(a,b));
	}
	static int GCD(int a ,int b){
		//No es bueno porque en el peor de los casos tenemos que recorrer todo O(n);
		int minimo = Math.min(a, b);
		for(int i=minimo;i>1;i--){
			if(a%i==0 && b%i==0)return i;
			
		}
		return 1;

	}
	static int MCD(int a,int b){
		if(b==0)return a;
		else return MCD(b,a%b);
		
		
		
	}
}
