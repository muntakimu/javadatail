/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MouseTrackerFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/**
 *
 * @author ASUS
 */
class MouseTrackerFrame extends JFrame {

    private final JPanel mousePanel;
    private final JLabel statusBar;
    public MouseTrackerFrame(){
    mousePanel = new JPanel();
    mousePanel.setBackground(Color.WHITE);
    add(mousePanel,BorderLayout.CENTER);
    statusBar =new JLabel("Mouse outside Jpanel");
    add(statusBar,BorderLayout.SOUTH);
    MouseHandler handler = new MouseHandler();
mousePanel.addMouseListener( handler );
mousePanel.addMouseMotionListener( handler );
    
    }
    private class MouseHandler implements MouseListener,
MouseMotionListener{
       

        @Override
        public void mouseClicked(MouseEvent me) {
        statusBar.setText(String.format("Clicked at [%d,%d]",me.getX(),me.getY()));
        }

        @Override
        public void mousePressed(MouseEvent me) {
            statusBar.setText( String.format( "Pressed at [%d, %d]",me.getX(),me.getY())); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseDragged(MouseEvent me) {
        statusBar.setText( String.format( "Dragged at [%d, %d]",me.getX(),me.getY() ));    
        }

        @Override
        public void mouseMoved(MouseEvent me) {
            statusBar.setText( String.format( "Moved at [%d, %d]",me.getX(),me.getY())); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me) {
             //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
}
