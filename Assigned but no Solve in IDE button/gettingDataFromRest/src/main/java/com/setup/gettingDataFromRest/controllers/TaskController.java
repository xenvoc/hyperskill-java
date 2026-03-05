import org.springframework.web.bind.annotation.*;

@RestController

public class TaskController {

    @GetMapping("/test")
    public int returnOne() {
        return 1;
    }

}