import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *=== Summary of Processing time ===
 * Sync Logging time 2184 ms
 * Async Logging time 590 ms
 */

public class AsyncPerformanceDemo {

    private static final Logger asyncLogger = LogManager.getLogger(AsyncPerformanceDemo.class);
    private static final Logger syncLogger = LogManager.getLogger("syncLogger");

    public static void main(String args[]){
        long syncLoggingStartTime= System.currentTimeMillis();
        syncConsoleLogging();
        long syncLoggingEndTime = System.currentTimeMillis();

        long asyncLoggingStartTime= System.currentTimeMillis();
        asyncLo4j2Log();
        long asyncLoggingEndTime = System.currentTimeMillis();

        System.out.println("\n\n=== Summary of Processing time ===");
        System.out.println(String.format("Sync Logging time %d ms", (syncLoggingEndTime - syncLoggingStartTime)));
        System.out.println(String.format("Async Logging time %d ms", (asyncLoggingEndTime - asyncLoggingStartTime)));

    }

    private static void syncConsoleLogging(){
        syncLogger.info("Console - Sync Console Log4j2 Starting: ");
        for(int i=0;i<=1000000;i++){
            syncLogger.info("i is: [" + i * 1 + "]");
        }
        syncLogger.info("Sync Logger Finished");
    }

    private static void asyncLo4j2Log(){
        asyncLogger.info("ASYNC - RandonAccessFile Log4j2 Disruptor log: ");
        for(int i=0;i<=1000000;i++){
            asyncLogger.info("i is: [" + i * 1 + "]");
        }
        asyncLogger.info("Async Logger Finished");
    }

}