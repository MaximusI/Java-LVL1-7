package Main;
/*
1. Расширить задачу про котов и тарелки с едой
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
удалось покушать (хватило еды), сытость = true
4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть
наполовину сыт (это сделано для упрощения логики программы)
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
потом вывести информацию о сытости котов в консоль
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 */

import java.util.ArrayList;

public class Main {

    public static void main(String... args) {
        Plate plate = new Plate(100);
        plate.info();
        ArrayList<Cat> cats = new ArrayList<Cat>();
        for (int i = 0; i < 10; i++) {
            if (i == 8)
                plate.addFood(1000);
            //Hangry cat
            if (i == 4)
                cats.add(new Cat("Barsik".concat(String.valueOf(i + 1)), 1000));
            else
                cats.add(new Cat("Barsik".concat(String.valueOf(i + 1)), i * 3));
            cats.get(i).eat(plate);
            System.out.println(cats.get(i).getName() + " is satienty - " +cats.get(i).isSatiety() + " ");
            plate.info();
        }
    }
}
