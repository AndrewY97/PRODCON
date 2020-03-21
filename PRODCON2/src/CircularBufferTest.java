import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
	
public class CircularBufferTest{
	public static void main(String[] args) throws InterruptedException{
	// create new thread pool with two threads
	ExecutorService executorService = Executors.newCachedThreadPool();
// display the initial state of the CircularBuffer
	sharedLocation.displayState("Initial State");
	executorService.shutdown();
	executorService.awaitTermination(1, TimeUnit.MINUTES);
	}
} // end class CircularBufferTest