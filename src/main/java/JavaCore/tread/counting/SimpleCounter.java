package JavaCore.tread.counting;

public class SimpleCounter implements Counter{
    private Long val;

    @Override
    public long inc() {
        return val++;
    }
}
