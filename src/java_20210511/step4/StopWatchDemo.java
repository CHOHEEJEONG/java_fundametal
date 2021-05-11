package java_20210511.step4;

public class StopWatchDemo {
	public static void run(StopNanoWatch s) {
		s.start();
		for(long i =0; i<30_000_000_000l; i++) {
		
		}
		s.stop();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %,.9f", elapsedTime);
	}
	
	public static void run(StopMilliWatch s) {
		s.start();
		for(long i =0; i<30_000_000_000l; i++) {
		
		}
		s.stop();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %,.3f", elapsedTime);
	}
	
	public static void main(String[] args) {
		StopMilliWatch s = new StopMilliWatch();
		run(s);
		
	}
}
