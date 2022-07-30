package action;

import behavior.QuackBehavior;

/**
 * @author Liam.W
 * @date
 */
public class Squeak implements QuackBehavior {
   @Override
   public void quack() {
      System.out.println("action.Squeak~action.Squeak~ ");
   }
}
