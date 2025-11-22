/* 
abstract class Doctor{
    abstract void TreatPatient();
    void HospitalInfo(){
        System.out.println("MAX Hospital");
    }
    String Name;
    Doctor(String Name){
        this.Name=Name;
    }
}
class Dentist extends Doctor{
    Dentist(String Name){
        super(Name);
    }
    void TreatPatient(){
        System.out.println(Name + "is treating dental cases");
    }
}
class cardiologist extends Doctor{
    cardiologist(String Name){
        super(Name);
    }
    void TreatPatient(){
        System.out.println(Name + "is treating heart cases");
    }
}
public class main {

    public static void main(String[] args) {
        Doctor d = new Dentist("Dr. James");
        Doctor c = new cardiologist("Dr. Rahul");
        d.HospitalInfo();
        d.TreatPatient();
        c.HospitalInfo();
        c.TreatPatient();

    }
}
*/    
// create an abstract class dilivery abstract and non abstract method
//create sub classes dilivery 1      2 express dilivery while impliment diliveerry roads the cusomer will be charge 5 % extra 
//10% extra for the express dilivery mode calculate and display the finalm dilivery charge
