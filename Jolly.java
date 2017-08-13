import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Jolly {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()){
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int tamano=Integer.parseInt(st.nextToken());
			long C[]=new long[tamano];
			int i=0;
			while(st.hasMoreTokens()){
				C[i]=Long.parseLong(st.nextToken());
				
				i++;
			}
			System.out.println(eleccion(C));
			
			
		}
		sc.close();
		
		

	}
	public static String eleccion(long[] C){
		int count=0;
		ArrayList L = new ArrayList();
		for(int i=0;i<C.length-1;i++){
			L.add(Math.abs(C[i]-C[i+1]));
			
			
		}
		Collections.sort(L);
		boolean veri=true;
		for(int j=0;j<L.size()-1;j++){
			if(Math.abs((long)L.get(j)-(long)L.get(j+1))!=1){
				veri=false;
			
			}	
		}
		if(veri)return "Jolly";
		else return"Not jolly";
		
	}
}
