package java.apiRestNaNuvem.controller;

import java.apiRestNaNuvem.domain.modal.User;
import java.apiRestNaNuvem.service.UserService;
import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/users")
public class UserController {
    @SuppressWarnings("unused")
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @SuppressWarnings("rawtypes")
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable_Long id ){
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }
    @SuppressWarnings("rawtypes")
    @PostMapping("/{id}")
    public ResponseEntity<Object> create(@RequestBody User userToCreate){
        var userCreated = userService.create(userToCreate);
        URI location =ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/id")
            .buildAndExpand(((User) userCreated).getId())
            .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
    
    

