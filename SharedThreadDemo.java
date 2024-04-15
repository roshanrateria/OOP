public class SharedThreadDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Th1 th1 = new Th1(resource);
        Th2 th2 = new Th2(resource);
        Th3 th3 = new Th3(resource);

        th1.start();
        th2.start();
        th3.start();
    }
}
public class SharedResource {
    synchronized void method1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1 executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void method2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2 executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void method3() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 3 executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Th1 extends Thread {
    SharedResource resource;

    Th1(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.method1();
    }
}

class Th2 extends Thread {
    SharedResource resource;

    Th2(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.method2();
    }
}

class Th3 extends Thread {
    SharedResource resource;

    Th3(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.method3();
    }
}

