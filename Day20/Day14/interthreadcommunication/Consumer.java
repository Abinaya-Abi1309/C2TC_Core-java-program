package C2TC_CORE_JAVA_PROGRAM.src.Day14.interthreadcommunication;

public class Consumer extends Thread {
    Q obj;

    public Consumer(Q obj) {
        this.obj = obj;
        start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
            obj.get();
        }
    }
}
