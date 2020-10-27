package JavaCore.Proxy;

public class ProxyMain {
    public static void main(String[] args) {

    }
}
interface Imath {
    public double add(double x, double y);
    public double sub(double x, double y);
    public double mul(double x, double y);
    public double div(double x, double y);
}

class Math implements Imath {

    @Override
    public double add(double x, double y) {
        return x +y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }

    @Override
    public double mul(double x, double y) {
        return x*y;
    }

    @Override
    public double div(double x, double y) {
        return x/y;
    }
}
class Proxy implements Imath  {
    Math math;

    public void lazyInit() {
        if (math == null)
            math = new Math();
    }

    @Override
    public double add(double x, double y) {
        lazyInit();
        return math.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        lazyInit();
        return math.sub(x,y);
    }

    @Override
    public double mul(double x, double y) {
        lazyInit();
        return math.mul(x,y);
    }

    @Override
    public double div(double x, double y) {
        lazyInit();
        return math.div(x,y);
    }
}