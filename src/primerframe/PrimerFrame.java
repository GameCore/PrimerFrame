
package primerframe;

import javax.swing.JFrame;
import java.awt.event.*;

public class PrimerFrame extends JFrame{
    public PrimerFrame(){
setTitle("Mi primer programa grafico");
setSize(400,100);
addWindowListener (new PrimerWindowListener());
    }
}
