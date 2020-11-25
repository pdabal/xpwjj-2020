import java.awt.*;
import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class JavaNewAWT {
    JavaNewAWT() {
        Frame f = new Frame();
        Button b = new Button("click me");
        b.setBounds(30, 50, 80, 30);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ((Frame) e.getSource()).dispose();
            }
        });
    }

    public static void main(String args[]) {
        JavaNewAWT f = new JavaNewAWT();
    }
}