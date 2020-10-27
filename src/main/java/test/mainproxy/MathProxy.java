package test.mainproxy;

public class MathProxy implements IMath{

    //JDK Динамический прокси может hеализовать  прокси-сервер только через интерфейс
    // (поэтому ваш целевой класс должен реализовать интерфейс, который затем также реализуется прокси-классом).
  private Math math;

    @Override
    public double add(double x, double y) {
        LazyInitMath();
        return math.add(x,y);
    }

    @Override
    public double sub(double x, double y) {
        LazyInitMath();
        return math.sub(x, y);
    }

    @Override
    public double mul(double x, double y) {
        LazyInitMath();
        return math.mul(x,y);
    }

    @Override
    public double div(double x, double y) {
        LazyInitMath();
        return math.div(x, y);
    }

    private void LazyInitMath(){
        if(math == null) {
            math = new Math();
        }
    }
}
