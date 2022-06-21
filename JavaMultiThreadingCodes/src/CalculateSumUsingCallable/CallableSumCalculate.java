package CalculateSumUsingCallable;

import java.util.concurrent.Callable;

public class CallableSumCalculate implements Callable<Integer> {

    private Integer number;

    public CallableSumCalculate(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(this.number +" x 2 = "+ (this.number = this.number * 2));
//        return Math.pow(this.number,2);
         return this.number;
    }
}
