package com.restapi2.restapi2.Dynamicfiltering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.minidev.json.annotate.JsonIgnore;

//@JsonIgnoreProperties("password")
@JsonFilter("somefilter")
public class UserForFilterr {
    private String firtName;
    private String lastName;
   @JsonIgnore
    private String password;

    public UserForFilterr(String firtName, String lastName, String password) {
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
