package ru.progwards.java1.lessons.compare_if_cycles;

import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.telegrambot.ProgwardsTelegramBot;

public class Examplebot extends ProgwardsTelegramBot {
    public static void main(String[] args) {
        System.out.println("Hello bot!");

        ApiContextInitializer.init();

        Examplebot bot = new Examplebot();
        bot.username = "имя бота";
        bot.token = "токен";
        bot.start();
    }
}
