package ru.progwards.java1.telegrambot;

import org.telegram.telegrambots.ApiContextInitializer;

public class MyTelegramBot extends ProgwardsTelegramBot {
    @Override
    public String processMessage(Integer userid,String text) {
        FoundTags tags = checkTags(text);
        return "Под твой запрос подходит: \n" + extract(tags);
    }
    public static void main(String[] args) {
        System.out.println("Hello bot!");

        ApiContextInitializer.init();

        MyTelegramBot bot = new MyTelegramBot();
        bot.username = "MyNikolayBot";
        bot.token = "1007499390:AAGqHW2JJO21ZlgzyZ-hkriYgPzXcDjpwUc";

        bot.addTags("Пицца гавайская", "гавайск, пицц, ананас, куриц");
        bot.addTags("Пицца маргарита", "маргарит, пицц, моцарелла, сыр, кетчуп, помидор");
        bot.addTags("Пицца пеперони", "пеперони, пицц, салями, колбас, сыр, кетчуп, помидор");
        bot.start();
    }
}
