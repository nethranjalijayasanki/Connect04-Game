package org.example.service;

public interface BoardUI {
    public void update(int col, boolean isHuman);
    public void notifyWinner(Winner winner);

}
