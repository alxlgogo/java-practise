package com.wenjing.pattern.factory.abstractfactory;

public class USDrinkFactory extends AbstractDrinkFactory {
    @Override
    public Coffee produceCoffee() {
        return new AmericanoCoffee();
    }

    @Override
    public Soda produceSoda() {
        return new CocaSoda();
    }
}
