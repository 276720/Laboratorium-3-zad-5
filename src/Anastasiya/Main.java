package Anastasiya;

import javax.swing.*;

public class Main extends JFrame {
    private MyPanel panel;
    private JPanel contentPanel;

    public Main(){
        super("Zadanie 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contentPanel = new JPanel();
        contentPanel.setLayout(null);

        panel = new MyPanel();
        contentPanel.add(panel);

        setContentPane(contentPanel);
        setSize(400,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    Main test = new Main();
                    test.setVisible(true);

                }catch (Exception e){
                    e.printStackTrace(System.err);
                }
            }
        });
    }
}