public class Person {
    private String name;
    private String soname;
    private int age;
    private gender sex;

    public Person(String name, String soname, int age, gender sex) {
        this.name = name;
        this.soname = soname;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSoname() {
        return soname;
    }

    public int getAge() {
        return age;
    }

    public gender getSex() {
        return sex;
    }

    enum gender{
        male,
        female
    }
}

