/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.Services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import sms.Model.Courses;
import sms.controller.CourseDao;

/**
 *
 * @author hirwa
 */
public class CoursesServices extends UnicastRemoteObject implements IcourseServices{
    CourseDao crsdao = new CourseDao();
    
    public CoursesServices() throws RemoteException {
    
    }
    
    public Courses save(Courses cr) throws RemoteException {
        crsdao.save(cr);
        return cr;
    }
    
    public Courses update(Courses cr) throws RemoteException {
        crsdao.update(cr);
        return cr;
    }
    
    public Courses delete(Courses cr) throws RemoteException {
        crsdao.delete(cr);
        return cr;
    }
       
    public List<Courses> crList() throws RemoteException {
        crsdao.crList();
        List<Courses> sl = crList();
        return sl;
    }
    
    public List<Courses> findAll(Courses cr) throws RemoteException {
        crsdao.findAll(cr);
        List<Courses> all = findAll(cr);
        return all;
    }
}
