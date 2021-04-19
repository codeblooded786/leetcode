import java.util.HashMap;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 23/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
final public class ImmutableCLass {

    final private int id;
    final private String name;

    final HashMap<Integer, Integer> properties;

    final private String company;

    public ImmutableCLass(ImmutableClassBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.properties = builder.properties;
        this.company = builder.company;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<Integer, Integer> getProperties() {
        return (HashMap<Integer, Integer>) properties.clone();
    }

    public String getCompany() {
        return company;
    }

    public static class ImmutableClassBuilder {
        private int id;
        private String name;
        private HashMap<Integer, Integer> properties;
        private String company;


        public ImmutableClassBuilder(int i, String name) {
            this.id = id;
            this.name = name;
        }

        public ImmutableClassBuilder setProperties(HashMap<Integer, Integer> properties) {
            this.properties = properties;
            return this;
        }

        public ImmutableClassBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public ImmutableCLass build() {
            return new ImmutableCLass(this);
        }
    }
}
