package question02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SharedResources {
    private static int result = 0;  // shared resource between threads

    public static void function(int numOfIterations){
        for (int i = 0; i <numOfIterations ; i++)
            result++;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<Thread> threads = new ArrayList<>();
        int numOfIterations = scanner.nextInt();

        for (int i = 0; i < numOfIterations; i++) {
            Thread aThread = new Thread(()->function(numOfIterations));
            threads.add(aThread); aThread.start();
        }

        for (int i = 0; i < numOfIterations; i++)
            threads.get(i).join();
        System.out.println(result);
    }
}



