/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estosepone.classes;

import estosepone.UI.principal;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.net.UnknownHostException;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Prince
 */
public class PrincipalClass {

    private static SplashScreen splash;
    public static SessionPersistence session;
    public static principal Pantalla;

    final static String[] texto = {"Persistencia","ventana","splash"};
    
    
    public static void animar() {
        if (splash != null) {
            Graphics2D g = splash.createGraphics();
            corrertodo(g,1);
            session = new SessionPersistence();
            corrertodo(g,2);
            Pantalla=new principal();
            corrertodo(g,3);
            splash.close();
            
        }

    }

    public static void corrertodo(Graphics2D g,int i) {
        g.setColor(new Color(225, 112, 36));//color de barra de progeso
        g.fillRect(0, 261, (i * 450 / texto.length), 16);//la barra de progreso>
        //se pinta una linea segmentada encima de la barra verde
        float dash1[] = {2.0f};
        BasicStroke dashed = new BasicStroke(16.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 5.0f, dash1, 0.0f);
        g.setStroke(dashed);
        g.setColor(Color.WHITE);//color de barra de progeso
        g.setColor(new Color(132, 194, 35));
        g.drawLine(0, 269, 450, 269);
        //se pinta texto del array
        g.setColor(Color.BLACK);//color de texto 
        g.drawString("Cargando ...", 150, 274);
        splash.update();
        g.setColor(new Color(132, 194, 35));//color de fondo
        g.fillRect(0, 264, 450, 18);//para tapar texto anterior

    }

    public static void main(String[] args) throws UnknownHostException, SQLException {
        // TODO code application logic here
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        //obtiene el splash screen
        splash = SplashScreen.getSplashScreen();
        animar();
        Pantalla.setVisible(true);
        
    }
}
