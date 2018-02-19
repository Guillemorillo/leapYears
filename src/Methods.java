public class Methods {
  /**
   * Order elements in array
   * @param years array to order
   * @param items how much items to order
   */
  public static void orderYears (int[] years, int items) {
    // Otra forma es usar Array.sort(years);
    for(int i=0;i<(items-1);i++){
      for(int j=i+1;j<items;j++){
        if(years[i]>years[j]){
          int aux=years[i];
          years[i]=years[j];
          years[j]=aux;
         }
      }
    }
  }
  /**
   * save in array leapYears if a year from array years is leap or is not
   * @param years array with years 
   * @param leapYears array that save in if is leap or is not
   */
  public static void leapYears (int[] years, String[] leapYears) {
    for (int i = 0; i < leapYears.length; i++) {
      if (isLeap(years[i])) {
        leapYears[i] = (years[i] + ";Bisiesto");
      } else {
        leapYears[i] = (years[i] + ";NO Bisiesto");
      }
    }
  }
  /**
   * know if year is leap or is not
   * @param year 
   * @return leap boolean 
   */
  public static boolean isLeap (int year) {
    boolean leap = false;
    if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) { leap = true; }
    return leap;
  }
  
}
