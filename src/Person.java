public class Person {
    private String name;
    private String soname;
    private int age;
    private Gender sex;

    public Person(String name, String soname, int age, Gender sex) {
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

    public Gender getSex() {
        return sex;
    }
}

