package com.xworkz.inheritence.inner;

public class Football extends Sports {
    @Override
    public void win() {
        System.out.println("The Winner is Argentania");
    }
    @Override
    public void lose() {
        System.out.println("The loser is France");
    }
    @Override
    public void manOfMatch() {
        System.out.println("Man of the match is Messi");
    }
    @Override
    public  void budget() {
        System.out.println("budget is 13Million");
    }

}
