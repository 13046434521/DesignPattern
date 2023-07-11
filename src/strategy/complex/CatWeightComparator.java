package strategy.complex;

/**
 * @author jtl
 * @date 2021/8/9 16:21
 */

class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat t1, Cat t2) {
        if (t1.weight < t2.weight) {
            return 1;
        } else if (t1.weight > t2.weight) {
            return -1;
        }
        return 0;
    }
}
