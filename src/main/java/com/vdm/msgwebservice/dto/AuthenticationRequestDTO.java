package com.vdm.msgwebservice.dto;

import com.vdm.msgwebservice.entity.Organization;
import lombok.Data;

@Data
public class AuthenticationRequestDTO {
    private String Login;
    private String Password;
    private String Email;
    private String CompanyName;
}
