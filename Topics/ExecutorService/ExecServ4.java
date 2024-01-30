package ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecServ4 {
    
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future future = executorService.submit(newCallable("Task 1.1"));

        System.out.println(future.isDone());

        try{
            String result = (String) future.get();
            System.out.println(result);
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

    private static Callable newCallable(String msg)
    {
        return new Callable() {
            @Override
            public Object call() throws Exception{
                String completeMsg = Thread.currentThread().getName()+": "+msg;
                return completeMsg;
            }
        };
    }
    
}
