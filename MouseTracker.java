/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MouseTrackerFrame;

// Testing MouseTrackerFrame.
 import javax.swing.JFrame;

public class MouseTracker
 {
 public static void main( String[] args )
{
 MouseTrackerFrame mouseTrackerFrame;
     mouseTrackerFrame = new MouseTrackerFrame();
 mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
mouseTrackerFrame.setSize( 300, 100 ); // set frame size
 mouseTrackerFrame.setVisible( true ); // display frame
 } // end main
 } // en