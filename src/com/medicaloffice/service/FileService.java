package com.medicaloffice.service;

import com.medicaloffice.models.Doctor;
import com.medicaloffice.models.MedicalCentre;
import com.medicaloffice.models.Pill;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    private static FileService ourInstance = new FileService();

    public static FileService getInstance() {
        return ourInstance;
    }

    private FileService() {
    }

    public List<Pill> readPillsFromCSV(String fileNamePath){

        List<Pill> pills = new ArrayList<>();
        try {

            BufferedReader br = new BufferedReader(new FileReader(fileNamePath));
            String line;
            while ((line = br.readLine()) != null) {

                String[] entries = line.split(",");
                pills.add(new Pill(Long.parseLong(entries[0].trim()), entries[1], entries[2]));
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pills;
    }

    public List<Doctor> readDoctorsFromCSV(String fileNamePath){

        List<Doctor> doctors = new ArrayList<>();
        try {

            BufferedReader br = new BufferedReader(new FileReader(fileNamePath));
            String line;
            while ((line = br.readLine()) != null) {

                String[] entries = line.split(",");
                doctors.add(new Doctor(Long.parseLong(entries[0].trim()), entries[1],entries[2],
                        entries[3], entries[4], Integer.parseInt(entries[5].trim())));
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return doctors;
    }

    public List<MedicalCentre> readMedicalCentresFromCSV(String fileNamePath) {
        List<MedicalCentre> medicalCentres = new ArrayList<>();
        try {

            BufferedReader br = new BufferedReader(new FileReader(fileNamePath));
            String line;
            while ((line = br.readLine()) != null) {

                String[] entries = line.split(",");
                medicalCentres.add(new MedicalCentre(Long.parseLong(entries[0].trim()), entries[1],entries[2],
                        entries[3], entries[4]));
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return medicalCentres;
    }


//    public Electric readElectricFromFile(String fileNamePath) {
//        Electric electric = null;
//        try {
//
//            LineNumberReader lineNumberReader = new LineNumberReader(
//                    new FileReader(fileNamePath));
//
//            String line = lineNumberReader.readLine();
//            String[] values = line.split(",");
//            int km = 0;
//            try {
//                km = Integer.parseInt(values[2].trim());
//            } catch (NumberFormatException exc) {
//                exc.printStackTrace();
//            }
//
//            int duration = 0;
//            try {
//                duration = Integer.parseInt(values[3].trim());
//            } catch (NumberFormatException exc) {
//                exc.printStackTrace();
//            }
//
//            electric = new Electric(Boolean.parseBoolean(values[0]), Boolean.parseBoolean(values[1]),
//                    km, duration);
//            lineNumberReader.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return electric;
//    }
}
