package entities;

import entities.enums.Color;

public abstract class Shape {  //Classe Abstrata.
	private Color color;

	public Color getColor() {
		return color;
	}
	
	public Shape() {		
	}
	
	
	public Shape(Color color) {		
		this.color = color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area(); // Método Abstrato. obs: Toda classe com método abstrato, tem que ser ela mesma abstrata.
}
