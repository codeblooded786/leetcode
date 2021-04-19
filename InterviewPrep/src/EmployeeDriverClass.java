import java.io.Serializable;
import java.util.*;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 03/02/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */

class Employee implements Serializable {

    int id;
    double sal;
    int age;

    public Employee(int id, double sal, int age) {
        this.id = id;
        this.sal = sal;
        this.age = age;
    }


    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || o.getClass() != this.getClass())
            return false;

        Employee e = (Employee) o;

        return e.id == this.id && e.age == this.age && this.sal == e.sal;

    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Double.compare(employee.sal, sal) == 0 && age == employee.age;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sal, age);
    }
}


public class EmployeeDriverClass {

    public static void main(String[] args) {

        Map<Employee, Integer> map = new HashMap<>();

        map.put(new Employee(1, 12, 10), 1);
        map.put(new Employee(1, 12, 10), 1);


//        for (Map.Entry<Employee, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//
//        System.out.println(new Employee(2, 3, 4).equals(null));

        Employee e1 = new Employee(1, 2, 3);

        Employee e2 = new Employee(1, 2, 3);


        System.out.println(e1 == e2);

        System.out.println(e1.equals(e2));

        Map<Integer, Integer> map1 = new HashMap<>();

        Set<Integer> set = new HashSet<>();


    }
}
