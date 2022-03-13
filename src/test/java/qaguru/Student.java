package qaguru;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;

public class Student {
    private String firstName;
    private String lastName;
    private Adress address;
    private String[] favoriteFood;

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

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public String[] getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String[] favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Student(@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName, @JsonProperty("address") Adress address, @JsonProperty("favoriteFood") String[] favoriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.favoriteFood = favoriteFood;
    }
}
