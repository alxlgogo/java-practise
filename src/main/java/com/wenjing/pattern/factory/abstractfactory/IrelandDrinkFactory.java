package com.wenjing.pattern.factory.abstractfactory;

public class IrelandDrinkFactory extends AbstractDrinkFactory{
    @Override
    public Coffee produceCoffee() {
        return new CappuccinoCoffee();
    }

    @Override
    public Soda produceSoda() {
        return new FantaSoda();
    }
}
