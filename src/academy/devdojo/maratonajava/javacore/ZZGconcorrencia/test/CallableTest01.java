package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;


class RandomNumberCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        int coutn = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < coutn; i++) {
            System.out.printf("%s executando uma tarefa callable...%n",Thread.currentThread().getName());
        }
        return String.format("%s finished and the random number is %d",Thread.currentThread().getName(),coutn);
    }
}
public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumberCallable);
        String s = future.get();
        System.out.printf("Programa finished %s",s);
        executorService.shutdown();
    }
}
