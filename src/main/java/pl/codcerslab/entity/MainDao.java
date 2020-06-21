package pl.codcerslab.entity;

import java.util.Scanner;

public class MainDao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // dodawanie użytkownika do bazy
        User user = new User();
//        String name;
//        System.out.println("Podaj nazwę użytkownika");
//        name = sc.next();
//        user.setUserName(name);
//        String email;
//        System.out.println("Podaj adres email");
//        email = sc.next();
//        user.setEmail(email);
//        String pass;
//        System.out.println("Podaj hasło");
//        pass = sc.next();
//        user.setPassword(pass);
        UserDao userDao = new UserDao();
//        userDao.create(user);

        // wczytywanie danych użytkownika z bazy
//        UserDao userDao = new UserDao();
        System.out.println("Podaj ID użytkownika");
        int idRead = sc.nextInt();
        User read = userDao.read(idRead);
        System.out.println(read);

        // usuwanie użytkownika z bazy
//        UserDao userDao = new UserDao();
        System.out.println("Podaj ID użytkownika do usunięcia");
        int idDel = sc.nextInt();
        userDao.delete(idDel);

        // wczytanie wszystkich użytkowników
        User[] allusers = userDao.readAll();
        for (User all : allusers) {
            System.out.println(all);
        }

        // zmiana danych użytkownika
//        UserDao userDao = new UserDao();
//        System.out.println("Podaj ID użytkownika, któremu chcesz zmienić dane:");
//        int idRead = sc.nextInt();
//        User userToChange = userDao.read(idRead);
//        System.out.println("Podaj nową nazwę użytkowanika:");
//        String newName = sc.next();
//        userToChange.setUserName(newName);
//        System.out.println("Podaj nowy adres email:");
//        String newEmail = sc.next();
//        userToChange.setEmail(newEmail);
//        System.out.println("Podaj nowe hasło:");
//        String newPass = sc.next();
//        userToChange.setPassword(newPass);
//        userDao.update(userToChange);
    }
}
