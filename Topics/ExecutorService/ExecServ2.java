package ExecutorService;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecServ2 {
    public static void main(String[] args)
    {
        int corePoolSize = 3;
        int maxPoolSize = 5;
        long keepAliveTime = 1000;

        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(128));
        
        threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        ExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(corePoolSize);

        scheduledExecutorService = Executors.newScheduledThreadPool(3);
    }

    private static Runnable newRunnable(String msg)
    {
        return new Runnable() {
            public void run()
            {
                String completeMsg = Thread.currentThread().getName()+" Completed!";
            }
        };
    }
}
