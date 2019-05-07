package GUI;

import com.medicaloffice.models.Doctor;
import com.medicaloffice.models.Patient;
import com.medicaloffice.models.Prescription;
import com.medicaloffice.service.Service;
import com.medicaloffice.service.ServiceDB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class UIService {

    private JTabbedPane tabbedPane;
    private JPanel localStorage;
    private JPanel dbStorage;
    private JPanel mainPanel;
    private JPanel Find;
    private JTextField textFieldCNP;
    private JScrollPane mainJScrollPane;
    private JTable userTable;
    private JButton cancerPatient;
    private JButton heartriskPatients;
    private JButton sickestPatient;
    private JButton childPatients;
    private JButton experiencedDoctor;
    private JButton findPrescriptionsButton;
    private JTextField editText;
    private JLabel CNP;
    private JTextField textFieldTelephone;
    private JTextField textFieldName;
    private JButton UPDATETelFromNameButton;
    private JButton INSERTButton;
    private JTextField textFieldAge;
    private JButton DELETEFromNameButton;
    private JButton SELECTFromAgeButton;

    public UIService() {
        sickestPatient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Patient>, String> stringSwingWorker = new SwingWorker<List<Patient>, String>() {
                    @Override
                    protected List<Patient> doInBackground() throws Exception {

                        return Service.getInstance().patientWithLongestDiagnosisList();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Patient> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false; //super.isCellEditable(row, column);
                                        }
                                    };

                                    defaultTableModel.addColumn("Id");
                                    defaultTableModel.addColumn("CNP");
                                    defaultTableModel.addColumn("FirstName");
                                    defaultTableModel.addColumn("LastName");
                                    defaultTableModel.addColumn("Telephone Number");
                                    defaultTableModel.addColumn("Email");
                                    defaultTableModel.addColumn("Age");
                                    defaultTableModel.addColumn("Arterial Tension");
                                    defaultTableModel.addColumn("Medical File");


                                    for (Patient patient : result) {
                                        defaultTableModel.addRow(new Object[]{patient.getId(), patient.getCNP(), patient.getFirstName(), patient.getLastName(),
                                                patient.getTelephoneNumber(), patient.getEmail(), patient.getAge(), patient.getArterialTension(), patient.getMedicalFile()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });


                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }

                    }
                };

                stringSwingWorker.execute();

            }
        });


        cancerPatient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Patient>, String> stringSwingWorker = new SwingWorker<List<Patient>, String>() {
                    @Override
                    protected List<Patient> doInBackground() throws Exception {

                        return Service.getInstance().patientWithCancer();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Patient> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false; //super.isCellEditable(row, column);
                                        }
                                    };

                                    defaultTableModel.addColumn("Id");
                                    defaultTableModel.addColumn("CNP");
                                    defaultTableModel.addColumn("FirstName");
                                    defaultTableModel.addColumn("LastName");
                                    defaultTableModel.addColumn("Telephone Number");
                                    defaultTableModel.addColumn("Email");
                                    defaultTableModel.addColumn("Age");
                                    defaultTableModel.addColumn("Arterial Tension");
                                    defaultTableModel.addColumn("Medical File");


                                    for (Patient patient : result) {
                                        defaultTableModel.addRow(new Object[]{patient.getId(), patient.getCNP(), patient.getFirstName(), patient.getLastName(),
                                                patient.getTelephoneNumber(), patient.getEmail(), patient.getAge(), patient.getArterialTension(), patient.getMedicalFile()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });


                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }

                    }
                };

                stringSwingWorker.execute();

            }
        });

        heartriskPatients.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Patient>, String> stringSwingWorker = new SwingWorker<List<Patient>, String>() {
                    @Override
                    protected List<Patient> doInBackground() throws Exception {

                        return Service.getInstance().patientsWithHeartRisk();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Patient> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false; //super.isCellEditable(row, column);
                                        }
                                    };

                                    defaultTableModel.addColumn("Id");
                                    defaultTableModel.addColumn("CNP");
                                    defaultTableModel.addColumn("FirstName");
                                    defaultTableModel.addColumn("LastName");
                                    defaultTableModel.addColumn("Telephone Number");
                                    defaultTableModel.addColumn("Email");
                                    defaultTableModel.addColumn("Age");
                                    defaultTableModel.addColumn("Arterial Tension");
                                    defaultTableModel.addColumn("Medical File");


                                    for (Patient patient : result) {
                                        defaultTableModel.addRow(new Object[]{patient.getId(), patient.getCNP(), patient.getFirstName(), patient.getLastName(),
                                                patient.getTelephoneNumber(), patient.getEmail(), patient.getAge(), patient.getArterialTension(), patient.getMedicalFile()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });


                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }

                    }
                };

                stringSwingWorker.execute();

            }
        });


        childPatients.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Patient>, String> stringSwingWorker = new SwingWorker<List<Patient>, String>() {
                    @Override
                    protected List<Patient> doInBackground() throws Exception {

                        return Service.getInstance().childPatients();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Patient> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false; //super.isCellEditable(row, column);
                                        }
                                    };

                                    defaultTableModel.addColumn("Id");
                                    defaultTableModel.addColumn("CNP");
                                    defaultTableModel.addColumn("FirstName");
                                    defaultTableModel.addColumn("LastName");
                                    defaultTableModel.addColumn("Telephone Number");
                                    defaultTableModel.addColumn("Email");
                                    defaultTableModel.addColumn("Age");
                                    defaultTableModel.addColumn("Arterial Tension");
                                    defaultTableModel.addColumn("Medical File");


                                    for (Patient patient : result) {
                                        defaultTableModel.addRow(new Object[]{patient.getId(), patient.getCNP(), patient.getFirstName(), patient.getLastName(),
                                                patient.getTelephoneNumber(), patient.getEmail(), patient.getAge(), patient.getArterialTension(), patient.getMedicalFile()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });


                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }

                    }
                };

                stringSwingWorker.execute();

            }
        });


        experiencedDoctor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Doctor>, String> stringSwingWorker = new SwingWorker<List<Doctor>, String>() {
                    @Override
                    protected List<Doctor> doInBackground() throws Exception {

                        return Service.getInstance().getTheMostSpecialisedDoctor();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Doctor> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false; //super.isCellEditable(row, column);
                                        }
                                    };

                                    defaultTableModel.addColumn("Id");
                                    defaultTableModel.addColumn("FirstName");
                                    defaultTableModel.addColumn("LastName");
                                    defaultTableModel.addColumn("Specialization");
                                    defaultTableModel.addColumn("Years of experience");

                                    for (Doctor doctor : result) {
                                        defaultTableModel.addRow(new Object[]{doctor.getId(), doctor.getFirstName(), doctor.getLastName(),
                                                doctor.getSpecialisation(), doctor.getYearsExperience()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });


                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }

                    }
                };

                stringSwingWorker.execute();

            }
        });




//------------------ FIND TAB
        findPrescriptionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pillName = editText.getText();
                String string = new String();
                string = Service.getInstance().stringprescriptionsContainingPill(pillName);
                JOptionPane.showMessageDialog(null, string, "Atenție", JOptionPane.INFORMATION_MESSAGE);
            }
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                SwingWorker<List<Prescription>, String> stringSwingWorker = new SwingWorker<List<Prescription>, String>() {
//                    @Override
//                    protected List<Prescription> doInBackground() throws Exception {
//
//                        String pillName = editText.getText();
//                        if (pillName.length() >= 5)
//                            return Service.getInstance().prescriptionsContainingPill(pillName);
//                        else {
//                            JOptionPane.showMessageDialog(null, "Nume invalid!", "Atenție", JOptionPane.ERROR_MESSAGE);
//                            List<Prescription> emp = new ArrayList<>();
//                            return emp;
//                        }
//                    }
//
//                    @Override
//                    protected void done() {
//
//                        try {
//                            List<Prescription> result = get();
//
//                            SwingUtilities.invokeLater(new Runnable() {
//                                @Override
//                                public void run() {
//
//                                    StringBuilder s = new StringBuilder();
//                                    for (Prescription prescription : result) {
//                                        s.append(Long.toString(prescription.getId())).append(" ").append(prescription.getPills()).append(prescription.getStartDate()).append(prescription.getEndDate())
//                                                .append("\n");
//                                    }
//                                    s.append("found");
//                                    JOptionPane.showMessageDialog(null, s.toString(), "Atenție", JOptionPane.INFORMATION_MESSAGE);
//
//                                }
//                            });
//
//
//                        } catch (InterruptedException ex) {
//                            ex.printStackTrace();
//                        } catch (ExecutionException ex) {
//                            ex.printStackTrace();
//                        }
//
//                    }
//                };
//
//                stringSwingWorker.execute();
//
//            }

        });





        //----------------------------------DB Storage
        INSERTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ServiceDB.getInstance().insertPatientDB(textFieldCNP.getText(), textFieldName.getText(),
                            textFieldTelephone.getText(), Integer.parseInt(textFieldAge.getText()));
                    JOptionPane.showMessageDialog(null, "Patient successfully inserted !", "Atenție", JOptionPane.INFORMATION_MESSAGE);

                    textFieldCNP.setText("");
                    textFieldName.setText("");
                    textFieldTelephone.setText("");
                    textFieldAge.setText("");

                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        DELETEFromNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textFieldName.getText();
                if (name.length() >= 5) {
                    try {
                        ServiceDB.getInstance().deletePatientBD_byName(name);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Patient successfully deleted !", "Atenție", JOptionPane.INFORMATION_MESSAGE);

                    textFieldCNP.setText("");
                    textFieldName.setText("");
                    textFieldTelephone.setText("");
                    textFieldAge.setText("");
                }
            }
        });
        UPDATETelFromNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textFieldName.getText();
                String telephone = textFieldTelephone.getText();
                if (name.length() >= 5 && telephone.length() >= 5) {
                    try {
                        ServiceDB.getInstance().updatePatientBD_byName(name, telephone);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Patient successfully deleted !", "Atenție", JOptionPane.INFORMATION_MESSAGE);

                    textFieldCNP.setText("");
                    textFieldName.setText("");
                    textFieldTelephone.setText("");
                    textFieldAge.setText("");
                }
            }

        });

        SELECTFromAgeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }
        public void initGUI () {
            JFrame jFrame = new JFrame("Medical Office");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setPreferredSize(new Dimension(800, 600));
            jFrame.setContentPane(this.mainPanel);
            // set prefered size, otherwise your jFrame is going to be something small in a corner
            jFrame.setPreferredSize(new Dimension(800, 600));

            // make the jFrame visible
            jFrame.pack();
            jFrame.setVisible(true);
        }


        public static void main (String args[]){
            UIService mainFrame = new UIService();

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    mainFrame.initGUI();
                }
            });

        }

        private void createUIComponents () {
            JButton oneButton = new JButton("do something!!!!");
            oneButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("button 'do something!!!!' was pressed!");
                }
            });
            // create manually a new panel, like we already said, this is custom
            Find = new JPanel();
            Find.add(oneButton);
        }

    }
