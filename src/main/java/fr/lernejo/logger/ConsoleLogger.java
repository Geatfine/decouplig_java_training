package fr.lernejo.logger;

import java.sql.SQLOutput;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
