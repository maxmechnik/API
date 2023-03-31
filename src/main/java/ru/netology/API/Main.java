package ru.netology.API;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Петр";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.phone = "+7 999 999-99-99";
        post.passport = "9999 999999";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 2;
        post.birthday.month = 12;
        post.birthday.year = 1990;


    }

}