package JavaCore.LambdaTest;

//Терминальные лямбда-выражения
//Выше мы рассмотрели лямбда-выражения, которые возвращают определенное значение.
// Но также могут быть и терминальные лямбды, которые не возвращают никакого значения. Например:

interface Printable {
    void print(String s);
}

public class TerminalLambda {
    public static void main(String[] args) {
        Printable printable = s -> System.out.println(s);
        printable.print("Hello World");

    }
}
