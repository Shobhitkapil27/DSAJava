package Practice;

import jakarta.persistence.*;

@Entity
public class Student {
    private String name;
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentid")
    private int StudentId;

    private String city;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(String name, int age, String city) {
        this.name = name;
        this.age=age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", StudentId=" + StudentId +
                ", city='" + city + '\'' +
                '}';
    }

    public Student() {}
}
