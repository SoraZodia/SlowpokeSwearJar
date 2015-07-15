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
 * @author SoraZodia
 *
 */
@SuppressWarnings("serial")
public class GUI extends JPanel{
  private JButton add = new JButton("+");
  private JButton subtract = new JButton("-");
  private JLabel counter = new JLabel("0");
  
  public int count = 0;
  
  private GUI() {
    this.prepareCompound();
    
    this.add(subtract);
    this.add(counter);
    this.add(add);
  }
  
  public static void drawGUI() {
    GUI frame = new GUI();
    
    JFrame window = new JFrame("Slowpoke's Swear Jar");
    window.add(frame);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setPreferredSize(new Dimension(350, 100));
    
    window.pack();
    window.setVisible(true);
  }
  
  public void prepareCompound() {
    add.addActionListener((ActionEvent action) -> changeCount(0));
    subtract.addActionListener((ActionEvent action) -> changeCount(1));
  }
  
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
