import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<>();
        PeopleGenerator generator = new PeopleGenerator();
        for(int i = 0; i < 450; i++){
            persons.add(generator.generatePerson());
        }
        int countPersons = persons.size();

        int mens = (int) persons.stream()
                .filter(peron -> peron.getSex() == Person.gender.male)
                .count();

        int girls = (int) persons.stream()
                .filter(peron -> peron.getSex() == Person.gender.female)
                .filter(person -> person.getAge() < 18)
                .count();

        int pensioners = (int) persons.stream()
                .filter(p ->
                        (p.getSex() == Person.gender.male && p.getAge() > 65) ||
                                (p.getSex() == Person.gender.female && p.getAge() > 60))
                .count();

        System.out.printf("Общее количество людей: %d\n", countPersons);
        System.out.printf("Общее количество мужчин: %d\n", mens);
        System.out.printf("Общее количество девочек: %d\n", girls);
        System.out.printf("Общее количество пенсионеров: %d\n", pensioners);
    }
}