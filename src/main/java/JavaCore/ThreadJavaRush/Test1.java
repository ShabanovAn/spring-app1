package JavaCore.ThreadJavaRush;

public class Test1 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        ThreadGroup threadGroup = thread.getThreadGroup();
        System.out.println("Thread : " + thread.getName());
        System.out.println("Thread Group : " + threadGroup.getName());
        System.out.println("Paren Group : " + threadGroup.getParent().getName());
    }
}
