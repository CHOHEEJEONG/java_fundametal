package java_20210511.step1;
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	public double getElapsedTime() {
		return (double)(endTime -startTime)/1000000000;
	}
	public static void main(String[] args) {
		FootNanoStopWatch f = new FootNanoStopWatch();
		//1970년 1월 1일부터 현재까지의 시간을 밀리세컨드로 반환한다.
		long startTime = System.nanoTime();
	
		for(long i =0; i<300_000_000_000l; i++) {
		}
		
		long endTime = System.nanoTime();
		double elapsedTime = f.getElapsedTime();
		System.out.printf("경과시간 : %,.9f", elapsedTime);
	}


}
