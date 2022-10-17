package strategy.complex;

/**
 * @author jtl
 * @date 2021/8/9 16:13
 */

class DogComparator implements Comparator<Dog>{
    @Override
    public int compare(Dog t1, Dog t2) {
        int result ;
        if (t1.food> t2.food){
            result = 1;
        }else if (t1.food<t2.food){
            result = -1;
        }else {
            result = 0;
        }
        return result;
    }
}
