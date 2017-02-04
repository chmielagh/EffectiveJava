package Model;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by kchmiel on 04.02.2017.
 */
public class SingletonByField implements Singleton, Serializable {
   public static final SingletonByField INSTANCE = new SingletonByField();

   private SingletonByField() {
   }

   @Override
   public void introduce() {
      System.out.println("Im singleton with access by field");
   }

   private Object readResolve() throws ObjectStreamException {
      return INSTANCE;
   }
}
