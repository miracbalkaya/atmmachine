package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        OptionMenu optionMenu = new OptionMenu();
        introduction();
        optionMenu.mainMenu();
    }

    public static void introduction(){
        System.out.println("Welcome to the ATM Project!");
    }
}
