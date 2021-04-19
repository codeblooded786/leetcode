import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 21/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Person {

    private String firstName;
    private String lastName;
    private int i;
    private BigDecimal salary;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
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
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

//    public static boolean Comparator(Person a, Person b)
//    {
//        if (a.getFirstName().compareTo(b.firstName)>0)
//            return true;
//
//        return false;
//    }

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();


        List<String> stringList = Arrays.asList("a", "b", "a", "c", "a", "b");

        personList.stream().collect(groupingBy(Person::getFirstName));

        personList.stream().collect(groupingBy(Person::getFirstName));

        personList.stream().collect(Collectors.groupingBy(Person::getFirstName));

        Map<String, Long> collect = stringList.stream().collect(groupingBy(Function.identity(), Collectors.counting()));


        Map<String, Integer> integerMap = personList.stream()
                .collect(groupingBy(Person::getFirstName, Collectors.summingInt(Person::getI)));

        Map<Integer, List<Person>> map = personList.stream().collect(groupingBy(Person::getI));


        // personList.stream().collect(groupingBy(Person::getI),Collectors.mapping(Person::getFirstName,Collectors.toList()));

        personList.stream()
                .collect(Collectors.groupingBy(Person::getI, Collectors.mapping(Person::getFirstName, Collectors.toSet())));


        personList.stream().map(Person::getI).reduce(0, Integer::sum);

        personList.stream().map(Person::getSalary).reduce(BigDecimal::max);

//        List<Person> sortedList = personList.stream()
//                .sorted(Comparator.comparing(Person::getFirstName)).collect(Collectors.toList());
        System.out.println();


        personList.sort(Comparator.comparing(Person::getSalary));

        personList.sort(Comparator.comparing(Person::getSalary).thenComparing(Person::getI));

        personList.sort(Comparator.comparing(Person::getSalary).reversed().thenComparing(Person::getI));

        Predicate<Person> personPredicate = person -> person.getSalary().compareTo(BigDecimal.TEN) > 0;

        personList.stream().filter(personPredicate).filter(personPredicate.negate()).collect(Collectors.toList());

        Predicate<Person> personPredicate2 = person -> person.getFirstName().contains("a");
        Predicate<Person> personPredicate1 = person -> person.getLastName().contains("b");

        personList.stream().filter(personPredicate1.and(personPredicate2));

        personList.stream().filter(person -> person.getLastName().contains("a") && person.getFirstName().contains("b")).collect(Collectors.toList());

        personList.stream().filter(personPredicate1.and(person -> person.getI() > 0)).collect(Collectors.toList());

        personList.stream().filter(personPredicate1.and(personPredicate2).or(person -> person.getFirstName().equals("ABC"))).collect(Collectors.toList());

        personList.stream().map(Person::getSalary).reduce(BigDecimal::min);

        personList.stream().min(Comparator.comparing(Person::getSalary));

        personList.stream().map(Person::getI).reduce(Integer::max);

        Integer s[] = {1, 2, 3, 4, 5, 6};

        personList.stream().map(Person::getSalary).reduce(BigDecimal::max);

        personList.stream().collect(maxBy(Comparator.comparing(Person::getSalary)));//person with maximum salary

        IntSummaryStatistics summaryStatistics = personList.stream().collect(summarizingInt(Person::getI));

        personList.stream().map(Person::getFirstName).collect(Collectors.joining(","));

        List<List<String>> items = new ArrayList<>();

        items.stream().sorted(Comparator.comparing(list->list.get(0))).collect(Collectors.toList());




        


    }

    //Set<Person> personSet = new TreeSet<>(Comparator.comparing(Person::getFirstName));

//
//        personSet.add(new Person("ajay","pal"));
//        personSet.add(new Person("virendra","nagpal"));
//
//        System.out.println(personSet);

}
//
//    1->2->3->4->5
//
//    head;
//
//    Node prev= null;
//    Node temp=null;
//    while(head!=null)
//
//    {
//        temp = head.next;
//        head.next = prev;
//        prev = head;
//        head = temp;
//    }
//    return prev;
//}
