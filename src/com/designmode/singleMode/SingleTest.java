package com.designmode.singleMode;

import java.util.concurrent.CountDownLatch;

public class SingleTest {
    public static void main(String[] args) {
        int count = 2000;
        //发令枪，我就能想到运动员
        CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i=1;i<=count;i++ ) {
            new Thread(){
                @Override
                public void run() {
                    Object instance = RegisterSingMode.getInstance("3333");
                    System.out.println(System.currentTimeMillis()+"addrs:"+instance);
                }
            }.start();
            latch.countDown();

        }
        try {
            // 阻塞
            // count = 0 就会释放所有的共享锁
            // 万箭齐发
            latch.await();
        }catch(Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
