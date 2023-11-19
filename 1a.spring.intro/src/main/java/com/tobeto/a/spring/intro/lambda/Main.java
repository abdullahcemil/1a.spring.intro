package com.tobeto.a.spring.intro.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((number) -> {
            System.out.println(number);
        });

        List<String> names = new ArrayList<>();
        names.add("Cemil");
        names.forEach((x) -> {
            System.out.println(x);
        });

        //STREAM API
        //Java 8
        //KOleksiyonlar (list,arrayList
        /*List<Integer> newList = new ArrayList<>();
        for (number:numbers
             )
        {
            newList.add(number*number);
        }*/

        List<Integer> newList2 = new ArrayList<>();
        numbers.forEach((number) -> {
            newList2.add(number * number);
        });
        System.out.println(newList2);

        List<Integer> newList3 = numbers.stream().map((number) -> number * number).toList();
        System.out.println(newList3);

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Halit", "Kalaycı", 25));
        users.add(new User(2, "Engin", "Demirog", 30));
        users.add(new User(3, "İrem", "Balcı", 16));
        List<User> users2 = users
                .stream()
                .filter((user) -> user.getAge() > 18).toList();

        /*User user = users
                .stream()
                .filter((u) -> u.getAge(18))
                .findFirst()
                .orElseThrow();
        System.out.println("Firs bulunan sonuç" + user.getName());*/

        System.out.println("********SORTING************");

        List<User> sortedUsers = users
                .stream()
                .sorted((user1,user2)-> Integer.compare(user1.getAge(),user2.getAge()))
                .toList();
        sortedUsers.forEach((u) -> System.out.println(u.getName()));

        List<User> sortedUsers2 = users
                .stream()
                .sorted(Comparator.comparing(User::getSurname))
                .toList();
        sortedUsers2.forEach((u) -> System.out.println(u.getName()));



    }
}
