//package com.fmi.swing.example;
//
//import GUI.UserForm;
//
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.List;
//import java.util.concurrent.ExecutionException;
//
//public class AppMainForm {
//    private JPanel mainPanel;
//    private JButton childPatients;
//    private JScrollPane mainJScrollPane;
//    private JTable userTable;
//    private JButton heartriskPatients;
//    private JButton cancerPatient;
//    private JButton sickestPatient;
//
//    public AppMainForm() {
//        childPatients.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                UserForm userForm = new UserForm();
//
//                userForm.showUserForm();
//
//                System.out.println("what form told us : " + userForm.getUserByForm());
//                userForm.dispose();
//
//            }
//        });
//        heartriskPatients.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                SwingWorker<List<User>, String> stringSwingWorker = new SwingWorker<List<User>, String>() {
//                    @Override
//                    protected List<User> doInBackground() throws Exception {
//
//                        return UserService.getInstance().findAll();
//                    }
//
//                    @Override
//                    protected void done() {
//
//                        try {
//                            List<User> result = get();
//
//                            SwingUtilities.invokeLater(new Runnable() {
//                                @Override
//                                public void run() {
//                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
//                                        @Override
//                                        public boolean isCellEditable(int row, int column) {
//                                            return false; //super.isCellEditable(row, column);
//                                        }
//                                    };
//
//                                    defaultTableModel.addColumn("Id");
//                                    defaultTableModel.addColumn("username");
//                                    defaultTableModel.addColumn("date of birth");
//
//                                    for (User user : result) {
//                                        defaultTableModel.addRow(new Object[] {user.getId(), user.getUsername(), user.getDateOfBirth()});
//                                    }
//
//                                    userTable.setModel(defaultTableModel);
//                                }
//                            });
//
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
//        });
//    }
//
//    private void initFrameWithMenu() {
//        JFrame jFrame = new JFrame("Medical Office");
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setPreferredSize(new Dimension(800, 600));
//        jFrame.setContentPane(this.mainPanel);
//
//        JMenuBar jMenuBar = new JMenuBar();
//        JMenu fileMenu = new JMenu("Local Storage");
//
//        fileMenu.addMenuListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JPanel
//            }
//        }
//    );
//        jMenuBar.add(fileMenu);
//
//        jFrame.setJMenuBar(jMenuBar);
//
//        jFrame.pack();
//        jFrame.setVisible(true);
//
//
//
//
//
//
//    public static void main(String[] args) {
//
//        AppMainForm appMainForm = new AppMainForm();
//
//
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                appMainForm.initFrameWithMenu();
//            }
//        });
//
//
//    }
//}
