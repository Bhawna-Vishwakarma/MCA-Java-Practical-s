public class Consumer extends Thread{
    Factory bajaj;

    public Consumer(Factory bajaj) {
        this.bajaj = bajaj;
    }

    @Override
    public void run() {
        int i=1;
        while(i++<=10)
            this.bajaj.consumed();
    }
}