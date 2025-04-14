package stereotype_annotations.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataStructure {

    ExtraHours extraHours;

    // if we are using constructor injection, then don't need to use @Autowired

    public void getTotalHours() {
        int totalHours = 35 + extraHours.getHours();
        System.out.println("Total hours worked [data_structure]: " + totalHours);
    }
}
