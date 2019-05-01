package GUI;

import javax.swing.*;
import java.awt.*;

public class UIService {

    private JTabbedPane tabbedPane;
    private JPanel localStorage;
    private JPanel dbStorage;
    private JPanel mainPanel;

    public void init() {
        JFrame jFrame = new JFrame("Medical Office");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(800, 600));
        jFrame.setContentPane(this.mainPanel);
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        createLocalStorage();
        createDbStorage();


        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("LocalStorage", localStorage);
        tabbedPane.addTab("DBStorage", dbStorage);
        topPanel.add(tabbedPane, BorderLayout.CENTER);
    }

    public void createLocalStorage() {
        localStorage = new JPanel();
        localStorage.setLayout(null);
        JLabel label1 = new JLabel("Username:");
        label1.setBounds(10, 15, 150, 20);
        localStorage.add(label1);
        JTextField field = new JTextField();
        field.setBounds(10, 35, 150, 20);
        localStorage.add(field);
        JLabel label2 = new JLabel("Password:");
        label2.setBounds(10, 60, 150, 20);
        localStorage.add(label2);
        JPasswordField fieldPass = new JPasswordField();
        fieldPass.setBounds(10, 80, 150, 20);
        localStorage.add(fieldPass);
    }


    public void createDbStorage() {
        dbStorage = new JPanel();
        dbStorage.setLayout(new GridLayout(3, 2));
        dbStorage.add(new JLabel("Field 1:"));
        dbStorage.add(new TextArea());
        dbStorage.add(new JLabel("Field 2:"));
        dbStorage.add(new TextArea());
        dbStorage.add(new JLabel("Field 3:"));
        dbStorage.add(new TextArea());
    }

    public static void main(String args[]) {
        UIService mainFrame = new UIService();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainFrame.init();
            }
        });

    }
}

