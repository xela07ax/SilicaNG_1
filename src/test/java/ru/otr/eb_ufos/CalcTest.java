package ru.otr.eb_ufos;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.otr.projectname.*;

public class CalcTest {

    private Calc calc = new Calc();

    @Test
    public void testSum() throws Exception {
        Assert.assertEquals(5, calc.sum(2,3));
    }
    @Test
    public void testSub() throws Exception {
        Assert.assertEquals(-1, calc.sum(2,3));
    }
}