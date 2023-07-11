package strategy.complex;

/**
 * @author jtl
 * @date 2021/8/9 15:59
 * 策略模式测试类
 */

class StrategyTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog(20), new Dog(1), new Dog(5), new Dog(2), new Dog(2)};
        Sort<Dog> dogSort = new Sort<>();
        dogSort.sort(dogs, new DogComparator());


        Cat[] cats = new Cat[]{new Cat("可乐", 7, 0.8F), new Cat("冰块", 10, 0.7F)
                , new Cat("灯泡", 5, 0.5F), new Cat("布丁", 4, 0.4F)};

        Sort<Cat> catSort = new Sort<>();
        catSort.sort(cats, new CatWeightComparator());
        catSort.sort(cats, new CatAgeComparator());
    }
}
