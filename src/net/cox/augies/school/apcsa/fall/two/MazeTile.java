package net.cox.augies.school.apcsa.fall.two;

public class MazeTile {
	private boolean isTreasure;
	private boolean isBlocked;

	MazeTile(boolean isTreasure, boolean isBlocked) {
		if (isTreasure && isBlocked) {
			System.out.println("Error: Treasure Generated in Inaccessible Tile! Proceeding...");
		}
		this.setBlocked(isBlocked);
		this.setTreasure(isTreasure);
	}

	public String toString() {
		if (isTreasure() && !isBlocked()) {
			return " * ";
		} else if (isBlocked()) {
			return "[ ]";
		} else {
			return "   ";
		}
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public boolean isTreasure() {
		return isTreasure;
	}

	public void setTreasure(boolean isTreasure) {
		this.isTreasure = isTreasure;
	}
}
