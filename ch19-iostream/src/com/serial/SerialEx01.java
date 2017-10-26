package com.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialEx01 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object2.ser"));

		out.writeObject(new Circle(10, 10, 12.4));
		out.writeObject(new Circle(22, 22, 24.6));
		out.writeObject(new String("String is serializable"));
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("object2.ser"));
		Circle cl1 = (Circle) in.readObject();
		Circle cl2 = (Circle) in.readObject();
		String message = (String) in.readObject();
		in.close();
		
		cl1.showCircleInfo();
		cl2.showCircleInfo();
		System.out.print(message);
	}

}

class Position implements Serializable {
	int x, y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle implements Serializable {
	Position position;
	double radius;

	public Circle(int x, int y, double r) {
		position = new Position(x, y);
		radius = r;
	}

	public void showCircleInfo() {
		System.out.printf("Position : [%d, %d]\n", position.x, position.y);
		System.out.println("radius : " + radius);
	}
}