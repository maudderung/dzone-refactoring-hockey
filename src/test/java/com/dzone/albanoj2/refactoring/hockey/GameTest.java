package com.dzone.albanoj2.refactoring.hockey;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
    game = new Game(1,2,45);
    }

    @Test
    public void getGoalsAgainst() {
        assertNotNull(game.getGoalsAgainst());
    }

    @Test
    public void getShotsOnGoalAgainst() {
        assertNotNull(game.getShotsOnGoalAgainst());
    }

    @Test
    public void getMinutesPlayed() {
        assertNotNull(game.getMinutesPlayed());
    }
}