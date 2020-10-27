package JavaCore.Pitzaaa;

public class GoodClass {
    private final int reqFieldOne;
    private final int reqFieldTwo;
    private final int optFieldOne;
    private final int optFieldTwo;
    private final int optFieldThird;
    private final int optFieldFour;

    public static class Builder {
        // Обязательные параметры
        private final int reqFieldOne;
        private final int reqFieldTwo;

        // Необязательные параметры с значениями по умолчанию
        private int optFieldOne = 0;
        private int optFieldTwo = 0;
        private int optFieldThird = 0;
        private int optFieldFour = 0;

        // заполняем обязательные поля
        public Builder(int reqFieldOne, int reqFieldTwo) {
            this.reqFieldOne = reqFieldOne;
            this.reqFieldTwo = reqFieldTwo;
        }

        public Builder optFieldOne(int val) {
            optFieldOne = val;
            return this;
        }

        public Builder optFieldTwo(int val) {
            optFieldTwo = val;
            return this;
        }

        public Builder optFieldThird(int val) {
            optFieldThird = val;
            return this;
        }

        public Builder optFieldFour(int val) {
            optFieldFour = val;
            return this;
        }
        // создаем экземпляр внешнего класса и передаем ссылку на обьект твнутреннего класса
        public GoodClass buidl() {
            return new GoodClass(this);
        }
    }
        // Конструктор внешнего класса и перекопируем все поля из внутренниго класса
    //т.к goodclass приватный его нельзя вызвать снаружи
    private GoodClass(Builder builder) {
        reqFieldOne = builder.reqFieldOne;
        reqFieldTwo = builder.reqFieldTwo;
        optFieldOne = builder.optFieldOne;
        optFieldTwo = builder.optFieldTwo;
        optFieldThird = builder.optFieldThird;
        optFieldFour = builder.optFieldFour;
    }

    @Override
    public String toString() {
        return "GoodClass{" +
                "reqFieldOne=" + reqFieldOne +
                ", reqFieldTwo=" + reqFieldTwo +
                ", optFieldOne=" + optFieldOne +
                ", optFieldTwo=" + optFieldTwo +
                ", optFieldThird=" + optFieldThird +
                ", optFieldFour=" + optFieldFour +
                '}';
    }
}

// GoodClass{reqFieldOne=1, reqFieldTwo=2, optFieldOne=0, optFieldTwo=0, optFieldThird=9, optFieldFour=5}
class BilderMain {
    public static void main(String[] args) {
        GoodClass goodClass = new GoodClass
                .Builder(1, 2) // Обязательные настройки
                .optFieldThird(9)
                .optFieldFour(5)
                .buidl(); // Окончательная сборка
        System.out.println(goodClass);

    }
}
