package javaapp;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import java.io.IOException;


public class main {
    @Command
    public String hello() {
        return "Hello Rock!";
    }

    @Command
    public String hello(String name) {
        return "Hello,  " + name + "!";
    }

    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("Hello", "This is phone book", new PhoneBook())
                .commandLoop();

    }
}
