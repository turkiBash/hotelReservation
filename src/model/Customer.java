package model;

import java.util.Objects;
import java.util.regex.Pattern;

public class Customer {

    private String firstName;
    private String lastName;
    final String email;

    private String emailRegex = "^(.+)@(.+).(.+)$";
    private Pattern pattern = Pattern.compile(emailRegex);

    public Customer(String firstName, String lastName, String email){
        if (!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Please enter a valid email");
        }
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
    }

    public String getFirstName(){

        return this.firstName;
    }
    public String getLastName(){

        return this.lastName;
    }
    public String getEmail(){

        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }

    @Override
    public String toString() {

        return "Firstname: " + firstName + " Lastname: " + lastName + " Email: " + email;
    }

}

