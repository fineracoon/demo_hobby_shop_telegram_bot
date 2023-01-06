package com.example.demo.bot;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;


@Component
@ConfigurationProperties(prefix = "telegram.bot")
public class OnlineHobbyShopBot extends TelegramLongPollingBot
{
    private String username;

    private String token;


    @Override
    public String getBotUsername()
    {
        return username;
    }

    @Override
    public String getBotToken()
    {
        return token;
    }

    @Override
    public void onUpdateReceived(Update update)
    {

    }
}
