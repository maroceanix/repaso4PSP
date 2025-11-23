package repaso4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Valores {

	public static void main(String[] args) {
		File f=new File(".");
		
		try {
			Process p=new ProcessBuilder("java", "repaso4.Hijo").directory(f).start();
			try(BufferedReader brc=new BufferedReader(new InputStreamReader(System.in));
				BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(p.getOutputStream()))){
				System.out.println("Introduce un valor numérico, 0 para finalizar: ");
				String strnum=brc.readLine();
				int num=Integer.parseInt(strnum);
				while(num!=0) {
					bw.write(strnum);
					bw.newLine();
					bw.flush();
					
					strnum=brc.readLine();
					num=Integer.parseInt(strnum);
				}
			
					bw.write("0");
					bw.newLine();
					bw.flush();
						String linea;
						while((linea=br.readLine())!=null) {
							System.out.println(linea);
						
					}
					
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
