package C2TC_CORE_JAVA_PROGRAM.src.Day13;

public class UsingRunnable {

    public UsingRunnable(int i, int i1, String hello) {
    }


    public class ChildThread extends Thread {
        private int n;
        private String msg;

        // Constructor
        public ChildThread(int n, String msg) {
            this.n = n;
            this.msg = msg;
        }

        @Override
        public void run() {
            for (int i = 1; i <= n; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.err.println("Thread interrupted: " + e.getMessage());
                }
                System.out.println(msg + i + " " + Thread.currentThread().getName());
            }
        }
    }
}
