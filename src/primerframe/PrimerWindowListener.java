
package primerframe;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class PrimerWindowListener extends WindowAdapter{
    
  public void windowClosing (WindowEvent e)
  {
  System.exit(0);
  }  
}
