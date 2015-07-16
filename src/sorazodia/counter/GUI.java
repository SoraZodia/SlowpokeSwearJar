/**
 * 
 */
package sorazodia.counter;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Sets up everything need for Java to draw a GUI out
 * 
 * @author SoraZodia
 */
@SuppressWarnings("serial")
public class GUI extends JPanel{
  /** Button to increment the count*/
  private JButton add = new JButton("+");
  /** Button to decrement the count*/
  private JButton subtract = new JButton("-");
  /** Displays the count*/
  private JLabel counter = new JLabel("0");
  
  /**Tracks the current swear count*/
  public int count = 0;
  
  /**
   * Sets up and add the different compound into the frame
   */
  private GUI() {
    this.prepareCompound();
    
    this.add(subtract);
    this.add(counter);
    this.add(add);
  }
  
  /**
   * Creates a window to fit and display the frame. Starts up program
   */
  public static void drawGUI() {
    GUI frame = new GUI();
    
    JFrame window = new JFrame("Slowpoke's Swear Jar");
    window.add(frame);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setPreferredSize(new Dimension(350, 100));
    
    window.pack();
    window.setVisible(true);
  }
  
  /**
   * Adds funtion to the button so they will change the count when pressed
   */
  public void prepareCompound() {
    add.addActionListener((ActionEvent action) -> changeCount(0));
    subtract.addActionListener((ActionEvent action) -> changeCount(1));
  }
  
  /**
   * Used by the + and - button to change the count.
   */
  private void changeCount(int choice) {
    switch(choice) {
    case 0:
      count++;
      counter.setText(Integer.toString(count));
      break;
      
    case 1:
      count--;
      counter.setText(Integer.toString(count));
      break;
      
    default:
      break;
    }
  }

}
