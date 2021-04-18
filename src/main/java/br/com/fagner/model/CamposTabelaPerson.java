package br.com.fagner.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="camposTabelaPerson")
public class CamposTabelaPerson implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false, length = 90)
    private String FirstName;

    @Column(name = "last_name", nullable = false, length = 90)
    private String LastName;

    @Column(nullable = false, length = 100)
    private String Address;

    @Column(nullable = false, length = 6)
    private String Gender;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
