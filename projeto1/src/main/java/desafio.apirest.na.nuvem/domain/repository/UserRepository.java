

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository<User> extends JpaRepository<User, Long> {
    // especifica a entidade que queremos usar nele e depois o tipo de id
    
}
