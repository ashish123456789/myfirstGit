public class hello {

    public static void main(String[] args) {
        System.out.println("Hello from main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println("hello from anonymous thread");
            }
        }.start();
        System.out.println("hello again main thread");
    }
}

