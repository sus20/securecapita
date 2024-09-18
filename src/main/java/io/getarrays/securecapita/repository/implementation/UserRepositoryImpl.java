package io.getarrays.securecapita.repository.implementation;

import io.getarrays.securecapita.domain.User;
import io.getarrays.securecapita.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryImpl implements UserRepository<User> {
    private final NamedParameterJdbcTemplate jdbcTemplate ;

    @Override
    public User create(User data) {
        // check the email is unique
        // Save new user
        // Add role to the user
        // Send verification URL
        // Send URL in verification table
        // Send email to user with verification URL
        // Return the newly created user
        // If any errors, throw exception with proper message
        return null;
    }

    @Override
    public Collection<User> list(int page, int pageSize) {
        return null;
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public User update(User data) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
