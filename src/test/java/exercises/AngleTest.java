package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngleTest {

    @BeforeEach
    public void setUp() throws Exception{

    }

    @Test
    public void get_angle_test(){
        Angle angle = new Angle(10);
        assertEquals(10, angle.getDegrees(), "They are not equal");
    }

    @Test
    public void set_negative_angle(){
        Angle angle = new Angle(-20);
        assertEquals(340, angle.getDegrees(), "They are not equal");
    }

    @Test
    public void set_too_big_angle(){
        Angle angle = new Angle(380);
        assertEquals(20, angle.getDegrees(), "They are not equal");
    }

    @Test
    public void set_too_big_angle_bigger(){
        Angle angle = new Angle(750);
        assertEquals(30, angle.getDegrees(), "They are not equal");
    }

    @Test
    public void set_too_negative_angle(){
        Angle angle = new Angle(-370);
        assertEquals(350, angle.getDegrees(), "They are not equal");
    }

    @Test
    public void set_to_zero_degree_test_negative(){
        Angle angle = new Angle(-360);
        assertEquals(0, angle.getDegrees(), "They are not equal");
    }

    @Test
    public void set_to_zero_degree_test_positive(){
        Angle angle = new Angle(360);
        assertEquals(0, angle.getDegrees(), "They are not equal");
    }


}