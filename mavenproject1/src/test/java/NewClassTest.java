/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import it.unisa.mavenproject1.NewClass;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author clari
 */
public class NewClassTest {
    private NewClass nc;
    
    @Before
    public void setUp(){
        nc = new NewClass();
    }
    
    @Test
    public void testAdd(){
        assertEquals(7, nc.add(3, 4));
        assertEquals(5, nc.add(10, -5));
        
    }

    @Test
    public void testDot(){
        assertEquals(12, nc.dot(3, 4));
        assertEquals(-50, nc.dot(10, -5));
        
    }
}
