/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.controller;

import java.util.*;
import org.hibernate.*;

import sms.util.HibernateUtil;
import sms.Model.Student;
import sms.Services.IstudentServices;

/**
 *
 * @author hirwa
 */

public class StudentDao implements IstudentServices{
    Session ss = null;
    Transaction tx = null;
    
    @Override
    public Student save(Student st){
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.save(st);
        tx.commit();
        ss.close();
        return st;
    }
    
    @Override
    public Student update(Student st){
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.update(st);
        tx.commit();
        ss.close();
        return st;
    }
    
    @Override
    public Student delete(Student st){
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.delete(st);
        tx.commit();
        ss.close();
        return st;
    }
    
    @Override
    public Student importExcelSheet(Student st){    
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        ss.saveOrUpdate(st);
        tx.commit();
        ss.close();
        return st;
    }
    
    @Override
    public List<Student> stList(){
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        Query q = ss.createQuery("From Student");
        List<Student> sl = q.list();
        ss.getTransaction().commit();
        return sl;
    }

    /*This method will help us to find and select all students from the database table.*/
    @Override
    public List<Student> findAll (Student st) {
        ss = HibernateUtil.getSessionFactory().openSession();
        tx = ss.beginTransaction();
        List<Student> all = (List<Student>) ss.createCriteria(st.getClass()).list();
        tx.commit();
        ss.close();
        return all;
    }
    
}