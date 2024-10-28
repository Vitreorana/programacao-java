package java.apiRestNaNuvem.service.impl;

import java.apiRestNaNuvem.domain.modal.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
