package com.company;

public class Person {
    private String name;
    private int age;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person's " +
                "name is " + name + '\n' +
                "Age is " + age + '\n' +
                "Password is " + password + '\'';
    }
}
