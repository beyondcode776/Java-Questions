// create an abstract class dilivery abstract and non abstract method
//create sub classes dilivery 1      2 express dilivery while impliment diliveerry roads the cusomer will be charge 5 % extra 
//10% extra for the express dilivery mode calculate and display the finalm dilivery charge

abstract class Delivery {
    double Charge;

    Delivery(double baseCharge) {
        this.Charge = baseCharge;
    }

    abstract void FinalCharge();

    void displayCharge() {
        System.out.println("Final Delivery Charge: " + Charge);
    }
}

class StandardCharge extends Delivery {
    StandardCharge(double baseCharge) {
        super(baseCharge);
    }

    @Override
    void FinalCharge() {
        Charge += Charge * 0.05;
    }
}
class ExpressDelivery extends Delivery {
    ExpressDelivery(double baseCharge) {
        super(baseCharge);
    }

    @Override
    void FinalCharge() {
        Charge += Charge * 0.10; 
    }
class DeliveryTest {
    public static void main(String[] args) {
        Delivery d1 = new StandardCharge(1000);
        Delivery d2 = new ExpressDelivery(1000);

        d1.FinalCharge();
        d1.displayCharge();

        d2.FinalCharge();
        d2.displayCharge();
    }
}
    }

