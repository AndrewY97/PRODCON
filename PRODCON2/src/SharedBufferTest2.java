import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class SharedBufferTest2{
	public static void main(String[] args) throws InterruptedException{
		ExecutorService executorService = Executors.newCachedThreadPool();
		System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation",
				"Buffer", "Occupied", "---------", "------\t\t--------");
		// execute the Producer and Consumer tasks
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
	}
}