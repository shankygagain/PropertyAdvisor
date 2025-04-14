package com.example.PropertyAdvisor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyAdvisorService {

@Autowired
private PropertyAdvisorRepo1 propertyAdvisorRepo1;

    public List<PropertyAdvisor> getAllPropertyAdvisor(){

        return propertyAdvisorRepo1.getAllProp();
    }
}
