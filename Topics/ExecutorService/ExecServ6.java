package ExecutorService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecServ6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<String>> callables = new ArrayList<>();
        callables.add(newCallable("Task 1.1"));
        callables.add(newCallable("Task 1.2"));
        callables.add(newCallable("Task 1.3"));

        try{
            List<Future<String>> results = executorService.invokeAll((Collection) callables);
            for(Future future: results)
            {
                System.out.println(future.get());
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted Exception: "+e);
        }
        catch(ExecutionException e)
        {
            System.out.println("Executon Exception: "+e);
        }

        executorService.shutdown();
    }

    private static Callable<String> newCallable(String msg)
    {
        return new Callable() {
            @Override
            public Object call() throws Exception {
                String completeMsg = Thread.currentThread().getName()+": "+msg;
                return completeMsg;
            }
        };
    }
}
