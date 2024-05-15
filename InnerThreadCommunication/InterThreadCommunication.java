public class InterThreadCommunication {
    public static void main(String[] args) {
        Factory bjaja=new Factory();
        new Producer(bjaja).start();
        new Consumer(bjaja).start();
    }
}