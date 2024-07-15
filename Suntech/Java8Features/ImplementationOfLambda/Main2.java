package Suntech.Java8Features.ImplementationOfLambda;

public class Main2 {//using runnable interface to implement thread
    public static void main(String[] args) {
        // LambdaThread lt = new LambdaThread();
        // Thread childThread = new Thread(lt);
        // childThread.run();
        // for(int i = 1 ; i<= 10 ;i++){
        //     System.out.println("bye"+i);
        // }
        Runnable runnable = ()->{
            for(int i = 1 ;i<= 10 ;i++){
                System.out.println("Hello "+i);
            }
        };
        Thread t = new Thread(runnable);
        t.run();

    }
}
