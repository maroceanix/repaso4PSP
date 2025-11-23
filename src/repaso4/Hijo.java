package repaso4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hijo {

	public static void main(String[] args) {
		int media=0;
		int cont=0;
		int num=0;
		String linea;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));) {
				while((linea=br.readLine())!=null) {
					num=Integer.parseInt(linea);
					media=media+num;
					cont++;
				}
				media=media/cont;
				System.out.println("La media de estos número es "+media);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
