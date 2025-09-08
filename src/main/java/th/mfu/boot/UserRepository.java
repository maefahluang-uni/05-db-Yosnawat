package th.mfu.boot;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    // Find all users
    public List<User> findAll();
    
    // Find user by username
    public User findByUsername(String username);
    
}
