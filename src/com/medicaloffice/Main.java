package com.medicaloffice;

import com.medicaloffice.service.Service;
import com.medicaloffice.service.ServiceDB;

import java.io.IOException;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {

        // I
//        Service.getInstance().patientsWithHeartRisk();
//        Service.getInstance().childPatients();
//        System.out.println(Service.getInstance().getAppointment1Cost());
//        Service.getInstance().patientWithLongestDiagnosisList();
//        Service.getInstance().orderPatients();
//        Service.getInstance().getTheMostSpecialisedDoctor();
//        // Service.getInstance().getAllAppointmentsFrom2019("2019-01-01");
//        System.out.println("Are there any patients with Cancer? " + Service.getInstance().patientWithCancer());
//        Service.getInstance().prescriptionsContainingParacetamol();
//        System.out.println("Nr of Appointments made by a given patient  " + Service.getInstance().nrOfAppointmentsMadeByAGivenPatient("Daria", "Petrescu"));

       // II
//        Service.getInstance().getPillsFromCSV();
//        Service.getInstance().getDoctorsFromCSV();
//        Service.getInstance().getMedicalCentresFromCSV();

        // III
//          ServiceDB.getInstance().insertPillDB();
//          ServiceDB.getInstance().selectPillsBD();
//          ServiceDB.getInstance().updatePillsBD_byId();
//          ServiceDB.getInstance().deletePillsBD_byName();

       // Service.getInstance().prescriptionsContainingPill("Paracetamol");
    }

}
