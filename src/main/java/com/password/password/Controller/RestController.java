package com.password.password.Controller;

import com.password.password.Configs;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@org.springframework.web.bind.annotation.RestController
@Log4j2
@Service
public class RestController {

    @Autowired
    Configs configs;

    @GetMapping(value = "/getPassword")
    public String getPassword() {
        LocalTime localStartTime = LocalTime.of(9,14,59);
        LocalTime localEndTime = LocalTime.of(15,30,1);
        LocalTime now = LocalTime.now();
        if (now.isAfter(localStartTime) && now.isBefore(localEndTime)) {
            log.info("Password can not be provided at this time");
            return "Password can not be provided at this time";
        } else {
            return configs.getGmailPassword();
        }
    }
}
