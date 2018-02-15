import java.io.IOException;
import java.util.Scanner;
/**
 * Prueba Bluu
 * @author Guillermo Morillo Morais 
 * @version 15/02/2018
 *
 */
public class Main {
  /**
   * Main class
   * @param args
   * @throws IOException
   */
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int[] years = new int[100];
		String[] leapYears;
		String fileRead = "";
		String fileWrite = "";
		int countItems = 0;
		
		System.out.println("Indica ruta del archivo a leer: ");
		fileRead = sc.nextLine();
		System.out.println("Indica ruta del archivo para los resultados: ");
		fileWrite = sc.nextLine();
		sc.close();
		
		countItems = MethodsFile.readFile(fileRead, years);
		Methods.orderYears(years, countItems);
		leapYears = new String[countItems];
		Methods.leapYears(years, leapYears);
		MethodsFile.writeFile(fileWrite, leapYears);
		
	}

}
