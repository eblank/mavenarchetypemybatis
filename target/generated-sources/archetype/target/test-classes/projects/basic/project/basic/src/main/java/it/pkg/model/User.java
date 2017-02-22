package it.pkg.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Date;

/**
 * Created by luxp on 2017/2/20.
 */
public class User {
    private String name;
    private String nameEN;
    private int age;
    private Date borthday;
    private String favoriteFood;

    public User(String name, String name_EN, int age, String favoriteFood) {
        this.name = name;
        this.nameEN = name_EN;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    public User(String name, String nameEN, int age, Date borthday, String favoriteFood) {
        this.name = name;
        this.nameEN = nameEN;
        this.age = age;
        this.borthday = borthday;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBorthday() {
        return borthday;
    }

    public void setBorthday(Date borthday) {
        this.borthday = borthday;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
