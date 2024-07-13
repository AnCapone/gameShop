package org.example.service;

public enum MenuTexts {
    WELCOME("Welcome to the Game Shop!"),
    MAIN_MENU("Main menu:"),
    GAME_LIST("Show all games"),
    FIND_BY_NAME("Find game by name"),
    FILTER_BY_PRICE("Filter games by price"),
    FILTER_BY_TYPE("Filter games by type"),
    SORT_RELEASE_DATE("Show games sorted by release date"),
    ADD_GAME("Add new game"),
    DELETE_GAME("Delete game"),
    EXIT("Exit");

    private final String text;

    MenuTexts(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
