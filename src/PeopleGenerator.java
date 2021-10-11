import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PeopleGenerator {
    Random random = new Random();
    private final int minAge = 3;
    private final int maxAge = 90;
    public List<Person> generatePerson(){
        List<Person> person = new ArrayList<>();

        String[] maleName = new String[]{"Арсен","Бронислав","Вадим","Валентин","Герман","Глеб","Гордей","Давид",
                "Даниил","Демьян","Джек","Дмитрий","Евгений","Иннокентий","Иосиф"};

        String[] femaleNames = new String[]{"Алла","Алсу","Елизавета","Есения","Жаклин","Зинаида",
                "Злата","Зоряна","Клавдия","Клара","Клариса","Марианна","Марина","Мария","Марта"};

        String[] maleSurnames = new String[]{"Иванов", "Смирнов", "Кузнецов", "Попов", "Васильев", "Петров", "Соколов",
                "Михайлов", "Новиков", "Морозов", "Волков", "Алексеев", "Лебедев", "Сем", "Егоров"};

        for(String name: maleName){
            for(String surname: maleSurnames){
                person.add(new Person(name,surname, generateAge(),Person.gender.male));
            }
        }

        for(String name: maleName){
            for(String surname: maleSurnames){
                person.add(new Person(name,generateFemaleSurname(surname), generateAge(),Person.gender.female));
            }
        }
        return person;
    }
    private int generateAge(){
        return random.nextInt(maxAge) + minAge;
    }
    private String generateFemaleSurname(String surname) {
        char[] sN = surname.toCharArray();
        String ending = "" + sN[sN.length-2] + sN[sN.length-1];
        String partOfTheSurname = surname.substring(0,sN.length - 3);
        switch(ending){
            case("ий"):
            case("ый"):
            case("ой"): surname = partOfTheSurname + "ая"; break;
            default:
                surname = surname + "a";

        }
        return surname;
    }
}
