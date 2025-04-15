package com.example.PropertyAdvisor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PropertyAdvisorRepo1 {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<PropertyAdvisor> getAllProp(){

        return jdbcTemplate.query("select * from propertymanager.property", (rs,rownum)-> {

            PropertyAdvisor propertyAdvisor = new PropertyAdvisor();
            propertyAdvisor.setPropertyId(rs.getInt("id"));
            propertyAdvisor.setPlaceName(rs.getString("name"));
            propertyAdvisor.setDimensions(rs.getInt("dimensions"));
            System.out.println("this is the repo");


            return propertyAdvisor;

        });
    }
}
