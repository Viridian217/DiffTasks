package Serializable;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.logging.Logger;

public class PersonSerialization implements Serializable {
    String firstName;
    String lastName;
    transient String fullName;
    final transient String greeting = "Hello, ";
    String country;
    Sex sex;
    transient PrintStream outputStream = System.out;
    transient Logger logger;

    PersonSerialization(String firstName, String lastName, String country, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = String.format("%s, %s", lastName, firstName);
        this.country = country;
        this.sex = sex;
        this.logger = Logger.getLogger(String.valueOf(PersonSerialization.class));
    }

enum Sex {
    MALE,
    FEMALE
}

    public static void main(String[] args) {

    }
}
