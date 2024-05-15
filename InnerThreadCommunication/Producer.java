public class Producer extends Thread{
    Factory bajaj;

    public Producer(Factory bajaj) {
        this.bajaj = bajaj;
    }

    @Override
    public void run() {
        int i=1;
        while(i<=10)
        this.bajaj.produce(i++);
    }
}