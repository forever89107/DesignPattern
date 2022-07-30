package action;

import behavior.QuackBehavior;

/**
 * @author Liam.W
 * @date 2022/07/30
 */
public class Quack implements QuackBehavior {
   @Override
   public void quack() {
      System.out.println("action.Quack~action.Quack~ ");
   }
}
