package homework1;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Human firstHuman = new Human();
        firstHuman.setAge(119);
        System.out.println(firstHuman.getAge());

//        firstHuman.setAge(0);  // проверка 1
//        firstHuman.setAge(123);  // проверка 2

        Field field = firstHuman.getClass().getDeclaredField("age");
        field.setAccessible(true);
        field.setInt(firstHuman, 123);
        System.out.println(field.get(firstHuman));

        int printAlmostWithoutGetter = field.getInt(firstHuman);
        System.out.println(printAlmostWithoutGetter);  // #6 такой себе вывод "без геттера"
    }
}
