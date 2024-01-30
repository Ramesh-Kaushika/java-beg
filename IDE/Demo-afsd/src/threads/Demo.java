package threads;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
//create obj DemoThread Class
        DemoThread demoThread = new DemoThread();
//Create obj Runnable Thread class
        RunnableThread runnableThread = new RunnableThread();
//Runnable interface haven't started method Because of that
        Thread thread = new Thread(runnableThread);
//thread reference variable calling start method
        thread.start();
//demothread reference variable calling start method
        demoThread.start();


        for (int i = 0; i <10 ; i++) {
            System.out.println("Main Running");
        }


    }

}
