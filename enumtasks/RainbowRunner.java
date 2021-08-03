package enumtasks;

enum RainbowColor {
	VIOLET(1), INDIGO(2), BLUE(3), GREEN(4), YELLOW(5), ORANGE(6), RED(7);

	private final int colorCode;

	RainbowColor(int colorCode) {
		this.colorCode = colorCode;
	}

	public int getColorCode() {
		return colorCode;
	}
}

public class RainbowRunner {
	public static void main(String[] args) {
		RainbowColor[] colors = RainbowColor.values();
		for(RainbowColor color: colors) {
			System.out.println("Color code of " + color.name() + " is " + color.getColorCode());
		}
	}
}