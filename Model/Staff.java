/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.Model;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author hirwa
 */
@Entity
public class Staff {
    private String name;
    @Id
    private String id;
    private String position;
    
    public Staff() {
    }

    public Staff(String name, String id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String post) {
        this.position = position;
    }
}
