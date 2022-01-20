import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTerroristTest {

    @Test
    void deveRetornarInfoContraTerrorista() {
        CounterTerrorist ct = new CounterTerrorist();
        ct.setName("Marco Antonio");
        ct.setObjective("Defend B site");
        ct.setEquipment("toolkit");
        ct.getGun();
        assertEquals("{Name=Marco Antonio, Gun='M4A1', equipment=toolkit, objective=Defend B site, team=Counter Terrorist}", ct.getInfoTeam());
    }

}
