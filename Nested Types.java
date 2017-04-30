public class Passenger implements Comparable {
	// others memvers elided for clarity

	public static class RewardProgram {
		private int memberLevel;
		private int memberDays;

		public int getLevel() { return level; }
		public void setLevel(int level) {this.level - level; }

		public int getMemberDays() {return memberDays; }
		public void setMemberDays(int days) { this.memberDays = days; } 
	}
	private RewardProgram rewardProgram = new RewardProgram();
	public RewardProgram getRewardProgram() {
		return rewardProgram;
	}
}