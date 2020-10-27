package JavaCore.Other;

public class Mother {
    private String name;
    private int age;
    private Children children;
    MotherCapital motherCapital;

    public Mother() {

    }

    public Mother(String name, int age) {
        this.name = name;
        this.age = age;
        this.children = new Children();

    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void info() {
        // Внутренни локальный класс, это класс обьявлен внутри метода
        class Registretion {
            String info() {
                return " innerLocal";
            }
        }

        Registretion registretion = new Registretion();

        System.out.println(name + " " + age + " " + children.name + " " + children.age + " " + children.motherName + registretion.info());
    }

    class Children {
        private String name;
        private int age;
        private String motherName;

        public Children() {
            this.motherName = Mother.this.name;
        }

        public Children(String name, int age) {
            this.name = name;
            this.age = age;
            this.motherName = Mother.this.name;
        }

        public Children(String name, int age, String motherName) {
            this.name = name;
            this.age = age;
            this.motherName = motherName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getMotherName() {
            return motherName;
        }

        public void setMotherName(String motherName) {
            this.motherName = motherName;
        }

        void info() {
            System.out.println(name + " " + age + " " + Mother.this.name);
        }
    }
    public static class MotherCapital {
        private int sum;

        public MotherCapital(int sum) {
            this.sum = sum;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }
}
