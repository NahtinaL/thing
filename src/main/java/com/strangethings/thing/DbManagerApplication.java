package com.strangethings.thing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DbManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbManagerApplication.class, args);
	}

}

class Game {

	private Player player1;
	private Player player2;

	private Player turn;

	private boolean isOverl;


}

class Player {

	private Field ally;
	private Field enemy;


}

class Field {
	int[][] field = new int[10][10]; // 0/1

	int sizeY;
	int sizeX;

	Ship[] ships;

	Coords[] misses;

	public boolean shoot(Coords coords) {
		return false;
	}



	/*Field() {
		field = new int[10][10];
	}*/
}

class Coords {
	int X;
	int Y;
}

abstract class Ship {

	Paluba[] body;

	Coords korma;
	Coords nose;

	Orientation orientation;

	abstract Coords getStartCoords();
	abstract Coords getEndCoords();
	abstract Orientation getOrientation();
	abstract boolean isDead();
}

class Paluba {
	private Coords coords;
	private boolean damaged;
}

/*class OnePalubShip extends Ship {

}*/

enum Orientation {
	HORIZONTAL(0), VERTICAL(1);

	Orientation(int orient) {
		this.orient = orient;
	}

	int orient;
}