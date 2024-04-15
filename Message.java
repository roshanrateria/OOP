public class Message {
    public static void main(String[] args) {
        Data data = new Data();
        
        Sender sender = new Sender(data);
        Receiver receiver = new Receiver(data);
        
        sender.start();
        receiver.start();
    }
}
class Sender extends Thread {
    private Data data;
    
    public Sender(Data data) {
        this.data = data;
    }

    public void run() {
        String message = "Hello, receiver!";
        data.setMessage(message);
    }
}

class Receiver extends Thread {
    private Data data;
    
    public Receiver(Data data) {
        this.data = data;
    }

    public void run() {
        String receivedMessage = data.getMessage();
        System.out.println("Received message: " + receivedMessage);
    }
}

class Data {
    private String message;
    
    public synchronized void setMessage(String message) {
        this.message = message;
        notify(); // Notify waiting threads that message is ready
    }

    public synchronized String getMessage() {
        while (message == null) {
            try {
                wait(); // Wait until message is available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String tempMessage = message;
        message = null; // Clear the message after retrieving
        return tempMessage;
    }
}

