package com.designpatterns.observer;

public class SpreadSheet implements Observer {

    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreedSheet got notified: " + dataSource.getValue());
    }
}
