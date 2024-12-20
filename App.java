
// not finish yet

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App extends JFrame {

    App(){
        this.setTitle("Java Swing Test");
        this.setSize(650, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
    }

    public static void main(String[] args) {
        JLabel toplabel = new JLabel("Welcome");
        JButton btn_Home = new JButton("Home");
        JButton btn_Profile = new JButton("Profile");
        JButton btn_Setting = new JButton("Setting");

        JPanel navPanel = new JPanel();
        navPanel.setBackground(new Color(0x1e1e1e));
        navPanel.setPreferredSize(new Dimension(150, 100));
        navPanel.setLayout(new BorderLayout());

        JPanel Centerpanel = new JPanel();
        Centerpanel.setBackground(Color.PINK);
        Centerpanel.setPreferredSize(new Dimension(10, 10));



        // ************************************ //
        // top panel

        JPanel toppanel = new JPanel();
        toppanel.setPreferredSize(new Dimension(navPanel.getWidth(), 250));
        toppanel.setLayout(new BorderLayout());

        // title panel
        JPanel titlepanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        titlepanel.add(toplabel);

        toppanel.add(titlepanel, BorderLayout.NORTH);


        // button panel
        buttonPanel.setLayout(null);
        buttonPanel.setBackground(Color.MAGENTA);
        buttonPanel.add(btn_Home);


        toppanel.add(buttonPanel);
        // ************************************ //




        // bottom panel
        
        JPanel bottompanel = new JPanel();
        bottompanel.setPreferredSize(new Dimension(navPanel.getWidth(), 50));
        bottompanel.setLayout(null);

        JButton exit = new JButton("EXIT");
        exit.setBounds(0,0, 150, 50);
        exit.setBackground(Color.GREEN);
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ActionListener actionbtnexit = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == exit){
                    // add action
                    System.out.println("exit");
                }
            }
        };

        exit.addActionListener(actionbtnexit);
        bottompanel.add(exit);

        
        // apply

        navPanel.add(toppanel, BorderLayout.NORTH);
        navPanel.add(bottompanel, BorderLayout.SOUTH);
        
        App app = new App();
        app.add(navPanel, BorderLayout.WEST);
        app.add(Centerpanel, BorderLayout.CENTER);
    }

}