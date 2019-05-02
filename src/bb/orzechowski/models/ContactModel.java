package bb.orzechowski.models;

import java.util.Objects;

public class ContactModel {
    private String name;
    private String surname;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean validateAndSetNumber(String number){
        if(number.length() !=9){
            return  false;
        }
        setNumber(number);
        return true;
    }

    public ContactModel(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    @Override
    public String toString() {
        return "ContactModel{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactModel)) return false;
        ContactModel that = (ContactModel) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getSurname(), that.getSurname()) &&
                Objects.equals(getNumber(), that.getNumber());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getNumber());
    }
}
