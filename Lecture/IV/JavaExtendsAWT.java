import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class JavaExtendsAWT extends Frame {
    JavaExtendsAWT() {
        Button b = new Button("click me");
        b.setBounds(30, 100, 80, 30);// setting button position
        add(b);// adding button into frame
        setSize(300, 300);// frame size 300 width and 300 height
        setLayout(null);// no layout manager
        setVisible(true);// now frame will be visible, by default not visible
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });    
    }

    public static void main(String args[]) {
        JavaExtendsAWT f = new JavaExtendsAWT();
    }
}