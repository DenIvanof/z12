import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.MovieManager;

import java.util.Arrays;

public class MovieManagerTest {

    @Test
    public void allMovie(){
        MovieManager manager = new MovieManager();
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель 'Белград'");
        manager.add("Джентльмены");
        manager.add("Человек-нивидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");

        String[] expected = {"Бладшот","Вперед","Отель 'Белград'","Джентльмены","Человек-нивидимка","Тролли.Мировой тур","Номер один"};
        String[] actual = manager.findAll();
        System.out.println("Тест №1 - вывод всех добавленных фильмов");
        System.out.println("Ожидаемый результат");
        System.out.println(Arrays.toString(expected));
        System.out.println("Фактический результат");
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void movieEqualsLimit(){
        MovieManager manager = new MovieManager(7);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель 'Белград'");
        manager.add("Джентльмены");
        manager.add("Человек-нивидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");

        String[] expected = {"Номер один","Тролли.Мировой тур","Человек-нивидимка","Джентльмены","Отель 'Белград'","Вперед","Бладшот"};
        String[] actual = manager.findLast();
        System.out.println("Тест №2 - Лимит равен списку фильмов");
        System.out.println("Ожидаемый результат");
        System.out.println(Arrays.toString(expected));
        System.out.println("Фактический результат");
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void limitNotSpecified(){
        MovieManager manager = new MovieManager();
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель 'Белград'");
        manager.add("Джентльмены");
        manager.add("Человек-нивидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");

        String[] expected = {"Номер один","Тролли.Мировой тур","Человек-нивидимка","Джентльмены","Отель 'Белград'"};
        String[] actual = manager.findLast();
        System.out.println("Тест №3 - лимит не задан");
        System.out.println("Ожидаемый результат");
        System.out.println(Arrays.toString(expected));
        System.out.println("Фактический результат");
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void smallLimit(){
        MovieManager manager = new MovieManager(3);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель 'Белград'");
        manager.add("Джентльмены");
        manager.add("Человек-нивидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");

        String[] expected = {"Номер один","Тролли.Мировой тур","Человек-нивидимка"};
        String[] actual = manager.findLast();
        System.out.println("Тест №4 - лимит меньше списка фильмов");
        System.out.println("Ожидаемый результат");
        System.out.println(Arrays.toString(expected));
        System.out.println("Фактический результат");
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected,actual);

    }


}
