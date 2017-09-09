package ru.mail.redlin94;

public class Cat {
	private double age;
	private String name;
	private String sort;
	private String color;
	private double weight;
	private double length;
	private double height;
	private double width;
	
	public Cat(double age, String name, String sort, String color, double weight, double length, double height, double width) {
		super();
		this.age = age;
		this.name = name;
		this.sort = sort;
		this.color = color;
		this.weight = weight;
		this.length = length;
		this.height = height;
		this.width = width;
	}
	
	public Cat() {
		super();
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void doMeow() {
		System.out.println("Meeeeow!");
	}
	
	public void askForFood() {
		System.out.println("Meow! Meow! Meow! Meow! Meow! Meow! Meow! Meow!");
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + ", sort=" + sort + ", color=" + color + ", weight=" + weight
				+ ", length=" + length + ", height=" + height + ", width=" + width + "]";
	}
	
	
}
