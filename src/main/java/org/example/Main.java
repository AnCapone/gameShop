package org.example;

import org.example.model.Game;
import org.example.repositories.GameRepository;
import org.example.service.GameService;
import org.example.service.MenuService;
import org.example.service.MenuTexts;

import java.lang.constant.Constable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        MenuService menuService = new MenuService(scanner);
        GameService gameService = new GameService();
        Map<Constable, Runnable> orchestrator = init(scanner, gameService);
        menuService.showMenu();
        int choice;
        do {
            choice = scanner.nextInt();
            orchestrator.getOrDefault(choice, () -> System.out.println("Invalid choice")).run();
        } while (choice != MenuTexts.EXIT.ordinal() + 1);
        }

    }

}