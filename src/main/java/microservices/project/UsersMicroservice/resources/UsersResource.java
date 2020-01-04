package microservices.project.UsersMicroservice.resources;

import microservices.project.UsersMicroservice.models.request.CreateUserRequestModel;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController()
@RequestMapping("/users")
public class UsersResource {

    @GetMapping(path = "/status/check")
    public String status(){
        return "yes!";
    }
    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequestModel userRequestModel){
        return "";
    }
}
