package JavaCore.LambdaTest;
//Обобщенный функциональный интерфейс
//Функциональный интерфейс может быть обобщенным, однако в лямбда-выражении использование обобщений не допускается.
// В этом случае нам надо типизировать объект интерфейса определенным типом, который потом будет применяться в лямбда-выражении.
// Например:
public class LambdaApp4 {
    public static void main(String[] args) {
        OperationLambda<Integer> operationLambda = (x, y) -> x+y;
        OperationLambda<String> operationLambda1 = (x, y) -> x+y;
        System.out.println(operationLambda.calcul(10,10));
        System.out.println(operationLambda1.calcul("20","20"));

    }
}

interface OperationLambda<T> {
    T calcul(T x, T y);

}
