package com.sheridan.johnny;
import com.sheridan.johnny.security.SecurityConfig;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer{
    public SecurityWebApplicationInitializer(){
        super(SecurityConfig.class);
    }
}
