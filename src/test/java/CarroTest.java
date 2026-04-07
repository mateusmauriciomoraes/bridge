import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarPotenciaCarroComMotorEletrico() {
        Motor motor = new Eletrico();
        Carro carro = new Carro(2.0f);
        carro.setMotor(motor);
        assertEquals(4.0, carro.gerarPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaCarroComMotorCombustao() {
        Motor motor = new Combustao();
        Carro carro = new Carro(2.0f);
        carro.setMotor(motor);
        assertEquals(3.0, carro.gerarPotencia(), 0.01f);
    }
}