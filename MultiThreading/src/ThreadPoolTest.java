import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class WorkerThread extends Thread{
	int workerID;
	public WorkerThread(int id){
		this.workerID = id;
	}
	@Override
	public void run(){
		for(int i = 0 ; i <= 100 ; i+=30){
			System.out.println("Worker : "+ workerID + "completed : " + i);
			if(i%20 == 0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class CallableWorkerThread implements Callable<Integer>{
	int workerID;
	public CallableWorkerThread(int id){
		this.workerID = id;
	}

	
	@Override
	public Integer call() throws Exception {
		for(int i = 0 ; i <= 100 ; i+=25){
			System.out.println("call Worker : "+ workerID + "completed : " + i);
			if(i%20 == 0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		return workerID;
	}
	
}
public class ThreadPoolTest{	
	public static void main(String[] args) throws FileNotFoundException{
		int threadpoolsize = 3;
		int noOfWorkers = 4;
		ExecutorService tpes = Executors.newFixedThreadPool(threadpoolsize);
		WorkerThread[] workerset = new WorkerThread[noOfWorkers];
		for(int i = 0 ; i < noOfWorkers ; i++){
			workerset[i] = new WorkerThread(i);
			tpes.execute(workerset[i]);
		}
		tpes.shutdown();
		
		System.out.println("===========================================");
		
		ExecutorService es = Executors.newCachedThreadPool();
		Future[] futures = new Future[noOfWorkers];
		CallableWorkerThread[] callworkers = new CallableWorkerThread[noOfWorkers];
		for(int i = 0 ; i < noOfWorkers ; i++){
			callworkers[i] = new CallableWorkerThread(i);
			futures[i] = es.submit(callworkers[i]);
		}
		es.shutdown();
		for (int i = 0; i < noOfWorkers; i++) {
            try {
                System.out.println("Ending worker: " + futures[i].get());
            } catch (Exception e) {}
        }
	}
	
}