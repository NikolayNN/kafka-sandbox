package org.example.generator;

import java.util.Random;

class TitleGenerator {

    private static final String[] prefixes = {
            "Важное",
            "Новости",
            "Обновление",
            "Внимание"
    };

    private static final String[] subjects = {
            "Java",
            "программирование",
            "модель",
            "сообщение"
    };

    private static final Random random = new Random();


    public static String generate() {
        String prefix = prefixes[random.nextInt(prefixes.length)];
        String subject = subjects[random.nextInt(subjects.length)];
        return prefix + " " + subject;
    }
}
