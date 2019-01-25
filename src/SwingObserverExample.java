import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SwingObserverExample {


    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        JFrame frame;
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random rand = new Random();
            JFrame frame = new JFrame("Angel");
            TextField panel = new TextField("Don't do it, you might regret it!");
            frame.getContentPane().add(BorderLayout.CENTER, panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocation(rand.nextInt()%500 + 500,rand.nextInt()%500 + 500);
            frame.setVisible(true);
            System.out.println("Don't do it, you might regret it!");
        }
    }
    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random rand = new Random();
            JFrame frame = new JFrame("Devil");
            TextField panel = new TextField("Come on, do it!");
            frame.getContentPane().add(BorderLayout.CENTER, panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setLocation(rand.nextInt()%500 + 500,rand.nextInt()%500 + 500);
            System.out.println("Come on, do it!");
        }
    }
}
