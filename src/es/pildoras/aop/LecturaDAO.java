package es.pildoras.aop;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class LecturaDAO {

	public void lecturaFichero() {
		try {
			File f = new File("src\\es\\pildoras\\aop\\FICHERO_AOP.txt");
			Scanner sc = new Scanner(f);
			Set<String> lecturas = new HashSet<>();
			while(sc.hasNextLine()) {
				String linea = sc.nextLine();
				lecturas.add(linea);
			}
			sc.close();
			System.out.println("lecturas con set:");
			for(String s: lecturas) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
			System.out.println("Error en la lectura del fichero");
		}
	}
}
