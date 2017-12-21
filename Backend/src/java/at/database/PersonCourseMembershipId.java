package at.database;
// Generated 21.12.2017 18:52:49 by Hibernate Tools 4.3.1



/**
 * PersonCourseMembershipId generated by hbm2java
 */
public class PersonCourseMembershipId  implements java.io.Serializable {


     private int personFk;
     private int courseFk;

    public PersonCourseMembershipId() {
    }

    public PersonCourseMembershipId(int personFk, int courseFk) {
       this.personFk = personFk;
       this.courseFk = courseFk;
    }
   
    public int getPersonFk() {
        return this.personFk;
    }
    
    public void setPersonFk(int personFk) {
        this.personFk = personFk;
    }
    public int getCourseFk() {
        return this.courseFk;
    }
    
    public void setCourseFk(int courseFk) {
        this.courseFk = courseFk;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PersonCourseMembershipId) ) return false;
		 PersonCourseMembershipId castOther = ( PersonCourseMembershipId ) other; 
         
		 return (this.getPersonFk()==castOther.getPersonFk())
 && (this.getCourseFk()==castOther.getCourseFk());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPersonFk();
         result = 37 * result + this.getCourseFk();
         return result;
   }   


}


