import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.TextField;
import java.text.AttributedCharacterIterator;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;









import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.TextField;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Spinner extends Canvas 
	{
	static int fullRand = 1;
	static ImageIcon spi = new ImageIcon("spinner.jpg");
	static ImageIcon pie = new ImageIcon("spinnerPeg.png");
	static JButton button = new JButton("Spin");
	static Image pe = pie.getImage();
	static JFrame frameSpin = new JFrame("Spinner");
	static Spinner canvasSpin = new Spinner();
	static boolean lop = false;
	public static void main(String[] args) 
		{
		makeSpin();
		}
	public static void makeSpin() 
		{
		frameSpin.setSize(170, 223);
		frameSpin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameSpin.setLayout(new BorderLayout());
		final JPanel panel = new JPanel();
		frameSpin.getContentPane().add(canvasSpin, BorderLayout.CENTER);
		frameSpin.getContentPane().add(button, BorderLayout.SOUTH);
		frameSpin.setResizable(false);
		frameSpin.setLocationRelativeTo(null);
		frameSpin.setVisible(true);
		}
	public void paint(final Graphics g) 
		{
		Graphics2D g2 = (Graphics2D)g;
		pe = pie.getImage();
		g2.drawImage(spi.getImage(), 0, 0, null);
		g2.drawImage(pe, 46, 47, null);
		if(lop == true)
			{
			int randNum = (int)(((Math.random()) * 7) + 1);
			randNum = 7;
			int spinDegRes = 0;
			for (int i = 1; i <= 4; i++) 
				{
				for (int u = 0; u <= 360; u++)
					{
					pe = pie.getImage();
					g2.drawImage(spi.getImage(), 0, 0, null);
					rotateImage(u);
					g2.drawImage(pe, 46, 47, null);
					try
						{
						Thread.sleep(i);
						} 
					catch (InterruptedException e)
						{
						e.printStackTrace();
						}
					}
				}
			System.out.println(randNum);
			switch(randNum)
			{
			case 1:
				{
				spinDegRes = 180;
				break;
				}
			case 2:
				{
				spinDegRes = 135;
				break;
				}
			case 3:
				{
				spinDegRes = 80;
				break;
				}
			case 4:
				{
				spinDegRes = 29;
				break;
				}
			case 5:
				{
				spinDegRes = 337;
				break;
				}
			case 6:
				{
				spinDegRes = 280;
				break;
				}
			case 7:
				{
				spinDegRes = 230;
				break;
				}
			}
			for (int u = 0; u <= spinDegRes; u++)
				{
				pe = pie.getImage();
				g2.drawImage(spi.getImage(), 0, 0, null);
				rotateImage(u);
				g2.drawImage(pe, 46, 47, null);
				try
					{
					Thread.sleep(5);
					} 
				catch (InterruptedException e)
					{
					e.printStackTrace();
					}
				}
			pe = pie.getImage();
			g2.drawImage(spi.getImage(), 0, 0, null);
			rotateImage(spinDegRes);
			g2.drawImage(pe, 46, 47, null);
			try
				{
				Thread.sleep(1500);
				} 
			catch (InterruptedException e)
				{
				e.printStackTrace();
				}
			fullRand = randNum;
			//frameSpin.dispose();
			}
		button.addActionListener(new ActionListener()
			{
			@Override
			public void actionPerformed(ActionEvent e)
				{
				lop = true;
				repaint();
				Spaces.makeBoard(fullRand);
				}
			});
		}
	public void rotateImage(double deg)
		{
		BufferedImage bi = new BufferedImage(pie.getIconWidth(), pie.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D gg2 = (Graphics2D)bi.getGraphics();
		gg2.rotate(Math.toRadians(deg), (pie.getIconWidth()/2), (pie.getIconHeight()/2));
		gg2.drawImage(pe, 0, 0, null);
		pe = bi;
		}
}