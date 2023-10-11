import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DemoTest {
    @Test
    public void testMain() {
        String input = "2\n2\n3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String [] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle.\n";
        assertEquals(consoleOutput,out.toString());
    }


    @Test
    public void testIsTriangle1() {
        assertTrue(Demo.isTriangle(2,2,3));
    }
    @Test
    public void testIsTriangle2() {
        assertTrue(Demo.isTriangle(2,3,2));
    }
    @Test
    public void testIsTriangle3() {
        assertTrue(Demo.isTriangle(3,2,2));
    }
    @Test
    public void testIsTriangle4() {
        assertTrue(Demo.isTriangle(1,1,1));
    }

    @Test
    public void testIsTriangle5() {
        assertTrue(Demo.isTriangle(1.1,1,1));
    }

    @Test
    public void testIsTriangle6() {
        assertTrue(Demo.isTriangle(1,1.2,1));
    }

    @Test
    public void testIsTriangle7() {
        assertTrue(Demo.isTriangle(1,1,1.2));
    }
    public void testIsTriangle8() {
        assertTrue(Demo.isTriangle(1.2,1.2,1.2));
    }





    @Test
    public void testIsNotTriangle1() {
        assertFalse(Demo.isTriangle(1,2,4));
    }

    @Test
    public void testIsNOTTriangle2() {
        assertFalse(Demo.isTriangle(1,4,2));
    }

    @Test
    public void testIsNOTTriangle3() {
        assertFalse(Demo.isTriangle(1,4,2));
    }

    @Test
    public void testIsNOTTriangle4() {
        assertFalse(Demo.isTriangle(-1,1,1));
    }

    @Test
    public void testIsNOTTriangle5() {
        assertFalse(Demo.isTriangle(1,-1,1));
    }

    @Test
    public void testIsNOTTriangle6() {
        assertFalse(Demo.isTriangle(-1,1,1));
    }
    @Test
    public void testIsNOTTriangle7() {
        assertFalse(Demo.isTriangle(3,1,1));
    }
    @Test
    public void testIsNOTTriangle8() {
        assertFalse(Demo.isTriangle(1,2,3));
    }
    @Test
    public void testIsNOTTriangle9() {
        assertFalse(Demo.isTriangle(0.9,2,3));
    }

    @Test
    public void testIsNOTTriangle10() {
        assertFalse(Demo.isTriangle(-5.2,1,1));
    }

    @Test
    public void testIsNOTTriangle11() {
        assertFalse(Demo.isTriangle(0.5,1,0.5));
    }
    @Test
    public void testIsNOTTriangle12() {
        assertFalse(Demo.isTriangle(0.5,0.5,1));
    }
    @Test
    public void testIsNOTTriangle13() {
        assertFalse(Demo.isTriangle(1,0.5,0.5));
    }




}
