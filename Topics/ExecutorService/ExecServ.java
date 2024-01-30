package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecServ {
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(newRunnable("Task 1.1"));
        executorService.execute(newRunnable("Task 1.2"));
        executorService.execute(newRunnable("Task 1.3"));

        executorService.shutdown();
    }

    private static Runnable newRunnable(String msg)
    {
        return new Runnable() {
            public void run()
            {
                System.out.println(Thread.currentThread().getName()+": "+msg);
            }
        };
    }
}
