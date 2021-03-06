package organisation;
// Generated Feb 27, 2022 11:13:58 PM by Hibernate Tools 4.3.1

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;





/**
 * Employee generated by hbm2java
 */

@Entity(name="Emp_table")

public class Employee  implements java.io.Serializable {

    @Id
     private int EId;
    @ManyToOne(cascade=CascadeType.ALL)
    private Depart depart;
     private String FName;
     private String LName;
     private Integer age;
     private Integer saalry;
     private String city;
     private int d_id;
    public Employee() {
    }

	
    public Employee(int EId) {
        this.EId = EId;
    }
    public Employee(int EId, Depart depart, String FName, String LName, Integer age, Integer saalry, String city,int did) {
       this.EId = EId;
       this.depart = depart;
       this.FName = FName;
       this.LName = LName;
       this.age = age;
       this.saalry = saalry;
       this.city = city;
       this.d_id=did;
    }
   
    public int getEId() {
        return this.EId;
    }
    
    public void setEId(int EId) {
        this.EId = EId;
    }
    public Depart getDepart() {
        return this.depart;
    }
    
    public void setDepart(Depart depart) {
        this.depart = depart;
    }
    public String getFName() {
        return this.FName;
    }
    
    public void setFName(String FName) {
        this.FName = FName;
    }
    public String getLName() {
        return this.LName;
    }
    
    public void setLName(String LName) {
        this.LName = LName;
    }
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getSaalry() {
        return this.saalry;
    }
    
    public void setSaalry(Integer saalry) {
        this.saalry = saalry;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public int getDId(){
        return d_id;
    }
    public void setDId( int did){
        this.d_id=did;
    }
    public String toString(){
         return "Employee(e_id:"+EId+",F_Name:"+FName+",L_name:"+LName+",age:"+age+",salary:"+saalry+",City:"+city+",d-id:)";
    }



}


