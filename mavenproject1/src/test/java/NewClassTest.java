/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import it.unisa.mavenproject1.NewClass;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author clari
 */
public class NewClassTest {
    private NewClass nc;
    
    @Test
    public void testAdd(){
        NewClass nc = new NewClass();
        assertEquals(7, nc.add(3, 4));
        assertEquals(5, nc.add(10, -5));
        
    }

    @Test
    public void testDot(){
        NewClass a = new NewClass();
        assertEquals(12, a.dot(3, 4));
        assertEquals(-50, a.dot(10, -5));
        
    }
}
