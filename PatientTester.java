package Homework3;

public class PatientTester {
    public static void main(String[] args) {
        
        PatientManager manager = new PatientManager();
        manager.toString();

        manager.addPatient(new Patient(1,200));
        manager.addPatient(new Patient(2,400));
        manager.addPatient(new Patient(3,600));
        manager.addPatient(new Patient(4,800));

        manager.toString();

        manager.caffeineAbsorption();
        manager.caffeineAbsorption();

        manager.toString();

        Patient highest = new Patient(0,0);
        int hIndex = 0;
        for (int i = 0; i < 10; i++){
            if (manager.patientList[i] != null){
                if (manager.patientList[i].caffineLevel >= highest.caffineLevel){
                    highest = manager.patientList[i];
                    hIndex = i;
                }
            }
        }

        manager.removePatient(hIndex);

        manager.toString();
    }
}
