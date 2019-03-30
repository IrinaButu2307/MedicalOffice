package com.medicaloffice;

import com.medicaloffice.service.Service;

public class Main {

    public static void main(String[] args) {
        Service.getInstance().patientsWithHeartRisk();
        Service.getInstance().childPatients();
//        System.out.println(Service.getInstance().getAppointment1Cost());
        Service.getInstance().patientWithLongestDiagnosisList();
        Service.getInstance().orderPatients();
        Service.getInstance().getTheMostSpecialisedDoctor();
        Service.getInstance().getAllAppointmentsFrom2019();
        System.out.println("Are there any patients with Cancer? " + Service.getInstance().patientWithCancer());
        Service.getInstance().prescriptionsContainingParacetamol();
        System.out.println("Nr of Appointments made by a given patient  " + Service.getInstance().nrOfAppointmentsMadeByAGivenPatient("Daria", "Petrescu"));

    }
}
