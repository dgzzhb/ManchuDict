import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainWindow {
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;

	public MainWindow() {
		setupGUI();
	}

	private void setupGUI() {
		JFrame frame = new JFrame("满汉英词典");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel in = new JPanel();
		JPanel out = new JPanel();
		final JTextField inText = new JTextField(13);
		JButton button = new JButton("查询");
		in.add(inText);
		in.add(button);
		final JTextArea outText = new JTextArea(7,20);
		out.add(outText);
		frame.add(in, BorderLayout.NORTH);
		frame.add(out, BorderLayout.CENTER);
		frame.pack();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setVisible(true);
	}
	
}
