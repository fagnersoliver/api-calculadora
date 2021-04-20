package br.com.fagner.data.vo;

import java.io.Serializable;
import java.util.Objects;

public class CamposTabelaPersonVO implements Serializable {

    private long id;

    private String FirstName;

    private String LastName;

    private String Address;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CamposTabelaPersonVO that = (CamposTabelaPersonVO) o;
        return id == that.id && Objects.equals(FirstName, that.FirstName) && Objects.equals(LastName, that.LastName) && Objects.equals(Address, that.Address) && Objects.equals(Gender, that.Gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, FirstName, LastName, Address, Gender);
    }
}
