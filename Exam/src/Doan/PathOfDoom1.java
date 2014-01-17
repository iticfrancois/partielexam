package Doan;

import specifications.PathOfDoom;

public class PathOfDoom1 implements PathOfDoom {

	private int Path [];
	private int indice=0;
	@Override
	public void setLength(int length) {
		Path = new int[length];
	}

	@Override
	public void addStep(int step) {
		Path[indice]=step;
		indice++;
	}

	@Override
	public int[] path() {
		int i = 0;
		int j = Path.length-1;
		while (i<j)
		{
			int temp=Path[i];
			Path[i]=Path[j];
			Path[j]=temp;
			i++;
			j--;
		}
		for (int i2=0;i2<Path.length;i2++)
			switch(Path[i2])
			{
			case LEFT:Path[i2]=RIGHT;break;
			case RIGHT : Path [i2] = LEFT;break;
			default:break;
			}
		return Path;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
