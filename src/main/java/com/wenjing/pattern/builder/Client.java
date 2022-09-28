package com.wenjing.pattern.builder;

public class Client {
    public static void main(String[] args) {
        CastleBuilder castleBuilder = new CastleBuilder();
        Director director = new Director();
        director.construct(castleBuilder);
        House house1 = castleBuilder.build();
        System.out.println("Build castle");
        System.out.println(house1);
        System.out.println();

        HutBuilder hutBuilder = new HutBuilder();
        director.construct(hutBuilder);
        House house2 = hutBuilder.build();
        System.out.println("Build hut");
        System.out.println(house2);


    }
}
