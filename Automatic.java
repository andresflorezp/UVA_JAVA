import java.io.*;
import java.util.*;

public class Automatic {
	public static void main(String[] args)throws Exception {
		  
        BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int elementos[]=new int[n];             //Tipos para escoger
        int r = elementos.length; 
        //Elementos elegidos
        ArrayList<Integer> guarda = new ArrayList<Integer>();
        		
        Perm2(elementos, guarda, n, r);
    }

    	static void Perm2(int[] elem,ArrayList<Integer> guarda, int n, int r) {
        if (n == 0) {
            System.out.println(guarda);
        } else {
            for (int i = 0; i < r; i++) {
            	if(!guarda.contains(elem[i])){
            		guarda.add(elem[i]);
                    Perm2(elem,guarda , n - 1, r);
            }
            }
        }
    }
}
