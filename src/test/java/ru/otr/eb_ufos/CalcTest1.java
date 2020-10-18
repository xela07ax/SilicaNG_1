package ru.otr.eb_ufos;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.otr.projectname.*;

public class CalcTest1 {

    private Calc calc = new Calc();

    @Test
    public void testSumpd() throws Exception {
        Assert.assertEquals(5, calc.sum(2,3));
    }
    @Test
    public void testSubpd() throws Exception {
        Assert.assertEquals(-8, calc.sum(2,3));
    }
}