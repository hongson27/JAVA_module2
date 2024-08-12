package ss4_class_and_OOP.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;
    public long getStart() {
        return startTime;
    }
    public long getEnd() {
        return endTime;
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
    public static void Sort(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
