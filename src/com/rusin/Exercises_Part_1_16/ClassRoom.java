package com.rusin.Exercises_Part_1_16;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private List<Wall> walls = new ArrayList<>();
    private String name;

    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public void addWalls(Wall wall) {
        walls.add(wall);
    }
    public ClassRoom(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "walls=" + walls +
                ", name='" + name + '\'' +
                '}';
    }
}
