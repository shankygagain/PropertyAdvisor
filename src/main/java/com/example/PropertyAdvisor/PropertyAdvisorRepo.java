package com.example.PropertyAdvisor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PropertyAdvisorRepo {


    @Autowired
    private DataSource dataSource;

    public List<PropertyAdvisor> getAllPropertyAdvisor() {

        List<PropertyAdvisor> propertyAdvisors = new ArrayList<>();
        try {


            try (Connection conn = dataSource.getConnection();
                 PreparedStatement preparedStatement = conn.prepareStatement("select * from propertymanager.property");
                 ResultSet rs = preparedStatement.executeQuery();) {

                while (rs.next()) {
               PropertyAdvisor pa = new PropertyAdvisor();
               pa.setPropertyId(rs.getInt("id"));
               pa.setPlaceName(rs.getString("name"));
               pa.setDimensions(rs.getInt("dimensions"));
               propertyAdvisors.add(pa);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return propertyAdvisors;
    }
}
