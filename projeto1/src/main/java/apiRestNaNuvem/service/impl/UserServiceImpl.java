package java.apiRestNaNuvem.service.impl;
import java.apiRestNaNuvem.domain.modal.User;
import java.apiRestNaNuvem.domain.repository.UserRepository;

import org.springframework.stereotype.Service;
import jakarta.persistence.NoResultException;
 
@Service
public class UserServiceImpl implements UserService  {
    
    @SuppressWarnings("rawtypes")
    private final UserRepository userRepository;

    public UserServiceImpl(@SuppressWarnings("rawtypes") UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    User findById(Long id){
        return UserRepository.findById(id).orElseThrow(NoResultException::new);
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    User create(User userToCreate) {
        if (userRepository.existsByAccount(userToCreate.getAccount() != null && userRepository.existsByAccount(userToCreate.getAccount()))){
            throw new IllegalArgumentException("This Account number already exists.");
        }

        return userRepository.save(userToCreate);
    }
    @SuppressWarnings("rawtypes")
    public UserRepository getUserRepository() {
        return userRepository;
    } 
}
