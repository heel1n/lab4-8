package com.taxi.commands;

public interface Command {
    void execute();
    String getDescription(); // Метод для отримання опису команди
}
