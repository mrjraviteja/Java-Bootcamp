package ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecServ3 {
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future future = executorService.submit(newRunnable("Task 1.1"));
        System.out.println(future.isDone());

        try{
            future.get();
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted Exception: "+e);
        }
        catch(ExecutionException e)
        {
            System.out.println("Executon Exception: "+e);
        }

        System.out.println(future.isDone());
        executorService.shutdown();
    }

    private static Runnable newRunnable(String msg)
    {
        return new Runnable() {
            public void run()
            {
                System.out.println(Thread.currentThread().getName());
            }
        };
    }
}
