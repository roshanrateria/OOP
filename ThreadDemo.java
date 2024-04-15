public class ThreadDemo {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        ThreadC threadC = new ThreadC();

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A executing step " + i);
            try {
                Thread.sleep(1000); // Simulating some work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread A completed");
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread B executing step " + i);
            try {
                Thread.sleep(1000); // Simulating some work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread B completed");
    }
}

class ThreadC extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread C executing step " + i);
            try {
                Thread.sleep(1000); // Simulating some work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread C completed");
    }
}


