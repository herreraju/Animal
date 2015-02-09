import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.TextField;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Spaces extends Canvas 
	{
	static ImageIcon pa = new ImageIcon("board.jpg");
	static BufferedImage jkjkl = new BufferedImage(pa.getIconWidth(), pa.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
	static JFrame frame = new JFrame("Chutes And Ladders");
	static Spaces canvas = new Spaces();
	static JPanel pane = new JPanel();
	static JPanel py = new JPanel();
	static boolean firstTryG = true;
	static boolean firstTryR = true;
	static int rightLeftG = 0;
	static int rightLeftR = 0;
	static boolean atEndG = false;
	static boolean atEndR = false;
	static int totind = 0;
	static int coun = 0;
	static int guss = 0;
	static int moveGreen = 0;
	static int moveRed = 0;
	static int greenY = 415;
	static int greenX = -24;
	static int redY = 425;
	static int redX = -24;

	public static void makeBoard(int hu) 
		{
		frame.setSize(460, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setIgnoreRepaint(true);
		frame.setLayout(new BorderLayout());
		frame.getContentPane().add(canvas);
		canvas.repaint();
		frame.setResizable(false);
		frame.setLocation(Spinner.frameSpin.getX() - 490, Spinner.frameSpin.getY());
		frame.setVisible(true);
		}
	public void paint(Graphics g2) 
		{
		System.out.println(greenX + ", " + greenY);
		if(greenX == 20 && greenY == 19)
			{
			System.exit(0);
			}
		if(totind % 2 == 0)
			{
			switch(moveGreen)
				{
				case 0:
					{
					for (int g = 0; g <= 44; g++)
						{
						g2.drawImage(pa.getImage(), 5, 5, null);
						g2.setColor(Color.red);
						g2.fillOval(redX, redY, 20, 20);
						g2.setColor(Color.green);
						g2.fillOval(greenX + g, greenY, 20, 20);
						try
							{
							Thread.sleep(7);
							} catch (InterruptedException e)
							{
							e.printStackTrace();
							}
						}
					greenX += 44;
					break;
					}
				case 1:
					{
					for (int g = 0; g <= 44; g++)
						{
						g2.drawImage(pa.getImage(), 5, 5, null);
						g2.setColor(Color.red);
						g2.fillOval(redX, redY, 20, 20);
						g2.setColor(Color.green);
						g2.fillOval(greenX - g, greenY, 20, 20);
						try
							{
							Thread.sleep(7);
							} catch (InterruptedException e)
							{
							e.printStackTrace();
							}
						}
					greenX -= 44;
					break;
					}
				case 2:
					{
					for (int g = 0; g <= 44; g++)
						{
						g2.drawImage(pa.getImage(), 5, 5, null);
						g2.setColor(Color.red);
						g2.fillOval(redX, redY, 20, 20);
						g2.setColor(Color.green);
						g2.fillOval(greenX, greenY - g, 20, 20);
						try
							{
							Thread.sleep(7);
							} catch (InterruptedException e)
							{
							e.printStackTrace();
							}
						}
					greenY -= 44;
					rightLeftG++;
					break;
					}
				default:
					{
					break;
					}
				}
			if(firstTryG == true)
				{
				g2.drawImage(pa.getImage(), 5, 5, null);
				g2.setColor(Color.red);
				g2.fillOval(redX, redY, 20, 20);
				g2.setColor(Color.green);
				g2.fillOval(greenX, greenY, 20, 20);
				moveGreen = 0;
				firstTryG = false;
				atEndG = false;
				}
			else if(firstTryG == false)
				{
				atEndG = (atEndG == false) ? (greenX == 20 || greenX == 416) : false;
				moveGreen = (atEndG == true) ? (2) : (rightLeftG % 2);
				}
			}
		if(totind % 2 == 1)
			{
			switch(moveRed)
				{
				case 0:
					{
					for (int g = 0; g <= 44; g++)
						{
						g2.drawImage(pa.getImage(), 5, 5, null);
						g2.setColor(Color.green);
						g2.fillOval(greenX, greenY, 20, 20);
						g2.setColor(Color.red);
						g2.fillOval(redX + g, redY, 20, 20);
						try
							{
							Thread.sleep(7);
							} catch (InterruptedException e)
							{
							e.printStackTrace();
							}
						}
					redX += 44;
					break;
					}
				case 1:
					{
					for (int g = 0; g <= 44; g++)
						{
						g2.drawImage(pa.getImage(), 5, 5, null);
						g2.setColor(Color.green);
						g2.fillOval(greenX, greenY, 20, 20);
						g2.setColor(Color.red);
						g2.fillOval(redX - g, redY, 20, 20);
						try
							{
							Thread.sleep(7);
							} catch (InterruptedException e)
							{
							e.printStackTrace();
							}
						}
					redX -= 44;
					break;
					}
				case 2:
					{
					for (int g = 0; g <= 44; g++)
						{
						g2.drawImage(pa.getImage(), 5, 5, null);
						g2.setColor(Color.green);
						g2.fillOval(greenX, greenY, 20, 20);
						g2.setColor(Color.red);
						g2.fillOval(redX, redY - g, 20, 20);
						try
							{
							Thread.sleep(7);
							} catch (InterruptedException e)
							{
							e.printStackTrace();
							}
						}
					redY -= 44;
					rightLeftR++;
					break;
					}
				default:
					{
					break;
					}
				}
			if(firstTryR == true)
				{
				g2.drawImage(pa.getImage(), 5, 5, null);
				g2.setColor(Color.red);
				g2.fillOval(redX, redY, 20, 20);
				g2.setColor(Color.green);
				g2.fillOval(greenX, greenY, 20, 20);
				moveRed = 0;
				firstTryR = false;
				atEndR = false;
				}
			else if(firstTryR == false)
				{
				atEndR = (atEndR == false) ? (redX == 20 || redX == 416) : false;
				moveRed = (atEndR == true) ? (2) : (rightLeftR % 2);
				}
			}
		coun++;
		if(coun < Spinner.fullRand)
			{
			repaint();
			}
		else
			{
			coun = 0;
			totind++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			frame.setVisible(false);
			}
		}
}