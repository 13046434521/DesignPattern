package strategy.complex;


/**
 * @author jtl
 * @date 2021/8/9 16:00
 */

class Sort<T> {
    public void sort(T[] t, Comparator<T> comparator) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                int result = comparator.compare(t[i], t[j]);
                if (result > 0) {
                    T temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }

        for (T t1 : t) {
            System.out.println(t1.toString());
        }
    }
}
