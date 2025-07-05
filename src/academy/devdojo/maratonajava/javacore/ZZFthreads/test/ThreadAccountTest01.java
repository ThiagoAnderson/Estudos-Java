package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawl(10);
            if(account.getBalance() < 0){
                System.out.println("SEM DINHEIRO");
            }
        }
    }
    // syncronized da um lock em uma Thread, so podera ser executada por outra apos a primeira Thread terminar
    private synchronized void withdrawl(int amount ){
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
            account.withdrawl(amount);
            System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta "+account.getBalance());

        }else{
            System.out.println("Sem dinheiro para "+Thread.currentThread().getName()+ " efetuar o saque "+account.getBalance());
        }
    }

}
