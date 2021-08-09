package strategy;

/**
 * @author jtl
 * @date 2021/8/9 16:10
 */

class IntComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer t1, Integer t2) {
        if (t1>t2){
            return 1;
        }
        if (t1<t2){
            return -1;
        }
        if (t1.intValue()==t2.intValue()){
            return 0;
        }

        return -1;
    }
}
