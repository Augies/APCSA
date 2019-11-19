package net.cox.augies.school.apcsa.fall.two.tictactoe;

public class TTTGridSpace {
	private boolean isX;
	private boolean isO;
	private boolean isBlank;

	/*
	 * @param option the grid option. 0 for blank. 1 for x. 2 for o.
	 */
	public TTTGridSpace(int option) {
		setX(false);
		setO(false);
		setBlank(false);
		switch (option) {
		case 0:
			setBlank(true);
			break;
		case 1:
			setX(true);
			break;
		case 2:
			setO(true);
			break;
		default:
			System.out.println("Error in initializing TTTGridSpace. Did Option " + option);
			break;
		}
	}

	public String toString() {
		if (isX()) {
			return "X|";
		}
		if (isO()) {
			return "O|";
		}
		return " |";
	}

	public boolean isX() {
		return isX;
	}

	public void setX(boolean isX) {
		this.isX = isX;
	}

	public boolean isO() {
		return isO;
	}

	public void setO(boolean isO) {
		this.isO = isO;
	}

	public boolean isBlank() {
		return isBlank;
	}

	public void setBlank(boolean isBlank) {
		this.isBlank = isBlank;
	}
}
