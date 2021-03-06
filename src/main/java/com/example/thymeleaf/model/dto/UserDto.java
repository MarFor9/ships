package com.example.thymeleaf.model.dto;

import com.example.thymeleaf.model.providers.Provider;
import com.example.thymeleaf.model.roles.Role;

import java.util.HashSet;
import java.util.Set;

public class UserDto {

    private long userid;
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
    private Set<Role> roles = new HashSet<>();
    private boolean enabled;
    private Provider provider;


    public UserDto() {
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getEmailId() {
        return emailId;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
