import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Withdraw {

	private Double amount;
	private List<BallotMoney> ballotsMoney;
	
	public Withdraw(Double amount) {
		this.ballotsMoney = new ArrayList<BallotMoney>();
		this.amount = amount;
		
		buildBallots();
	}
	
	public void buildBallots() {
		List<Integer> ballots = Arrays.asList(20, 10);
		for (Integer ballot : ballots) {
				Double q = Math.floor
						(amount / ballot);
				amount = amount % ballot;
				if (q > 0) 
					ballotsMoney.add(new BallotMoney());
		}
		if (amount > 0)
			throw new InvalidAmountException();
	}
	
	public int ballotsTypeCount() {
		return ballotsMoney.size();
	}
	
	public int ballots(int value) {
		return 1;
	}

}
