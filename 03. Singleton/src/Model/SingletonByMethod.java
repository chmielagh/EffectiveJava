package Model;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by kchmiel on 04.02.2017.
 */
public class SingletonByMethod implements Singleton, Serializable {
   private static SingletonByMethod INSTANCE;

   private SingletonByMethod() {
   }

   public static SingletonByMethod getInstance() {
      if (INSTANCE != null)
         return INSTANCE;
      return INSTANCE = new SingletonByMethod();
   }

   @Override
   public void introduce() {
      System.out.println("Im singleton with access by accessor");
   }

   private Object readResolve() throws ObjectStreamException {
      return INSTANCE;
   }
}
