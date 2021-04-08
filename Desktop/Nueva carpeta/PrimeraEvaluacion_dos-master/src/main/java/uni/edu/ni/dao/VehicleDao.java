/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.edu.ni.dao;

import java.io.IOException;
import java.util.Collection;
import uni.edu.ni.pojo.Vehicle;

/**
 *
 * @author JADPA03
 */
public interface VehicleDao extends Dao<Vehicle> {
    Vehicle findById(int id) throws IOException;
    Collection<Vehicle> findByStatus(String status) throws IOException;
}
