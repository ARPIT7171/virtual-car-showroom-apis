package com.bluealtair.apis.service.auth;

import com.bluealtair.apis.dto.SignupRequest;
import com.bluealtair.apis.dto.UserDTO;

public interface AuthService {
    UserDTO createCustomer(SignupRequest signupRequest);
}
