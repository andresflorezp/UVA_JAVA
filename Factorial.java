import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Factorial {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		PrintWriter pr = new PrintWriter(System.out);
		for(int i=0;i<T;i++){
			int L =Integer.parseInt(in.readLine());
			pr.println(f(L));
			
			
			
		}
		pr.close();

	}
	static BigInteger f(int n){
		BigInteger Total = BigInteger.ONE;
		for(int i=1;i<=n;i++){
			Total=Total.multiply(BigInteger.valueOf(i));
			
			
		}
		return Total;
		
		
		
	}

}
