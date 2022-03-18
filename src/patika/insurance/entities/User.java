package patika.insurance.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class User {

    private static Integer id = 0;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private Integer age;
    private ArrayList<IAddress> IAddresses;
    private LocalDate lastEntry;

    public User(String name,
                String surname,
                String email,
                String password,
                String job,
                Integer age,
                ArrayList<IAddress> IAddresses,
                LocalDate lastEntry) {
        this.id = Integer.valueOf(id++);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.IAddresses = IAddresses;
        this.lastEntry = lastEntry;
    }

    public User(String name,
                String surname,
                String email,
                String password,
                String job,
                Integer age,
                LocalDate lastEntry) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.lastEntry = lastEntry;
        this.IAddresses = new ArrayList<>();
    }

    public static void addAddress(User user, IAddress address) {
        user.getIAddresses().add(address);
    }

    public static void removeAddress(User user, IAddress address) {
        user.getIAddresses().remove(address);
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ArrayList<IAddress> getIAddresses() {
        return IAddresses;
    }

    public void setIAddresses(ArrayList<IAddress> IAddresses) {
        this.IAddresses = IAddresses;
    }

    public LocalDate getLastEntry() {
        return lastEntry;
    }

    public void setLastEntry(LocalDate lastEntry) {
        this.lastEntry = lastEntry;
    }

    public void printAddresses() {
        for (IAddress address : IAddresses) {
            address.getFullAddress();
        }
    }

    @Override
    public int hashCode() {
        return id;
    }
}
