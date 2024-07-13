package org.example.repositories;
import lombok.AllArgsConstructor;

import org.example.model.Game;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
public class GameRepository {
    private SessionFactory sessionFactory;

    public List<Game> getAllGames() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Game", Game.class).list();
        }
    }

    public Game findByName(String name) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Game where name = :name", Game.class)
                    .setParameter("name", name)
                    .uniqueResult();
        }
    }

    public List<Game> filterByPrice(BigDecimal price) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Game where price < :price", Game.class)
                    .setParameter("price", price)
                    .list();
        }
    }

    public List<Game> filterByType(String type) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Game where type = :type", Game.class)
                    .setParameter("type", type)
                    .list();
        }
    }

    public List<Game> sortedByReleaseDate() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Game order by releaseDate", Game.class)
                    .list();
        }
    }

    public void deleteGame(String name) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Game where name = :name")
                    .setParameter("name", name)
                    .executeUpdate();
            session.getTransaction().commit();
        }
    }

    public void addGame(Game game) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(game);
            session.getTransaction().commit();
        }
    }
}
