package question03;

public class Q3 {
    public static void factorial(int number) {
        Thread thread = new Thread(() -> {
            System.out.println("Running Factorial method in " + MyLogger.threadInfo());
            if (number <20){
                long result = 1;
                for (int i = 2; i <= number; i++)
                    result *= i;
                System.out.println("factorial of " + number + "= " + result); }
            else System.out.println("computing the factorial of " + number + " is not possible using a " + "long type.");
        });
        thread.start();
     }

    public static String threadInfo(){
        return "Thread ID: " + Thread.currentThread().getId() +
                ", Thread name: " +Thread.currentThread().getName() +
                ", Thread priority: " + Thread.currentThread().getPriority();
    }

    public static void main(String[] args) {
        System.out.println("hi");
        factorial(4);
        System.out.println("bye");
    }
}
