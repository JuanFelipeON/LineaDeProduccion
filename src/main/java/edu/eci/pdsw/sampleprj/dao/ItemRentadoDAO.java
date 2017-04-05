/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.sampleprj.dao;

import edu.eci.pdsw.samples.entities.ItemRentado;

/**
 *
 * @author 2092815
 */
public interface ItemRentadoDAO {

    public void save(ItemRentado ir) throws PersistenceException;

    public ItemRentado load(int id) throws PersistenceException;

}
