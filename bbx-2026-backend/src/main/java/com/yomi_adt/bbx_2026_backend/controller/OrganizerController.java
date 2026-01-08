package com.yomi_adt.bbx_2026_backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class OrganizerController {
    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info() {
        return "The application is up...";
    }
}
