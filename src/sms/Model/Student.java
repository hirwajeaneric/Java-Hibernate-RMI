/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.Model;

import javax.persistence.*;

/**
 *
 * @author hirwa
 */
@Entity
public class Student {
    private String firstName;
    private String lastName;
    @Id
    private String regNumber;
    private String emailAddress;
    private String photo;
    private String faculty;
    private String phonenumber;
    private String semester;
    private String course;
    
    public Student() {
    }

    public Student(String firstName, String lastName, String regNumber, String emailAddress, String photo, String faculty, String phonenumber, String semester, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regNumber = regNumber;
        this.emailAddress = emailAddress;
        this.photo = photo;
        this.faculty = faculty;
        this.phonenumber = phonenumber;
        this.semester = semester;
        this.course = course;
    }

     

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    

    

    

    

    
    
}
