package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    HashMap<Furniture, Integer> ordersOfFurnitures;

    FurnitureOrder() {
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        int count = 0;
        if (this.ordersOfFurnitures.containsKey(type))
            count = this.ordersOfFurnitures.get(type);
        this.ordersOfFurnitures.put(type, furnitureCount + count);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return this.ordersOfFurnitures;
    }

    public int getTypeCount(Furniture type) {
        if (this.ordersOfFurnitures.get(type) == null)
        return 0;
        return this.ordersOfFurnitures.get(type);
    }

    public float getTypeCost(Furniture type) {
        if (this.ordersOfFurnitures.get(type) == null)
        return 0;
        return this.ordersOfFurnitures.get(type) * type.cost();
    }

    public float getTotalOrderCost() {
        int sum = 0;
        for (Furniture type : this.ordersOfFurnitures.keySet()) {
            sum += this.getTypeCost(type);
        }
        return sum;
    }

    public int getTotalOrderQuantity() {
        int sum = 0;
        for (int x : this.ordersOfFurnitures.values()) {
            sum += x;
        }
        return sum;
    }
}
