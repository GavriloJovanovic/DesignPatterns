package test.structural.adapter;

import main.structural.adapter.RoundHole;
import main.structural.adapter.RoundPeg;
import main.structural.adapter.SquarePeg;
import main.structural.adapter.SquarePegAdapter;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {

    @Test
    public void roundPegFitsRoundHole() {
        // given
        RoundHole hole = new RoundHole(5);
        // when
        RoundPeg rpeg = new RoundPeg(5);
        // then
        assertTrue(hole.fits(rpeg), "RoundPeg should fit the RoundHole");
    }

    @Test
    public void sqaurePegFitsRoundHole() {
        // given
        RoundHole hole = new RoundHole(5);
        // when
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);

        // then
        assertTrue(hole.fits(smallSqPegAdapter));
    }

    @Test
    public void squarePegNoFitsRoundHole() {
        // given
        RoundHole hole = new RoundHole(5);
        // when
        SquarePeg largeSqPeg = new SquarePeg(20);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        //then
        assertFalse(hole.fits(largeSqPegAdapter));

    }
}