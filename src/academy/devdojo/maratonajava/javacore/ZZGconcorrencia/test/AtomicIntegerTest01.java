package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Couter {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock(true);
    public int getCount() {
        return count;
    }

    void increment(){
        lock.lock();
        try{
            count++;
            atomicInteger.incrementAndGet();
        }finally {
            lock.unlock();
        }

    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}
public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Couter couter = new Couter();
        Runnable r = () ->{
            for(int i = 0; i < 10000; i++){
                couter.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(couter.getCount());
        System.out.println(couter.getAtomicInteger());
    }
}
