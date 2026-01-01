package in.co.vivekp.webapps.repositories;

import in.co.vivekp.webapps.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUsername(String username);
}
