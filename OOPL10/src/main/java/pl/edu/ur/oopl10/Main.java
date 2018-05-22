package pl.edu.ur.oopl10;

import java.io.IOException;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) throws IOException {
        WprowadzZKonsoli wprowadz = new WprowadzZKonsoli();
//     wprowadz.wprowadzInt();
//        wprowadz.wprwoadzString();
//        zad4.zad4();
        
        wprowadz.ToFileText();
        wprowadz.FromFileText();
    }
    
}
