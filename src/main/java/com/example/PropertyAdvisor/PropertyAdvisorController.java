package com.example.PropertyAdvisor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropertyAdvisorController {


    @Autowired
    private PropertyAdvisorService propertyAdvisorService;

    @GetMapping("/properties")
    private List<PropertyAdvisor> getAllPropertyAdvisors(){
        return  propertyAdvisorService.getAllPropertyAdvisor();
    }
}
