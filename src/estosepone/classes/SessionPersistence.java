/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estosepone.classes;
import estosepone.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Prince
 */
public class SessionPersistence {
    private static Session session;
    
    SessionPersistence(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public static Session getSession() {
        return session;
    }
    
}
