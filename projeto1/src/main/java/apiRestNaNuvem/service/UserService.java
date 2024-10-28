package java.apiRestNaNuvem.service;

import java.apiRestNaNuvem.domain.modal.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
