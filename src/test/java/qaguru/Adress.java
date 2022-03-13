package qaguru;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;

public class Adress {
    private String city;
    private String conutry;

    public Adress(@JsonProperty("city") String city, @JsonProperty("conutry") String conutry) {
        this.city = city;
        this.conutry = conutry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getConutry() {
        return conutry;
    }

    public void setConutry(String conutry) {
        this.conutry = conutry;
    }
}
