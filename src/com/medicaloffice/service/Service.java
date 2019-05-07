package com.medicaloffice.service;

import com.medicaloffice.models.*;
import com.medicaloffice.utils.DiagnosisType;
import sun.rmi.log.LogInputStream;

import java.io.File;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.*;

public class Service {

    private static List<Pill> pillList = new ArrayList<>();
    private static List<Pill> pillList2 = new ArrayList<>();
    private static List<Pill> pillList3= new ArrayList<>();

    private static List<Prescription> prescriptionList = new ArrayList<>();

    private static List<Diagnosis> diagnosisVector = new ArrayList<>();
    private static List<Diagnosis> diagnosis1 = new ArrayList<>();
    private static List<Diagnosis> diagnosis2 = new ArrayList<>();
    private static List<Diagnosis> diagnosis3 = new ArrayList<>();
    private static List<Diagnosis> diagnosis4 = new ArrayList<>();



    private static MedicalFile[] medicalFiles = new MedicalFile[5];

    //private static Patient[] patients = new Patient[5];
    private static List<Patient> patientList = new ArrayList<>();

    private static List<Doctor> doctors = new ArrayList<>();

    private static MedicalCentre medicalCentre = new MedicalCentre();

    private static Map<Long, Appointment> appointmentMap = new HashMap<>();
    private static List<Appointment> appointmentList = new ArrayList<>();


    // FROM FILE
    private static List<Doctor> doctorsFromCSV = new ArrayList<>();
    private static List<MedicalCentre> medicalCentresFromCSV = new ArrayList<>();
    private static List<Pill> pillsFromCSV = new ArrayList<>();

    //


    private static final Service instance = new Service();

    public static Service getInstance() {
        return instance;
    }

    private Service() {

        doctors.add(new Doctor(203L, "2313232", "Maria", "Dan", "Medic de Familie", 2));
        doctors.add( new Doctor(203L, "231we232", "Cornelia", "Dobre", "Medic Internist", 12));

        medicalCentre = new MedicalCentre(231L, "Romania", "Bucuresti", "Iuliu Maniu", "12");


        pillList.add(new Pill(120L, "Paracetamol", "administrare orala"));
        pillList.add(new Pill(220L, "Septosol", "administrare orala"));
        pillList.add(new Pill(450L, "Biorinil", "administrare nazala"));
        pillList.add(new Pill(1560L, "Trachisept", "administrare orala"));
        pillList.add(new Pill(12900L, "Nurofen Forte", "administrare orala"));

        pillList2.add(new Pill(450L, "Biorinil", "administrare nazala"));
        pillList2.add(new Pill(1560L, "Trachisept", "administrare orala"));

        pillList3.add(new Pill(12900L, "Nurofen Forte", "administrare orala"));


        prescriptionList.add(new Prescription(200L, pillList, LocalDate.parse("2019-09-12"), LocalDate.parse("2019-09-12")));
        prescriptionList.add(new Prescription(201L, pillList2, LocalDate.parse("2019-01-23"), LocalDate.parse("2019-07-30")));
        prescriptionList.add(new Prescription(202L, pillList3, LocalDate.parse("2019-02-20"), LocalDate.parse("2020-03-12")));

        diagnosisVector.add(new Diagnosis(2323L, prescriptionList.get(0),"Raceala", 24, DiagnosisType.ACUTE));
        diagnosisVector.add(new Diagnosis(234L, prescriptionList.get(1),"Gripa", 4, DiagnosisType.CHRONIC));
        diagnosisVector.add(new Diagnosis(233L, prescriptionList.get(2),"Varicela", 12, DiagnosisType.ACUTE));
        diagnosisVector.add(new Diagnosis(2423L, prescriptionList.get(1),"Urticare", 5, DiagnosisType.CHRONIC));

        diagnosis1.add(diagnosisVector.get(0));
        diagnosis2.add(diagnosisVector.get(1));
        diagnosis3.add(diagnosisVector.get(2));
        diagnosis4.add(diagnosisVector.get(3));



        medicalFiles[0] = new MedicalFile(50L, diagnosis1 );
        medicalFiles[1] = new MedicalFile(50L, diagnosis2);
        medicalFiles[2] = new MedicalFile(50L, diagnosis3);
        medicalFiles[3] = new MedicalFile(50L, diagnosis4);
        medicalFiles[4] = new MedicalFile(50L, diagnosisVector.subList(0, 1));

        patientList.add(new PatientChild(405L, "32042j4", "Daria", "Anastasiu", "0724345392", "daria@gmial.com", 18, medicalFiles[0], 253));
        patientList.add(new PatientChild(4052L, "332t442j4", "Camelia", "Ionescu", "0755345392", "ionesc@gmial.com", 10, medicalFiles[1], 200));
        patientList.add(new PatientAdult(4053L, "32042j4", "Daria", "Petrescu", "0724346692", "petrescu@gmial.com", 23, medicalFiles[2], 300, true));
        patientList.add(new PatientAdult(4054L, "3204serj4", "Marcel", "Simion", "0724378392", "simion@gmial.com", 25, medicalFiles[3], 405, false));
        patientList.add(new PatientElderly(4055L, "3204rert2j4", "Ion", "Marin", "0724345862", "marin@gmial.com", 80, medicalFiles[4], 600, true));


        appointmentMap.put(1L,new Appointment(1L, LocalDate.parse("2019-09-09"),"12:00", doctors.get(0), patientList.get(0), medicalCentre));
        appointmentMap.put(2L,new Appointment(2L, LocalDate.parse("2019-10-09"),"15:00", doctors.get(1), patientList.get(2), medicalCentre));
        appointmentMap.put(3L,new Appointment(3L, LocalDate.parse("2019-11-09"),"17:00", doctors.get(1), patientList.get(3), medicalCentre));

        appointmentList.add(new Appointment(1L, LocalDate.parse("2019-09-09"),"12:00", doctors.get(0), patientList.get(0), medicalCentre));
        appointmentList.add(new Appointment(2L, LocalDate.parse("2019-10-09"),"15:00", doctors.get(1), patientList.get(2), medicalCentre));
        appointmentList.add(new Appointment(2L, LocalDate.parse("2019-10-09"),"15:00", doctors.get(1), patientList.get(2), medicalCentre));

    /////////////////// FROM CSV

        pillsFromCSV = FileService.getInstance().readPillsFromCSV("files/pill.csv");
        doctorsFromCSV = FileService.getInstance().readDoctorsFromCSV("files/doctor.csv");
        medicalCentresFromCSV = FileService.getInstance().readMedicalCentresFromCSV("files/medicalcentre.csv");

//        prescriptionList.add(new Prescription(21L, pillList, LocalDate.parse("2019-01-02"), LocalDate.parse("2019-01-10")));
//        prescriptionList.add(new Prescription(1001L, pillList2, LocalDate.parse("2019-01-02"), LocalDate.parse("2019-01-10")));

    }

    public List<Patient>  patientsWithHeartRisk() {
        System.out.println("-------------Patients with heart disease risk");
        List<Patient> patients = new ArrayList<>();
        for (Patient patient : patientList) {
            if (patient.hasHeartDiseaseRisk()) {
                System.out.println(patient);
                patients.add(patient);
            }
        }

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis()));
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");
        return patients;
    }

    public List<Patient> childPatients(){
        System.out.println("-------------------Child patients");
        List<Patient> childPatient = new ArrayList<>();
        for (Patient patient : patientList) {
            if (patient.getClass() == PatientChild.class) {
                //System.out.println(patient);
                childPatient.add(patient);
            }
        }

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis()));
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");
        return childPatient;
    }


    public float getAppointment1Cost(){

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis()));
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");


        //Appointment app = appointmentMap.get(0);
        if( appointmentMap.get(1L).getDoctor().getSpecialisation().equals("Medic de Familie")){
            return 200;
        }
        else
            return 300;


    }

    public List<Patient> patientWithLongestDiagnosisList(){
        System.out.println("------------Patient with longest Diagnosis List");
        int maximum = 0;
        int i=0, j=0;
        int index;
        List<Patient> sikestpatients = new ArrayList<>();
        for(Patient patient: patientList){
            if(patient.getMedicalFile().getDiagnosisList().size() > maximum){
                maximum = patient.getMedicalFile().getDiagnosisList().size();
            }
        }

        for(Patient patient: patientList){
            if(patient.getMedicalFile().getDiagnosisList().size() == maximum ){
                //System.out.println(patient);
                sikestpatients.add(patient);
            }
        }

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis())).append(Thread.currentThread().getName());
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");
        return sikestpatients;
    }

    public void orderPatients() {
        System.out.println("---------------Patients Ordered");
        Collections.sort(patientList);
        for (Patient patient:patientList)
            System.out.println(patient);

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis())).append(Thread.currentThread().getName());
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");
    }

    public List<Doctor> getTheMostSpecialisedDoctor(){
        System.out.println("--------------The most experienced doctor");
        Collections.sort(doctors);
        System.out.println(doctors.get(1));
        List<Doctor> expDoctors = new ArrayList<>();
        expDoctors.add(doctors.get(1));
//        int i =2;
//        while (doctors.get(1).getYearsExperience() == doctors.get(i).getYearsExperience()){
//            expDoctors.add(doctors.get(i));
//        i++;
//        }

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis())).append(Thread.currentThread().getName());
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");

        return expDoctors;

    }

    public void getAllAppointmentsFrom2019(LocalDate mydate){
   // public void getAllAppointmentsFrom2019(){
        System.out.println("--------------Appointments from 2019");
        long i = 0;
        for (Long key : appointmentMap.keySet()) {
           // if (appointmentMap.get(key).getDate().getYear() == 2019){
            if ( mydate == appointmentMap.get(key).getDate()){
                System.out.println(appointmentMap.get(key));
            }
        }

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis())).append(Thread.currentThread().getName());
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");
    }

    public List<Patient> patientWithCancer(){
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis())).append(Thread.currentThread().getName());
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");

        List<Patient> cancerPatients = new ArrayList<>();

        for(Patient patient : patientList)
            for(Diagnosis diagnosis : patient.getMedicalFile().getDiagnosisList())
                if (diagnosis.getDisease() == "Cancer")
                    cancerPatients.add(patient);
        return cancerPatients;

    }

    public String stringprescriptionsContainingPill(String pillName){
        System.out.println("------------Toate retetele care contin Paracetamol");
StringBuilder str = new StringBuilder();
        for(Prescription prescription : prescriptionList)
            for(Pill pill : prescription.getPills())
                if(pill.getName() == pillName) {
                    str.append(prescription.toString());
                    str.append("\n");
                }

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis())).append(Thread.currentThread().getName());
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");
      return str.toString();
    }
    public List<Prescription> prescriptionsContainingPill(String pillName){
        System.out.println("------------Toate retetele care contin Paracetamol");
        List<Prescription> prescriptions = new ArrayList<>();

        for(Prescription prescription : prescriptionList)
            for(Pill pill : prescription.getPills())
                if(pill.getName() == pillName) {
                    System.out.println(prescription);
                    prescriptions.add(prescription);
                }

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis())).append(Thread.currentThread().getName());
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");

        return prescriptions;
    }

    public void prescriptionsContainingParacetamol(){
        System.out.println("------------Toate retetele care contin Paracetamol");
        for(Prescription prescription : prescriptionList)
            for(Pill pill : prescription.getPills())
                if(pill.getName() == "Paracetamol")
                    System.out.println(prescription);


        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis())).append(Thread.currentThread().getName());
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");
    }
    public int nrOfAppointmentsMadeByAGivenPatient(String firstName, String lastName){

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(new Object(){}.getClass().getEnclosingMethod().getName()).append(",").append(new Timestamp(System.currentTimeMillis())).append(Thread.currentThread().getName());
        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "files/audit.csv");



        int index = -1;
        int nr = 0;
        for (Patient patient : patientList)
            if(patient.getLastName() == lastName && patient.getFirstName() == firstName)
                index = patientList.indexOf(patient);
        if(index != -1){
            for (Appointment appointment : appointmentList)
                if(appointment.getPatient().getFirstName()== firstName && appointment.getPatient().getLastName() == lastName)
                    nr++;
             return nr;
        }
        return 0;

    }

    public void getPillsFromCSV(){
        System.out.println(pillsFromCSV);
    }
    public void getDoctorsFromCSV(){
        System.out.println(doctorsFromCSV);
    }
    public void getMedicalCentresFromCSV() {
        System.out.println(medicalCentresFromCSV);
    }


}
