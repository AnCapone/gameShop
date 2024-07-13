package org.example.service;

import org.example.repositories.GameRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MenuService {
    private final Scanner scanner;
    private final List<String> menu = List.of(
            "1. " + MenuTexts.GAME_LIST.getText(),
            "2. " + MenuTexts.FIND_BY_NAME.getText(),
            "3. " + MenuTexts.FILTER_BY_PRICE.getText(),
            "4. " + MenuTexts.FILTER_BY_TYPE.getText(),
            "5. " + MenuTexts.SORT_RELEASE_DATE.getText(),
            "6. " + MenuTexts.ADD_GAME.getText(),
            "7. " + MenuTexts.DELETE_GAME.getText(),
            "8. " + MenuTexts.EXIT.getText()
    );

    public MenuService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMenu() {
        System.out.println(MenuTexts.WELCOME.getText());
        System.out.println(MenuTexts.MAIN_MENU.getText());
        menu.forEach(System.out::println);
    }

}
