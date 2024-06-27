package com.bluealtair.apis.service.auth;

import com.bluealtair.apis.data.entities.User;
import com.bluealtair.apis.data.enumeration.UserRole;
import com.bluealtair.apis.data.repository.UserRepository;
import com.bluealtair.apis.dto.SignupRequest;
import com.bluealtair.apis.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
    private final UserRepository userRepository;


    @Override
    public UserDTO createCustomer(SignupRequest signupRequest) {
        User user= new User();
        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());
        user.setPassword(signupRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        return null;
    }
}
