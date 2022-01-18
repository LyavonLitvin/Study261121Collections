import java.util.Iterator;

public class IntervalIterator implements Iterator {
    private final int max;
    private int current;

    public IntervalIterator(int left, int right) {
        this.current = left;
        this.max = right;

    }

    @Override
    public boolean hasNext() {
        return current < max;
    }

    @Override
    public Integer next() {
        return current++;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
