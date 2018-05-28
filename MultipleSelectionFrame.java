
package multipleselection;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


 public class MultipleSelectionFrame extends JFrame
 {
 private JList colorJList; 
 private JList copyJList; 
 private JButton copyJButton; 
 private static final String[] colorNames = { "Black", "Blue", "Cyan",
 "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
 "Pink", "Red", "White", "Yellow" };

 public MultipleSelectionFrame()
 {
 super( "Multiple Selection Lists" );
 setLayout( new FlowLayout() ); 

 colorJList = new JList( colorNames );
 colorJList.setVisibleRowCount( 5 ); 
colorJList.setSelectionMode(
ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );

 add( new JScrollPane( colorJList ) ); 
 copyJButton = new JButton( "Copy >>>" ); 
 copyJButton.addActionListener(

 new ActionListener() 
 {
 @Override
 public void actionPerformed( ActionEvent event )
 {
 copyJList.setListData( colorJList.getSelectedValues() );
 } 
 }
 );

add( copyJButton ); 

copyJList = new JList();
copyJList.setVisibleRowCount( 5 ); 
copyJList.setFixedCellWidth( 100 ); // set width
copyJList.setFixedCellHeight( 50 ); // set height
copyJList.setSelectionMode(
ListSelectionModel.SINGLE_INTERVAL_SELECTION );
add( new JScrollPane( copyJList ) ); 
 }
}