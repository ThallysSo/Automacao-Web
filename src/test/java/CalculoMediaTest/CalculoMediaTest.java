package CalculoMediaTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculoMediaTest {

    @Test
    public void validaReprovacao(){
        CalculoMedia calculoMedia = new CalculoMedia(5, 4);
        Assert.assertEquals("REPROVADO", calculoMedia.getSituacao());
    }
    
    @Test
    public void validaAprovacao() {
    	CalculoMedia calculoMedia = new CalculoMedia();
    	calculoMedia.setPrimeiranota(8);
    	calculoMedia.setSegundanota(6);
    	Assert.assertEquals("APROVADO", calculoMedia.getSituacao());
    }
    
   @Test
   public void testecomErro() throws Exception {
	   throw new Exception("Erro");
   }
    
}
