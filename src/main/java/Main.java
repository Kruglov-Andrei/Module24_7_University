/*В этом уроке необходимо выполнить следующее:
Создать новый проект в IntelliJ IDEA. При создании выбрать вариант через Maven,
без использования архетипов.
Подключить зависимости для Apache Commons Lang, Apache Commons Collections,
Apache POI OOXML, использовать последние версии пакетов. Найти необходимую информацию по подключению можно на сайте.
Создать классы университета и студента (например, University и Student).
Далее будем называть их модельными классами.
Создать enum StudyProfile с перечислением возможных специальностей
(необязательно перечислять все существующие, хотя бы несколько для примера).
Это должен быть enum с параметром. Назовём этот параметр String profileName,
будем записывать в нём русскоязычные расшифровки направлений обучения.
Например, профиль MEDICINE с параметром "Медицина".
Добавить в модельные классы набор полей на своё усмотрение, но обязательными
являются: для University — String id, String fullName, String shortName,
int yearOfFoundation, StudyProfile mainProfile;
для Student — String fullName, String universityId, int currentCourseNumber,
float avgExamScore.
Для написанных классов реализовать геттеры, сеттеры, конструкторы
(как минимум, конструкторы по умолчанию), а также переопределить метод toString,
чтобы он выводил текстовую информацию о значении всех полей класса.
При написании сеттеров рекомендуется воспользоваться шаблоном Builder.
Можно посмотреть пример генерации сеттера по такому шаблону, встроенному в IntelliJ IDEA.
Создать класс с методом main для запуска приложения. В методе main создать
экземпляры созданных модельных классов, наполнить их какими-нибудь
тестовыми данными и вывести в консоль их значения. Вывод должен работать без
дополнительных вызовов геттеров и так далее, простой передачей экземпляра на вход System.out.println(). */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        University MSU = new University("001", "Moscow State University", "MSU", 1900, StudyProfile.ECONOMICS);
        Student Ivanov = new Student("Ivanov Ivan Ivanovich", "005", 5, 4.25F);

        System.out.println(Arrays.toString(StudyProfile.values()));
        System.out.println(MSU.toString());
        System.out.println(Ivanov.toString());

    }
}
