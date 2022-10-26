package com.github.homework;


import org.junit.jupiter.api.Test;

public class ObjectsMaking {
@Test
        public void workingWithHomeWork(){

    HomeWork car = new HomeWork();
    car.setColor ("green");
    car.setModel ("Audi");
    car.setFuel("Diesel");
    car.setManufacturer("Germany");
    car.setYearOfIssue(1);
    car.setYearOfIssue(2022);
    car.setTotalPrice(50000);

    HomeWork house = new HomeWork();
    house.setAddress("Eksporta 1-1, Riga, LV-1013");
    house.setFloor(5);
    house.setSquare(333.33);
    house.setName("RiverSideHouse");
    house.setItemCount(1);
    house.setTotalPrice(250000);
    house.setRoomCount(5);
    house.isDiscountRequested();
    house.setPriceForMeter(2500.50);

    HomeWork box = new HomeWork();
    box.setColor("grey");
    box.setManufacturer("China");
    box.setHeight(250);
    box.setWidth(200);
    box.setItemCount(1);
    box.setTotalPrice(50000);
    box.setItemCount(1);

    HomeWork phone = new HomeWork();
    phone.setColor("grey");
    phone.setManufacturer("Samsung");
    phone.setModel("S22");
    phone.setItemCount(5);
    phone.setTotalPrice(3500);

    HomeWork table = new HomeWork();
    table.setModel("TableA");
    table.setColor("white");
    table.setHeight(60);
    table.setWeight(20.500);
    table.setWidth(55.50);

    HomeWork window = new HomeWork();
    window.setWidth(90);
    window.setHeight(120);
    window.setWeight(15);
    window.setItemCount(2);
    window.setTotalPrice(500);

    HomeWork bag = new HomeWork();
    bag.setColor("blue");
    bag.setWeight(1.250);
    bag.setHeight(20.50);
    bag.setWidth(15.50);
    bag.setItemCount(1);
    bag.setTotalPrice(100);

    HomeWork book = new HomeWork();
    book.setColor("black");
    book.setItemCount(4);
    book.setWeight(2.535);
    book.setTotalPrice(80);
    book.setName("Java - basic course");

    HomeWork gift = new HomeWork();
    gift.setColor("red");
    gift.setItemCount(10);
    gift.setTotalPrice(333);
    gift.setWeight(4.44444);
    gift.setYearOfIssue(2010);

    HomeWork ski = new HomeWork();
    ski.setColor("Red and White");
    ski.setModel("Atomic");
    ski.setWeight(3.50);
    ski.setItemCount(1);
    ski.setTotalPrice(777);

    System.out.println("Neo bought" + "" + "Car" + "" + "and new flat");
    System.out.println("the car is:");
    System.out.println(car.getColor() + car.getModel() + car.getTotalPrice());
    System.out.println(house.getFloor() + house.getAddress() + house.getRoomCount() + house.getTotalPrice());
    System.out.println(phone.getColor() + phone.getModel() + phone.getTotalPrice());
    System.out.println(ski.getColor() + ski.getModel() + ski.getTotalPrice());
    }
}
