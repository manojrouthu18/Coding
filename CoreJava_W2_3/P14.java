public class P14 {
    public static void main(String[] args) {
        Counter c=new Counter(5);
        c.increment();
        c.increment();
        c.decrement();
        System.out.println(c.getCount());
    }
}


class Counter{

   private int count;
    Counter(){
        this.count=0;

    }
     Counter(int count){
        this.count=count;
    }
     

    public void increment(){
        count++;
    }

   public void decrement(){
        count--;
    }

    public int getCount(){
        return count;
    }


}
