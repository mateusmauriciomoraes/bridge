public abstract class Veiculo {

    protected Motor motor;

    protected float potencia;

    public Veiculo(float potencia){
        this.potencia = potencia;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public abstract float gerarPotencia();
}