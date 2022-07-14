package org.example.LexiconAssignments.ToDoIT;

import java.util.Objects;

public class Person {

    //Fields:
    //• id (private) is an int representing each Person object.
    //• firstName (private) represents each person’s first name. Not allowed to be null
    //• lastName (private) represents each person’s last name. Not allowed to be null
    //• email (private) represents each person’s email. Not allowed to be null

    private  int id;
    private String firstName;
    private String  lastName;
    private String email;
    private AppUser cridentials;

    public Person(){

    }
    public Person(int id){
    this.id = id;
    }

    public Person(int id, String firstName, String lastName, String email, AppUser cridentials) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cridentials = cridentials;
    }

    public AppUser getCridentials() {
        return cridentials;
    }

    public void setCridentials(AppUser cridentials) {
        this.cridentials = cridentials;
    }


    //get methods
    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public  String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

//    public String getSummary(){
//        String summary = "Summary: " + "id:" + Integer.toString(getId())+ "   Name:" + firstName + " " + lastName + "   and" + "   email:" + email;
//        return summary;
//    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }

    //set methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }



}
