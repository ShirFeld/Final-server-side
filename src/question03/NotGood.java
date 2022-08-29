package question03;

public class NotGood {
    public static void factorial(int number) {
        // change only the factorial method in order to run it asynchronously
        System.out.println("Running Factorial method in " + MyLogger.threadInfo());
        try {
        Thread.sleep(1000);

        if (number <20){
            long result = 1;
            for (int i = 2; i <= number; i++)
                result *= i;
            System.out.println("factorial of " + number + "= " + result); }
        else System.out.println("computing the factorial of " + number + " is not possible using a " + "long type.");
    }
        catch (InterruptedException ie){
        ie.printStackTrace();
    }
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
