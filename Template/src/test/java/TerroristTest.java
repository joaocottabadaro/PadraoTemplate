import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TerroristTest {

    @Test
    void deveRetornarInfoTerrorista() {
        Terrorist terrorist = new Terrorist();
        terrorist.setName("Cristiano Ronaldo");
        terrorist.setObjective("Plant c4");
        terrorist.setEquipment("c4");
        terrorist.getGun();
        assertEquals("{Name=Cristiano Ronaldo, Gun='AK-47', equipment=c4, objective=Plant c4, team=Terrorist}", terrorist.getInfoTeam());
    }

}
