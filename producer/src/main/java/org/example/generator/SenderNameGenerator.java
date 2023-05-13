package org.example.generator;

import java.util.Random;

class SenderNameGenerator {
    private static final String[] firstNames = {
            "Иван",
            "Александр",
            "Мария",
            "Екатерина",
            "Анна",
            "Максим",
            "Дмитрий"
    };

    private static final Random random = new Random();

    public static String generate() {
        return firstNames[random.nextInt(firstNames.length)];
    }
}
