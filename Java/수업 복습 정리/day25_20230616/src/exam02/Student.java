package exam02;

public class Student {
    private int ban; // 반
    private String name; //학생명
    private char gender; //F, M

    public Student(int ban, String name, char gender) {
        this.ban = ban;
        this.name = name;
        this.gender = gender;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ban=" + ban +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
