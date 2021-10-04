import javax.swing.JFrame;

public class Window {

	public Window() 
	{
		JFrame frame = new JFrame();
		GamePanel panel = new GamePanel();
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("SPACE INVADERS");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
	
	}
	
	public static void main( String[] args)
	{
		Window win = new Window();
	}
	
	}
