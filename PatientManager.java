package Homework3;

public class PatientManager {
    public Patient[] patientList;

    public PatientManager(){
        this.patientList = new Patient[10];
    }

    public int addPatient(Patient p){
        for (int i = 0; i < 10; i++){
            if (patientList[i] == null){
                patientList[i] = p;
                return i;
            }
        }
        return -1;
    }

    public Patient removePatient(int i){
        Patient p = this.patientList[i];
        this.patientList[i] = null;
        return p;
    }

    public void caffeineAbsorption(){
        for (int i = 0; i < 10; i++){
            if (patientList[i] != null){
                patientList[i].caffineLevel -= 130;
                if (patientList[i].caffineLevel <= 0){
                    patientList[i] = null;
                }
            }
        }
    }

    public String toString(){
        int checkEmpty = 0;

        for (int i = 0; i < 10; i++){
            if (patientList[i] == null){
                checkEmpty ++;
            }
            else{
                System.out.println(patientList[i].IDnumber + " " 
                                    + patientList[i].caffineLevel);
            }
        }

        if (checkEmpty == 10){
            System.out.println("Empty");
        }
        
        return "";
    }
}
