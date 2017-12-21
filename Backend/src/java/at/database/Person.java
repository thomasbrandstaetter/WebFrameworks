package at.database;
// Generated 18.12.2017 13:26:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private Integer personPk;
     private String username;
     private String password;
     private String name;
     private String lastname;
     private String role;
     private Set personCourseMemberships = new HashSet();

    public Person() {
    }

	
    public Person(String username, String password, String name, String lastname, String role) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.role = role;
    }
    public Person(String username, String password, String name, String lastname, String role, Set personCourseMemberships) {
       this.username = username;
       this.password = password;
       this.name = name;
       this.lastname = lastname;
       this.role = role;
       this.personCourseMemberships = personCourseMemberships;
    }
   
    public Integer getPersonPk() {
        return this.personPk;
    }
    
    public void setPersonPk(Integer personPk) {
        this.personPk = personPk;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    public Set getPersonCourseMemberships() {
        return this.personCourseMemberships;
    }
    
    public void setPersonCourseMemberships(Set personCourseMemberships) {
        this.personCourseMemberships = personCourseMemberships;
    }




}


