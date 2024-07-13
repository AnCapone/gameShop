package org.example.repositories;

import org.example.SessionFactorySingleton;
import org.junit.Before;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class GameRepositoryTest {
    private static GameRepository gameRepository;

    @BeforeAll
    static void setUp() {
        gameRepository = new GameRepository(SessionFactorySingleton.getSessionFactory());
    }

    @Test
    void getAllGames() {

        assertEquals(7, gameRepository.getAllGames().size());

    }

    @Test
    void findByName() {

        assertEquals(6, gameRepository.findByName("Ostriv").getId());
    }

    @Test
    void filterByPrice() {

        assertEquals(4, gameRepository.filterByPrice(new BigDecimal(800)).size());
    }

    @Test
    void filterByType() {

        assertEquals(2, gameRepository.filterByType("Strategy").size());
    }

    @Test
    void sortedByReleaseDate() {

        assertEquals(1, gameRepository.sortedByReleaseDate().get(0).getId());
    }
}