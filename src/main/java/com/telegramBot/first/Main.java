package com.telegramBot.first;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;


public class Main {
    public static void main(String[] args) {

        ApiContextInitializer.init();

        TelegramBot telegramBot = new TelegramBot();

        TelegramBotsApi botsApi = new TelegramBotsApi();

        try {
            botsApi.registerBot(telegramBot);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
