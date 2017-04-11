package Model;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by kchmiel on 04.02.2017.
 */
public class Stack {
   private Object[] elements;
   private int size = 0;
   private int INITIAL_CAPACITY = 2;

   public Stack() {
      elements = new Object[INITIAL_CAPACITY];
   }

   public void push(Object val) {
      if (!isSizeEnough()) {
         elements = Arrays.copyOf(elements, INITIAL_CAPACITY * 2);
         INITIAL_CAPACITY *= 2;
      }
      elements[size++] = val;

   }

   public Object pop() {
      if (size == 0)
         throw new EmptyStackException();
      Object result = elements[--size];
      elements[size] = null; // ABY ZABEZPIECZYC SIE PRZED WYCIEKIEM PAMIECI!
      return result;
   }

   private boolean isSizeEnough() {
      return (!(size == INITIAL_CAPACITY));
   }
}
