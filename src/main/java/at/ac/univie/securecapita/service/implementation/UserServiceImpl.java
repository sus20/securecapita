package at.ac.univie.securecapita.service.implementation;

import at.ac.univie.securecapita.domain.User;
import at.ac.univie.securecapita.dto.UserDTO;
import at.ac.univie.securecapita.dtomapper.UserDTOMapper;
import at.ac.univie.securecapita.repository.UserRepository;
import at.ac.univie.securecapita.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository<User> userRepository;

    @Override
    public UserDTO createUser(User user) {
        return UserDTOMapper.fromUser(userRepository.create(user));
    }
}