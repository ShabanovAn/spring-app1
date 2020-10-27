package JavaCore.tread.counting;

public class LockCounter implements Counter{

    private final Object objLock = new Object();

    private Long counter;
    @Override
    public synchronized long inc(){
        return counter++;
    }

    public long inc_() {
        synchronized (objLock) {
            return counter++;
        }
    }

    public long incUnsafe() {
        return counter++;
    }
}
