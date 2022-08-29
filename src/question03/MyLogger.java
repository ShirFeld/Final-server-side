package question03;

public class MyLogger {
    public static String threadInfo() {
        return "JVM PID" + ProcessHandle.current().pid()+
                " , Number of processors:" + Runtime.getRuntime().availableProcessors() +
                " , Total memory" + Runtime.getRuntime().totalMemory();

    }


    public static void main(String[] args) {
        System.out.println(threadInfo());
    }
}
