/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 19/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */

@Service
public class Service {

    @Autowired
    TableRepository tableRepository;

    public void persistTable(Table table)
    {
        tableRepository.save();
    }

}
