package colors;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

 public class ListFrame extends JFrame
 {

private static final String[] colorNames = { "Black", "Blue", "Cyan",
 "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
"Orange", "Pink", "Red", "White", "Yellow" };
private static final Color[] colors = { Color.BLACK, Color.BLUE,
 Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
 Color.RED, Color.WHITE, Color.YELLOW };

public ListFrame()
{
super( "List Test" );
 setLayout( new FlowLayout() ); // set frame layout
    JList colorJList = new JList( colorNames );
    colorJList.setVisibleRowCount( 5 );
    colorJList.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
    add( new JScrollPane( colorJList ) );
    colorJList.addListSelectionListener(
 new ListSelectionListener() // anonymous inner class
 {
 // handle list selection events
 @Override
 public void valueChanged( ListSelectionEvent event )
 {
 getContentPane().setBackground(
 colors[ colorJList.getSelectedIndex()] );
 } // end method valueChanged
 } // end anonymous inner class
 ); // end call to addListSelectionListener
 } // end ListFrame constructor
 }