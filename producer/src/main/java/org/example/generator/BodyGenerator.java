package org.example.generator;

import java.util.Random;

class BodyGenerator {

    private static final String[] greetings = {
            "Привет!",
            "Здравствуй!",
            "Приветствую!",
            "Добрый день!"
    };

    private static final String[] subjects = {
            "Я",
            "Ты",
            "Он",
            "Она",
            "Мы",
            "Вы",
            "Они"
    };

    private static final String[] verbs = {
            "говорю",
            "говоришь",
            "говорит",
            "говорим",
            "говорите",
            "говорят"
    };

    private static final String[] objects = {
        "Java",
                "программирование",
                "модель",
                "сообщение"
    };

    private static final Random random = new Random();

    public static String generate() {
        String greeting = greetings[random.nextInt(greetings.length)];
        String subject = subjects[random.nextInt(subjects.length)];
        String verb = verbs[random.nextInt(verbs.length)];
        String object = objects[random.nextInt(objects.length)];
        return greeting + " " + subject + " " + verb + " о " + object + ".";
    }
}
