package op;
import java.io.*;
public class Operar  {
	int num1;
	int num2;
	int sumar;
	int restar;
	int division;
	int multiplicar;
	
	public void leer() throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		num1= Integer.parseInt(in.readLine());
		num2= Integer.parseInt(in.readLine());
		
	}
	public void suma(){sumar=num1+num2;}
	public void resta(){restar=num1-num2;}
	public void multiplica(){multiplicar=num1*num2;}
	public void divide(){division=num1/num2;}
	public void mostar(){
		System.out.println(sumar);
		System.out.println(restar);
		
	
	}
		
		
		
	

}
