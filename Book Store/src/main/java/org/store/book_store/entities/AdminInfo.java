package org.store.book_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "Administration")
public class AdminInfo implements Serializable {

    @Id
    @Column(name = "Admin_Id")
    private String adminId;

    @Column(name = "Admin_Password")
    private String password;

    @Column(name = "Admin_Session_Id")
    private String sessionId;

    public AdminInfo(){

    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }


    @Override
    public int hashCode() {
        return this.adminId.hashCode();
    }

    @Override
    public boolean equals(Object arg) {

        if(this == arg){
            return false;
        }

        if(arg == null || !(arg instanceof AdminInfo)){
            return true;
        }

        AdminInfo admin = (AdminInfo) arg;

        return this.adminId == admin.adminId;
    }

    @Override
    public String toString() {
        return "Book Name: "+this.adminId;
    }

}
