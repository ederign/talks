import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Sample {


    public static void main( String[] args ) {

        try {
            File file = new File( "/Users/ederign/javaone/surprise.gif" );
            ImageIcon icon = new ImageIcon( file.toURI().toURL() );
            JLabel label = new JLabel( icon );
            JOptionPane.showMessageDialog( null, label );
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}
