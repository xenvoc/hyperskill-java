import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class TaskController {

    @GetMapping("/test")
    public int returnOne() {
        return 1;
    }

}