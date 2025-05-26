package observable;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        button.addActionListener(event -> System.out.println("Don't do it!"));
        button.addActionListener(event -> System.out.println("Do it!"));
//        button.addActionListener(new AngelListener());
//        button.addActionListener(new DevilListener());
    }

//    static class AngelListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("Don't do it, you might regret it!");
//        }
//    }
//
//    static class DevilListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("Come on, do it!");
//        }
//    }
}
