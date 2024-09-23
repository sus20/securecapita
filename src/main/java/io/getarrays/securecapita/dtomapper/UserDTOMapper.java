package io.getarrays.securecapita.dtomapper;

import io.getarrays.securecapita.domain.User;
import io.getarrays.securecapita.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {
    public static UserDTO fromUser( User user){
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    public static UserDTO toUser( UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return userDTO;
    }
}