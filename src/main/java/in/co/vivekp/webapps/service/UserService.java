package in.co.vivekp.webapps.service;

import in.co.vivekp.webapps.model.UserEntity;
import in.co.vivekp.webapps.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder bencoder = new BCryptPasswordEncoder(12);

    public UserEntity registerUser(UserEntity user){
        user.setPassword(bencoder.encode(user.getPassword()));
    return repo.save(user);
    }
}
