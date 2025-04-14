package com.example.PropertyAdvisor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyAdvisorService {

@Autowired
private PropertyAdvisorRepo propertyAdvisorRepo;

    public List<PropertyAdvisor> getAllPropertyAdvisor(){

        return propertyAdvisorRepo.getAllPropertyAdvisor();
    }
}
