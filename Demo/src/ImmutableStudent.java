/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 23/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
final public class ImmutableStudent {

    private final int id;
    private final String name;
    private final Age age;


    public ImmutableStudent(int id, String name, Age age) {
        this.id = id;
        this.name = name;
        //this.age = age;

        Age cloneAge = new Age();
        cloneAge.setYear(age.getYear());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setDay(age.getDay());
        this.age = cloneAge;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Age age = new Age(1, 2, 3);

        ImmutableStudent student = new ImmutableStudent(1, "ajay", age);

        System.out.println(student);

        age.setYear(12);
        student.getAge().setYear(123);

        System.out.println(student);
    }
}

class Age {
    private int day;
    private int month;
    private int year;

    public Age() {
    }

    public Age(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Age{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}