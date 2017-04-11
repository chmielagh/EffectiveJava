package Controller;

import Model.Singleton;
import Model.SingletonByField;
import Model.SingletonByMethod;
import Model.SingletonEnum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kchmiel on 04.02.2017.
 */
public class Controller {

   public static void main(String[] args) {

      List<Singleton> singletons = new LinkedList<>(
            Arrays.asList(SingletonByField.INSTANCE, SingletonByMethod.getInstance(), SingletonEnum.INSTANCE));

      singletons.forEach(Singleton::introduce);
   }
}
