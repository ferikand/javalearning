package ua.javarush.task.pro.task08.task0805;

import java.lang.reflect.Field;
import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Безперечно";
    private static final String DEFINITELY = "Безумовно, так";
    private static final String MOST_LIKELY = "Найймовірніше";
    private static final String OUTLOOK_GOOD = "Хороші перспективи";
    private static final String ASK_AGAIN_LATER = "Запитай пізніше";
    private static final String TRY_AGAIN = "Спробуй ще";
    private static final String NO = "Моя відповідь — ні";
    private static final String VERY_DOUBTFUL = "Вельми сумнівно";

    public static String getPrediction() {
        //напишіть тут ваш код
        Random r = new Random();
        int predict = r.nextInt(8);

        return switch (predict) {
            case 0 -> MagicBall.CERTAIN;
            case 1 -> MagicBall.DEFINITELY;
            case 2 -> MagicBall.MOST_LIKELY;
            case 3 -> MagicBall.OUTLOOK_GOOD;
            case 4 -> MagicBall.ASK_AGAIN_LATER;
            case 5 -> MagicBall.TRY_AGAIN;
            case 6 -> MagicBall.NO;
            case 7 -> MagicBall.VERY_DOUBTFUL;
            default -> null;
        };
    }
}
