package strategy.complex;

/**
 * @author jtl
 * @date 2021/8/9 16:12
 */

class Dog {
   float food;

   public Dog(float food) {
      this.food = food;
   }

   @Override
   public String toString() {
      return "Dog{" +
              "food=" + food +
              '}';
   }
}
