import java.math.BigDecimal;
import java.util.Objects;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 19/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */

@Entity ("table")
public class Table {


    @Column("name")
    private String name;

    @Column("age")
    private Integer age;

    @Column("salary")
    private BigDecimal salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return Objects.equals(name, table.name) && Objects.equals(age, table.age) && Objects.equals(salary, table.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
