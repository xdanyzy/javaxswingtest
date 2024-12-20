
// not finish yet

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App extends JFrame {
    App(){
        this.setTitle("Java Swing Test");
        this.setSize(650, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
    }

    public static void main(String[] args) {

        JPanel navPanel = new JPanel();
        JPanel CenterPanel = new JPanel();

        CenterPanel.setPreferredSize(new Dimension(100, 100));
        CenterPanel.setBackground(Color.pink);


        navPanel.setBackground(new Color(0x1e1e1e));
        navPanel.setPreferredSize(new Dimension(150, 100));
        navPanel.setLayout(new BorderLayout());

        JPanel toppanel = new JPanel();
        toppanel.setPreferredSize(new Dimension(navPanel.getWidth(), 250));
        toppanel.setLayout(new BorderLayout());


        // ---------------------- top panel ----------------------- //
        // title panel

        JPanel titlepanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        JLabel toplabel = new JLabel("Welcome");

        toplabel.setForeground(Color.WHITE);
        toplabel.setVerticalAlignment(JLabel.CENTER);
        toplabel.setHorizontalAlignment(JLabel.CENTER);

        titlepanel.setBackground(new Color(0x1e1e1e));
        titlepanel.setPreferredSize(new Dimension(navPanel.getWidth(), 50));
        titlepanel.setLayout(new BorderLayout());
        titlepanel.add(toplabel);

        toppanel.add(titlepanel, BorderLayout.NORTH);


        // button panel

        JButton btn_Home = new JButton("Home");
        JButton btn_Profile = new JButton("Profile");
        JButton btn_Setting = new JButton("Setting");

        btn_Home.setBounds(0, 0, 150, 50);
        btn_Profile.setBounds(0, btn_Home.getHeight(), 150, 50);
        btn_Setting.setBounds(0, btn_Home.getHeight()*2, 150, 50);

        // set cursor
        btn_Home.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn_Profile.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn_Setting.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // action button
        btn_Home.addActionListener(ActionEvent -> {
            
        });
        btn_Profile.addActionListener(ActionEvent -> {});
        btn_Setting.addActionListener(ActionEvent -> {});

        //color button
        btn_Home.setBackground(new Color(0x2e2e2e));
        btn_Profile.setBackground(new Color(0x2e2e2e));
        btn_Setting.setBackground(new Color(0x2e2e2e));

        // foreground button
        btn_Home.setForeground(Color.WHITE);
        btn_Profile.setForeground(Color.WHITE);
        btn_Setting.setForeground(Color.WHITE);

        buttonPanel.setLayout(null);
        buttonPanel.setBackground(new Color(0x1e1e1e));

        buttonPanel.add(btn_Home);
        buttonPanel.add(btn_Profile);
        buttonPanel.add(btn_Setting);


        toppanel.add(buttonPanel, BorderLayout.CENTER);



        // ---------------------- Bottom panel ----------------------- //
        
        JPanel bottompanel = new JPanel();
        bottompanel.setPreferredSize(new Dimension(navPanel.getWidth(), 50));
        bottompanel.setLayout(null);

        JButton exit = new JButton("EXIT");
        exit.setBounds(0,0, 150, 50);
        exit.setBackground(new Color(0x2e2e2e));
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit.setForeground(Color.WHITE);

        JLabel label_dalam_centerpanel = new JLabel("jdashdkljsadkla");

        ActionListener actionbtnexit = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == exit){
                    CenterPanel.add(label_dalam_centerpanel, BorderLayout.CENTER);
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
        app.add(CenterPanel, BorderLayout.CENTER);

    }

}