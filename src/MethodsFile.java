import java.io.*;
import java.util.regex.*;
/**
 * 
 * @author Guillermo Morillo
 *  methods to read and write to/in file
 */
public class MethodsFile {
  /**
   * Method to read File and save in array the results
   * @param sourceFile file to read from
   * @param years Array that contains the years read
   * @throws FileNotFoundException
   * @throws IOException
   */
  public static int readFile(String sourceFile, int[] years) throws FileNotFoundException, IOException {
    String cadena;
    int countItems = 0;
    int year;
    FileReader f = new FileReader(sourceFile);
    BufferedReader b = new BufferedReader(f);
    Pattern p = Pattern.compile("[0-9]{4}");
    
    while ((cadena = b.readLine()) != null) {
      Matcher m = p.matcher(cadena);
      if (m.find()) {
        year = Integer.parseInt(cadena);
        years[countItems] = year;
        countItems++;
      }
    }
    b.close();
    return countItems;
  }
  /**
   * Write in a file the contain of Array leapYears
   * @param destFile file where write the result 
   * @param leapYears Array that contains years and if are or are not leap
   * @throws IOException
   */
  public static void writeFile (String destFile, String[] leapYears) throws IOException {
    File file = new File(destFile);
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    for (int i = 0; i < leapYears.length-1; i++) {
       bw.write(leapYears[i]);
       bw.newLine();
    }
    bw.close();
  }
  
}
