package com.sample;

import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
public class DotsPanel extends JPanel implements MouseListener, MouseMotionListener, MouseWheelListener
{
private  int SIZE =6; // radius of each dot
private ArrayList<Point> pointList;
//-----------------------------------------------------------------
// Constructor: Sets up this panel to listen for mouse events.
//-----------------------------------------------------------------
public DotsPanel()
{
pointList = new ArrayList<Point>();

//addMouseListener (new DotsListener());
addMouseListener (this);
setBackground (Color.black);
setPreferredSize (new Dimension(300, 200));
}
//----------------------------------------------------------------
// Draws all of the dots stored in the list.
//----------------------------------------------------------------
public void paintComponent (Graphics page)
{
super.paintComponent(page);
page.setColor (Color.green);
for (Point spot: pointList)
page.fillOval (spot.x-SIZE, spot.y-SIZE, SIZE*2, SIZE*2);
page.drawString ("Count: " + pointList.size(), 5, 15);
}

public void mousePressed (MouseEvent event)
{
pointList.add(event.getPoint());
repaint();
}
public void mouseClicked (MouseEvent event) {}
public void mouseReleased (MouseEvent event) {}
public void mouseEntered (MouseEvent event) {}
public void mouseExited (MouseEvent event) {}

//@Override
public void mouseDragged(MouseEvent event) 
{
    pointList.add(event.getPoint());
   // dotSizes[pointList.size()-1] = SIZE;
    //store size of dot here
    repaint();

}

//@Override
public void mouseMoved(MouseEvent event) {}

//@Override
public void mouseWheelMoved(MouseWheelEvent event) 
{
    SIZE -= event.getWheelRotation();
    repaint();
}

//*****************************************************************
// Represents the listener for mouse events.
//*****************************************************************
	/*	private class DotsListener extends MouseAdapter // implements MouseListener
		{
		//----------------------------------------------------------------
		// Adds the current point to the list of points and redraws
		// the panel whenever the mouse button is pressed.
		//----------------------------------------------------------------
		public void mousePressed (MouseEvent event)
		{
		pointList.add(event.getPoint());
		repaint();
		}
		
		//----------------------------------------------------------------
		//Provide empty definitions for unused event methods.
		//----------------------------------------------------------------
		public void mouseClicked (MouseEvent event) {}
		public void mouseReleased (MouseEvent event) {}
		public void mouseEntered (MouseEvent event) {}
		public void mouseExited (MouseEvent event) {}
		}
		*/
}