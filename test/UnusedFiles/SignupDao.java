/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnusedFiles;

import sms.util.HibernateUtil;
import org.hibernate.*;

/**
 *
 * @author hirwa
 */
public class SignupDao {
    
    public Signup save(Signup si){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = ss.beginTransaction();
        ss.save(si);
        tx.commit();
        ss.close();
        return si;
    }
}
