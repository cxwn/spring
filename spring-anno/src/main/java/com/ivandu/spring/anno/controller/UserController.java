package com.ivandu.spring.anno.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Value("ControllerShow")
    public String userControllerName;
}
