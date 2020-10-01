package CalculoMediaTest;

public class CalculoMedia {

    private double primeiranota;
    private double segundanota;


    public CalculoMedia(double _primeiranota, double _segundanota){
        this.primeiranota = _primeiranota;
        this.segundanota = _segundanota;
    }

    public CalculoMedia(){

    }

    public String getSituacao(){
        double soma = this.primeiranota + this.segundanota;
        if (soma < 12) {
            return "REPROVADO";
        }else{
            return "APROVADO";        }
    }


    public double getPrimeiranota() {
        return primeiranota;
    }

    public void setPrimeiranota(double primeiranota) {
        this.primeiranota = primeiranota;
    }

    public double getSegundanota() {
        return segundanota;
    }

    public void setSegundanota(double segundanota) {
        this.segundanota = segundanota;
    }
}
