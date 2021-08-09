package strategy;

/**
 * @author jtl
 * @date 2021/8/9 16:20
 */

class CatAgeComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat t1, Cat t2) {
        if (t1.age> t2.age){
            return 1;
        }else if (t1.age< t2.age){
            return -1;
        }
        return 0;
    }
}
