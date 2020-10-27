package JavaCore.test.Rocket;

public class ListenerDemo  {
    public static void main(String[] args) {

    Canvas canvas = new Canvas();
    Pentagon pentagon = new Pentagon();

    Button redBottom = new Button();
    redBottom.addListener(canvas);
    redBottom.addListener(pentagon);
    redBottom.addListener(new USSR());

    redBottom.click();

    }

    static class Canvas implements ClickListener {

        @Override
        public void onClick() {
            System.out.println("CANVAS : Bottom was pressed");
        }
    }

    static class Pentagon implements ClickListener {
    public void alarm() {
        System.out.println("ALARM!!!!!!");
    }
        @Override
        public void onClick() {
            alarm();
        }
    }

    static class USSR implements ClickListener {
        public void launchRocket() {
            System.out.println("Ракеты Запущены командир!");
        }

        public void onClick() {
            launchRocket();
        }
    }
}
