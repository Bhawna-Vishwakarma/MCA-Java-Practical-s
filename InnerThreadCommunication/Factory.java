public class Factory {
    int item;
    boolean isItem;
    public synchronized void produce(int item){
        if(isItem){
            try{
                wait();
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
        this.item=item;
        this.isItem=true;
        System.out.println(item+" Produced in Factory");
       notify();
    }
    public synchronized void consumed(){
        if(!isItem){
            try{
                wait();
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
        this.isItem=false;
        System.out.println(item+" Consumed from Factory");
        notifyAll();
    }
}