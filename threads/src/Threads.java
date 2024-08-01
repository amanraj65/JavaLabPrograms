class Display_message implements Runnable{
    String name;
    Thread t;
    String message;
    int interval;
    public Display_message(String message, int interval){
        this.message = message;
        this.interval = interval;
    }

    void NewThread(String threadname){
        name = threadname;
        t = new Thread(this,name);
        System.out.println("New thread: " + t);
        t.start();
    }

    public void run(){
        try{
            while (true)
            {
                System.out.println(message);
                Thread.sleep(interval);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Threads{
    public static void main(String[] args) {
        Thread first = new Thread(new Display_message("Good Morning",1000));
        Thread second = new Thread(new Display_message("Hello",2000));
        Thread third = new Thread(new Display_message("Welcome",3000));

        first.start();
        second.start();
        third.start();
    }
}