package stereotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class DataStructure {

    ExtraHours extraHours;

    //use contractor injection

//    public DataStructure(ExtraHours extraHours) {
//        this.extraHours = extraHours;
//    }

    public void getTotalHours(){
        System.out.println("Total hours: " + (35 + extraHours.getHours()));
    }
}
