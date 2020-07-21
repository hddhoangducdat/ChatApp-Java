package my.groupId;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import my.GUI.HomeGUI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException
    {
    	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new HomeGUI().run();
    }
}
