/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prjinheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class PrjInheritanceTest {
    
    public PrjInheritanceTest() {
    }

    @Test
    public void Paint(){
        ArtStudent event = new ArtStudent("Bob");
        String expected = "Bob";
        String actual = event.getName();
        assertEquals(expected, actual,"Expected name is Bob");
        
    }
    @Test
    public void PlaySport(){
        SportStudent event = new SportStudent("David");
        String expected = "David";
        String actual = event.getName();
        assertEquals(expected, actual,"Expected name is David");
        
    }
    @Test
    public void PlayInstrument(){
        MusicStudent event = new MusicStudent("Alice");
        String expected = "Alice";
        String actual = event.getName();
        assertEquals(expected, actual,"Expected name is Alice");
        
    }
    
}
