package Controller;

import Model.Stack;

/**
 * Created by kchmiel on 04.02.2017.
 */
public class Controller {

   public static void main(String[] args) {
      Stack stack = new Stack();
      stack.push("A");
      stack.push("B");
      stack.push("C");
      stack.push("D");
      stack.push("E");
      stack.push("F");
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
   }
}
