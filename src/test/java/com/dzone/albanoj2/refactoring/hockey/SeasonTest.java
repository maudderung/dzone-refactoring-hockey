package com.dzone.albanoj2.refactoring.hockey;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeasonTest{

    private Season season;

    @Before
    public void setUp() {
        season = new Season();
    }

    @Test
    public void testAddGame() {
        Game game = new Game(4, 1, 60);

        season.addGame(game);

        assertFalse(season.getGames().isEmpty());
    }
    @Test
    public void testGetTotalGoalsAgainst() {
        Game firstGame = new Game(1, 2, 90);
        Game secondGame = new Game(3, 1, 70);

        season.addGame(firstGame);
        season.addGame(secondGame);

        assertEquals(firstGame.getGoalsAgainst() + secondGame.getGoalsAgainst(), season.getTotalGoalsAgainst());
    }
    @Test
    public void testGetTotalShotsOnGoalAgainst() {

        Game firstGame = new Game(2, 2, 25);
        Game secondGame = new Game(3, 4, 30);

        season.addGame(firstGame);
        season.addGame(secondGame);

        assertEquals(firstGame.getShotsOnGoalAgainst() + secondGame.getShotsOnGoalAgainst(), season.getTotalShotsOnGoalAgainst());
    }
    @Test
    public void testGetTotalMinutesPlayed() {

        Game firstGame = new Game(10, 11, 45);
        Game secondGame = new Game(12, 15, 60);


        season.addGame(firstGame);
        season.addGame(secondGame);

        assertEquals(firstGame.getMinutesPlayed() + secondGame.getMinutesPlayed(), season.getTotalMinutesPlayed(),0.001);
    }

    @Test
    public void testHasStarted() {
        Game game = new Game(1, 1, 60);

        season.addGame(game);

        assertTrue(season.hasStarted());
    }
}