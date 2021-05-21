package entity;

import annotation.Column;
import annotation.Entity;
import annotation.Id;

import javax.servlet.http.HttpServlet;
import java.util.Date;

@Entity(tableName = "Employees")
public class Employee extends HttpServlet {
    @Id
    @Column(columnName = "Id", columnType = "varchar(200)")
    private String id;
    @Column(columnName = "fullName", columnType = "varchar(200)")
    private String fullName;
    @Column(columnName = "birthday", columnType = "varchar(200)")
    private String birthday;
    @Column(columnName = "address", columnType = "varchar(200)")
    private String address;
    @Column(columnName = "position", columnType = "int")
    private String position;
    @Column(columnName = "department", columnType = "varchar(200)")
    private String department;
    private Date createdAt;


    public Employee() {
    }

    public Employee(String id, String fullName, String birthday, String address, String position, String department) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.address = address;
        this.position = position;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPorsition() {
        return position;
    }

    public void setPorsition(String porsition) {
        this.position = porsition;
    }

    public String getDeparment() {
        return department;
    }

    public void setDeparment(String deparment) {
        this.department = deparment;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
