package stereotype_annotations.model;

import org.springframework.stereotype.Component;

@Component
public class ExtraHours {

    public int getHours() {
        int extraHours = 10;
        System.out.println("Total hours worked [extra_hours]: " + extraHours);
        return extraHours;
    }
}
