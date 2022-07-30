import behavior.FlyBehavior;
import behavior.QuackBehavior;

/**
 * @author Liam.W
 */
public abstract class Duck {
   FlyBehavior flyBehavior;
   QuackBehavior quackBehavior;

   public void swim() {
      System.out.println("All ducks float , even decoys");
   }

   public abstract void display();

   public void perfomQuack() {
      quackBehavior.quack();
   }

   public void perfomfly() {
      flyBehavior.fly();
   }

   // call func exchange FlyBehavior
   public void setFlyBehavior(FlyBehavior fb) {
      flyBehavior = fb;
   }

   // call func exchange FlyBehavior
   public void setQuackBehavior(QuackBehavior qb) {
      quackBehavior = qb;
   }
}
