package action;

import behavior.FlyBehavior;

/**
 * @author Liam.W
 * @date 2022/07/30
 */
public class FLYWithWings implements FlyBehavior {
   @Override
   public void fly() {
      System.out.println("Fly with wings.");
   }
}
