package com.restapi2.restapi2.Staticfiltering;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.minidev.json.annotate.JsonIgnore;

@JsonIgnoreProperties("password")
public class UserForFilter {
    private String firtName;
    private String lastName;
   @JsonIgnore
    private String password;

    public UserForFilter(String firtName, String lastName, String password) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getFirtName() {
        return firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserForFilter{" +
                "firtName='" + firtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
