/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.amigositsonjpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Roger Jr
 */
public class AmigosItsonJPA {

    public static void main(String[] args) 
    {
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AmigosItsonPU");
        EntityManager em = emf.createEntityManager();    
    }
}
