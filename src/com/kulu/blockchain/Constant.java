package com.kulu.blockchain;

public class Constant {
	public Constant() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getDifficulty() {
		return DIFFICULTY;
	}
	public static String getGenesisPrevHash() {
		return GENESIS_PREV_HASH;
	}
	public static double getMinorReward() {
		return MINOR_REWARD;
	}

	private static final int DIFFICULTY = 5;
	private static final String GENESIS_PREV_HASH = "0000000000000000000000000000000000000000000000000000000000000000";
	private static final double MINOR_REWARD = 10;
}
