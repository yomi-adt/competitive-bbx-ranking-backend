package com.yomi_adt.bbx_2026_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizerController {
    @GetMapping("/info")
    public String info() {
        return "The application is up...";
    }
}
