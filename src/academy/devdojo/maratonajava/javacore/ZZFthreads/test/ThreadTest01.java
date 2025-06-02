package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

// Tipos: Daemon(Não tem tanta prioridade em relação a user) x User(Encerra o programa quando todas elas são terminadas)

class ThreadExemple extends Thread{
    private char c;
    public ThreadExemple(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.printf(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}
class ThreadExampleRunnable implements Runnable{
    private char c;
    public ThreadExampleRunnable(char c){
        this.c = c;
    }
    @Override
    public void run() {
        System.out.printf(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}
public class ThreadTest01 {
    public static void main(String[] args) {
        //Oque é? Pode ser um objeto do tipo Thread ou um processo
//        ThreadExemple t1 = new ThreadExemple('A');
//        ThreadExemple t2 = new ThreadExemple('B');
//        ThreadExemple t3 = new ThreadExemple('C');
//        ThreadExemple t4 = new ThreadExemple('D');
        Thread t1 = new Thread(new ThreadExampleRunnable('A'));
        Thread t2 = new Thread(new ThreadExampleRunnable('B'));
        Thread t3 = new Thread(new ThreadExampleRunnable('C'));
        Thread t4 = new Thread(new ThreadExampleRunnable('D'));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        // Não é possivel dar dois statrs, vai lançar uma IllegalExecption

    }
}
