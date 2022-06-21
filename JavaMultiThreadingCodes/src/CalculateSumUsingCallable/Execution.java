package CalculateSumUsingCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Execution {

//    public static volatile Integer number = 1;
    public static void main(String args[]){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Integer number = 1;

        try{
            for(int i=1;i<=5;i++) {
                CallableSumCalculate callableSumCalculate = new CallableSumCalculate(number);
                number = executorService.submit(callableSumCalculate).get();
            }
//            System.out.println(number);

        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
