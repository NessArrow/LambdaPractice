import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class T_1 {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Mary", 35, JOB.ENGINEER, true),
                new Person("Alex", 12, JOB.DOCTOR, false),
                new Person("John", 80, JOB.FIREFIGHTER, false),
                new Person("Harry", 32, JOB.MECHANIC, true),
                new Person("Bobvjisdfjvs", 20, JOB.MECHANIC, false),
                new Person("Anna", 10, JOB.POSTMAN, false),
                new Person("Alice", 29, JOB.MECHANIC, true)
        );

        personList.sort(Comparator.comparing(Person::getName));
//        personList.forEach(System.out::println);
// -----------------------------------------------------------------------------------------
        // с помощью двух консумеров имена переводятся в верхний регистр и затем лист печатается
//        Consumer <List<Person>> nameToUpperCase = t -> {
//            String tmp;
//            for (int i = 0; i < t.size(); i++) {
//                tmp = t.get(i).getName().toUpperCase();
//                t.get(i).setName(tmp);
//            }
//        };
//        Consumer<List<Person>> printList = t -> t.forEach(System.out::println);
//        nameToUpperCase.andThen(printList).accept(personList);
// -----------------------------------------------------------------------------------------
        // с помощью двух предикатов лист фильтруется по первой букве имени и через стрим выводится
//        Predicate<Person> nameStartsWithA = person -> person.getName().startsWith("A");
//        Predicate<Person> nameStartsWithB = person -> person.getName().startsWith("B");
//        personList.stream().filter(nameStartsWithA.or(nameStartsWithB)).forEach(System.out::println);
// -----------------------------------------------------------------------------------------
//        personList.stream().filter(person -> person.getName().charAt(0) == "A").forEach(System.out::println);
// -----------------------------------------------------------------------------------------
        // использование функции для String.map, которая получает имена людей и затем через стрим создается новый лист имен
//        List <String> names;
//        Function<Person, String> nameMapping = Person::getName;
//        names = personList.stream().map(nameMapping).collect(Collectors.toList());
//        names.forEach(System.out::println);


    }
}
