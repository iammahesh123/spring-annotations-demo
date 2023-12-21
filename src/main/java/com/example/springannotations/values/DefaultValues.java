package com.example.springannotations.values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DefaultValues {

    @Value("Default Name")
    private String defaultValue;

    @Value("${mail.host}")
    private String host;
    @Value("${mail.email}")
    private String mail;

    @Value("${mail.password}")
    private String password;

    public String getHost() {
        return host;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }




    public String getDefaultValue() {
        return defaultValue;
    }
}
