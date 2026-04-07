public class Moto extends Veiculo {

    public Moto(float potencia){
        super(potencia);
    }

    public float gerarPotencia() {
        return this.potencia * this.motor.aumentoPotencia();
    }
}
