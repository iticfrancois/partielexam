package Doan;

import moulinette.Moulinette;
import specifications.ChoiceOfThief;
import specifications.CursedTable;
import specifications.Factory;
import specifications.PathOfDoom;
import specifications.WheelOfDeath;

public class Factory1 implements Factory {

	@Override
	public String getNom() {
		return "DOAN François";
	}

	@Override
	public ChoiceOfThief getChoiceOfThief() {
		return new Thief();
	}

	@Override
	public WheelOfDeath getWheelOfDeath() {
		// TODO Auto-generated method stub
		return new WheelOfDeath1();
	}

	@Override
	public PathOfDoom getPathOfDoom() {
		// TODO Auto-generated method stub
		return new PathOfDoom1();
	}

	@Override
	public CursedTable getCursedTable() {
		// TODO Auto-generated method stub
		return new CursedTable1();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Moulinette m = new Moulinette();
		m.addFactory(new Factory1());		
		m.run();

	}

}
