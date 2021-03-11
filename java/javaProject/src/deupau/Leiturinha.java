package deupau;

import java.io.File; //input output
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Leiturinha {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\temp\\lista.txt"); 
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException erro) {
			System.out.println("Arquivo n�o encontrado");
		}
		
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	
	}

}
