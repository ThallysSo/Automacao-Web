package CalculoMediaTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculoMediaTest {

    @Test
    public void validaReprovacao(){
        CalculoMedia calculoMedia = new CalculoMedia(5, 9);
        Assert.assertEquals("APROVADO", calculoMedia.getSituacao());
    }
}
