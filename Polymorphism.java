public class Polymorphism {
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        Bank bank2 = new ICICI();
        Bank bank3 = new AXIS();

        System.out.println("SBI Rate of Interest: " + bank1.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + bank2.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + bank3.getRateOfInterest());
    }
}
class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}



