package ru.mail.redlin94;

public class Main {

	public static void main(String[] args) {
		Cat myCat = new Cat();

		myCat.setAge(2.3);
		myCat.setColor("Grey.");
		myCat.setHeight(0.15);
		myCat.setLength(0.25);
		myCat.setWeight(6);
		myCat.setWidth(0.07);
		myCat.setName("Vasiliy.");
		myCat.setSort("Big cat.");

		myCat.doMeow();
		myCat.askForFood();

		System.out.println(myCat);

		Cat myNewCat = new Cat(4.3, "Kitkat.", "Small cat.", "Black.", 13.3, 0.3, 0.15, 0.20);

		myNewCat.doMeow();
		System.out.println("Kitkat age is " + myNewCat.getAge());

		System.out.println(myNewCat);
	}

}
