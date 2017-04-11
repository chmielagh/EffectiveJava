package Controller;

/**
 * Created by kchmiel on 04.02.2017.
 */
public class Controller {

   public static void main(String[] args) {
      long start;
      long stop;

      Long sumLong = 0L;
      long sumlong = 0;
      start = System.currentTimeMillis();
      for (int i = 0; i < Integer.MAX_VALUE; i++) {
         sumlong += i;
      }
      stop = System.currentTimeMillis();
      System.out.println("long " + (stop - start));

      start = System.currentTimeMillis();
      for (int i = 0; i < Integer.MAX_VALUE; i++) {
         sumLong += i;
      }
      stop = System.currentTimeMillis();
      System.out.println("Long " + (stop - start));
   }
}
