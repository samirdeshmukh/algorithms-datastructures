/**
 * 
 */
package com.samir.app;

/**
 * @author Samir Deshmukh
 *
 */
public class TowerOfHanoi {

	public static void main(String[] args) {
		solveTowerOfHanoi(3, 'A', 'B', 'C');
	}

	/**
	 * solves the tower of hanoi problem recursively
	 * 
	 * @param height - number of disks
	 * @param sourcePeg - source peg
	 * @param auxPeg - auxiliary peg
	 * @param destPeg - destination peg
	 */
	public static void solveTowerOfHanoi(int height, char sourcePeg, char auxPeg, char destPeg) {

		// if there is only one disk move it right away
		if (height == 1) {
			System.out.println("Move disk 1 from peg " + sourcePeg + " to peg " + destPeg);
			return;
		}

		// Move height-1 from source from auxiliary using destination peg
		solveTowerOfHanoi(height - 1, sourcePeg, destPeg, auxPeg);

		// Move remaining disk from source to destination peg
		System.out.println("Move a disk from peg " + sourcePeg + " to peg " + destPeg);

		// Move height-1 from auxiliary to destination peg
		solveTowerOfHanoi(height - 1, auxPeg, sourcePeg, destPeg);

	}
}
