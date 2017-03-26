import java.awt.*;
import java.awt.event.*;

public class KeyListenerTester extends Frame implements KeyListener 
{
    TextField t1;
    Label l1;
    
    public KeyListenerTester(String s ){
        super(s);
            Panel p = new Panel();
            l1 = new Label ("Key Listener!");
            p.add(l1);
            addKeyListener (this);
            setSize(200,100);
            setVisible(true);
            addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            });
    }
public void keyTypad (KeyEvent e){
    l1.setText("Key Typed");
}
public void keyPressed ( KeyEvent e){
    l1.setText("Key Pressed");
}
public void keyReleased (KeyEvent e){
    l1.setText("Key Released");
}

public static void main (String[]args){
    new KeyListenerTester ("Key Listener Tester");
}

    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
