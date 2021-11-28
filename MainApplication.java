package food_method;

public class MainApplication {
	public static void main(String[] args) throws Exception {
	Food[] breakfast = new Food[20];
	int itemsSoFar = 0;
	for (String arg: args) {
	String[] parts = arg.split("/");
	if (parts[0].equals("Cheese")) {
	breakfast[itemsSoFar] = new Cheese();
	} else if (parts[0].equals("Apple")) {
	breakfast[itemsSoFar] = new Apple(parts[1]);
	}
	itemsSoFar++;
	}
	for (Food item: breakfast)
	if (item!=null)
	item.consume();
	else
	break;
	System.out.println("Всего хорошего!");
	}
	}

