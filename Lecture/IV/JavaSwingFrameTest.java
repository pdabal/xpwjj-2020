import java.awt.*;
import javax.swing.*;

public class JavaSwingFrameTest {

	public static void main(String[] args){
		EventQueue.invokeLater(() -> {
			JavaSwingFrame frame = new JavaSwingFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
