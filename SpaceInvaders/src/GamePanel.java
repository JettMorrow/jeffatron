import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2504637551679554432L;

	public GamePanel()
	{
		setPreferredSize(new Dimension(800,600));
	}
	
	public void paint(Graphics g)
	{
//		g.setColor(Color.BLACK);
//		g.drawRect(0,0,800,600);
		ImageIcon background = new ImageIcon("images//SplashScreen.png");
		g.drawImage(background.getImage(),0,0,null);
		
	}
}
