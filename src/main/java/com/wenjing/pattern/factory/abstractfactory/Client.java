package com.wenjing.pattern.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractDrinkFactory irelandDrinkFactory = new IrelandDrinkFactory();
        Coffee coffee1 = irelandDrinkFactory.produceCoffee();
        Soda soda1 = irelandDrinkFactory.produceSoda();
        System.out.println(coffee1.getName() + " and " + soda1.getName() + " from Ireland");

        AbstractDrinkFactory usDrinkFactory = new USDrinkFactory();
        Coffee coffee2 = usDrinkFactory.produceCoffee();
        Soda soda2 = usDrinkFactory.produceSoda();

        System.out.println(coffee2.getName() + " and " + soda2.getName() + " from US");

    }
}
