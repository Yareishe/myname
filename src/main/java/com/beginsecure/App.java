package com.beginsecure;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        String name = "Maxim";
        String lastName = "Yefimenko";

        NameData nameData = new NameData(name, lastName);
        Gson gson = new Gson();
        String json = gson.toJson(nameData);
        System.out.println(json);
    }

    static class NameData {
        private final String name;
        private final String lastName;

        public NameData(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }
    }
}