import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class MultipleOccurences {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();


        while (t-- > 0) {

            int n = kb.nextInt();
            Map<Integer, IndexFirstLast> matrix = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = kb.nextInt();

                if (matrix.containsKey(x)) {
                    IndexFirstLast indexFirstLast = matrix.get(x);
                    indexFirstLast.last = i;
                    matrix.put(x, indexFirstLast);
                } else {
                    matrix.put(x, new IndexFirstLast(i));
                }
            }

            int sum = 0;

            for (Map.Entry<Integer, IndexFirstLast> entry : matrix.entrySet()) {
                IndexFirstLast value = entry.getValue();
                if (value.last == 0) {
                    sum += value.first;
                } else {
                    sum += value.last - value.first;
                }
            }
            System.out.println(sum);
        }
    }
}

class IndexFirstLast {
    Integer first;
    Integer last;

    public IndexFirstLast(Integer first) {
        this.first = first;
        this.last = 0;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndexFirstLast that = (IndexFirstLast) o;
        return Objects.equals(first, that.first) &&
                Objects.equals(last, that.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    @Override
    public String toString() {
        return "IndexFirstLast{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

}
