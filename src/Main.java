import java.util.List;

public class Main {
    public static void main(String[] args){

        PeopleGenerator generator = new PeopleGenerator();

        List<Person> persons = generator.generatePerson();

        int countPersons = persons.size();

        int mens = (int) persons.stream()
                .filter(peron -> peron.getSex() == Gender.MALE)
                .count();

        int girls = (int) persons.stream()
                .filter(peron -> peron.getSex() == Gender.FEMALE)
                .filter(person -> person.getAge() < 18)
                .count();

        int pensioners = (int) persons.stream()
                .filter(p ->
                        (p.getSex() == Gender.MALE && p.getAge() > 65) ||
                                (p.getSex() == Gender.FEMALE && p.getAge() > 60))
                .count();

        System.out.printf("Общее количество людей: %d\n", countPersons);
        System.out.printf("Общее количество мужчин: %d\n", mens);
        System.out.printf("Общее количество девочек: %d\n", girls);
        System.out.printf("Общее количество пенсионеров: %d\n", pensioners);
    }
}
