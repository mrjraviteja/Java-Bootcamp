package ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecServ8 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future future = executorService.submit(newCallable("Task 1.1"));

        System.out.println(future.isDone());
        
        boolean mayInterrupt = true;
        future.cancel(mayInterrupt);

        try{
            String result = (String) future.get();
            System.out.println(result);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        catch(ExecutionException e)
        {
            e.printStackTrace();
        }
        catch(CancellationException e)
        {
            String msg = "Cannot call future.get() since task was cancelled";
            System.out.println(msg);
        }

        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
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
