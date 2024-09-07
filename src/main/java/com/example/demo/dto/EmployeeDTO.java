package com.example.demo.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dob;
    private Boolean isActive;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getActive() {
        return isActive;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", isActive=" + isActive +
                '}';
    }

    public EmployeeDTO(Long id, String name, String email, Integer age, LocalDate dob, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
        this.isActive = isActive;
    }
}
