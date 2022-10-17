package strategy.complex;

/**
 * @author jtl
 * @date 2021/8/9 16:20
 */

class Cat {
    String name ;
    int weight;
    float age;

    public Cat(String name, int weight, float age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
