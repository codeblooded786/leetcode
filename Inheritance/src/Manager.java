import java.time.LocalDate;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 28/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, LocalDate hireDay, double bonus) {
        super(name, salary, hireDay);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
