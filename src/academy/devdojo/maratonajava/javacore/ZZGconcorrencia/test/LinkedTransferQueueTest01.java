package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        //   ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("thiago"));
        System.out.println(tq.offer("thiago"));
        System.out.println(tq.offer("thiago", 10, TimeUnit.SECONDS));
        tq.put("Anderson");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Anderson");
        }
        System.out.println(tq.tryTransfer("Silva"));
        System.out.println(tq.tryTransfer("Silva",5,TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
