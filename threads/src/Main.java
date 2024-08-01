class DisplayMessage extends Thread{
    private String message;
    private int interval;
    public DisplayMessage(String message , int interval){
        this.message = message;
        this.interval = interval;
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


public class Main {
    public static void main(String[] args) {
        DisplayMessage first = new DisplayMessage("Good Morning",1000);
        DisplayMessage second = new DisplayMessage("Welcome",2000);
        DisplayMessage third = new DisplayMessage("Hello",3000);
        first.start();
        second.start();
        third.start();

    }
}