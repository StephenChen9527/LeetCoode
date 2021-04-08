package com;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Test2 {

    public static void main(String[] args) throws Exception{

        CyclicBarrier pro = new CyclicBarrier(2);
        CyclicBarrier con = new CyclicBarrier(2);
        final Map<Integer,Integer> map = new HashMap<>();
        Thread product = new Thread(()->{
            try {
                for (int i =1; i <= 100; i++) {
                    map.put(i,i);
                    pro.await();
                    con.await();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(()->{
            try {
                int sum = 0;
                for (int i =1; i <= 100; i++) {
                    pro.await();
                    sum+= map.get(i);
                    System.out.println(sum+"--->"+i);
                    con.await();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        product.start();

        consumer.start();
        product.join();
        consumer.join();

    }


}

