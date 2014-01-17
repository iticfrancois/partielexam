package Doan;

import specifications.ChoiceOfThief;

public class Thief implements ChoiceOfThief {

	private int weight[];
	private int limit,first=-1, second=-1, solution=-1, indice=0;
	
	public void setNbObjects(int nbObjects) {
		weight = new int [nbObjects];

	}

	@Override
	public void addObject(int weight) {
		this.weight [indice]=weight;
		indice ++;
		for (int i =0;i<indice-1;i++)
		{
			int nouveauweight= weight[i] + weight[indice+1];
			if (nouveauweight<= limit && nouveauweight>solution)
			{
				solution = nouveauweight;
				first = i;
				second=indice-1;
			}
		}
	}

	@Override
	public void setLimit(int limit) {
		this.limit = limit;

	}

	@Override
	public int getFirstObject() {
		return first+1;
	}

	@Override
	public int getSecondObject() {
		return second;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
