package Model;

/**
 * Created by kchmiel on 04.02.2017.
 */
public enum SingletonEnum implements Singleton {
   INSTANCE;

   @Override
   public void introduce() {
      System.out.println("Im enum singleton with access by field");
   }
}
