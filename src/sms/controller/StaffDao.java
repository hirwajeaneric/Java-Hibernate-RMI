/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.controller;

import sms.util.HibernateUtil;
import sms.Model.Staff;
import org.hibernate.*;
/**
 *
 * @author hirwa
 */
public class StaffDao{
    
    public Staff save(Staff sta){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = ss.beginTransaction();
        ss.save(sta);
        tx.commit();
        ss.close();
        return sta;
    }
    
    public Staff update(Staff sta){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = ss.beginTransaction();
        ss.update(sta);
        tx.commit();
        ss.close();
        return sta;
    }
    
    public Staff delete(Staff sta){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = ss.beginTransaction();
        ss.delete(sta);
        tx.commit();
        ss.close();
        return sta;
    }
}
