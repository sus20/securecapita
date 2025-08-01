package at.ac.univie.securecapita.service;

import at.ac.univie.securecapita.domain.User;
import at.ac.univie.securecapita.dto.UserDTO;

public interface UserService {
    UserDTO createUser(User user);
}