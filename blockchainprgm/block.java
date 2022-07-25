package blockchainprgm;

import java.util.Arrays;

public class block {
	private String[] transaction;
	private int blockhash;
	private int previousblockhash;
	

	@Override
	public String toString() {
		return "block [transaction=" + Arrays.toString(transaction) + ", blockhash=" + blockhash
				+ ", previousblockhash=" + previousblockhash + "]";
	}
	
	
	
	public block(String[] transaction, int previousblockhash) {
		super();
		this.transaction = transaction;
		this.previousblockhash = previousblockhash;
		this.blockhash=Arrays.hashCode(new int[] {Arrays.hashCode(transaction),this.previousblockhash});
	}
	public String[] getTransaction() {
		return transaction;
	}
	public void setTransaction(String[] transaction) {
		this.transaction = transaction;
	}
	public int getBlockhash() {
		return blockhash;
	}
	public void setBlockhash(int blockhash) {
		this.blockhash = blockhash;
	}
	public int getPreviousblockhash() {
		return previousblockhash;
	}
	public void setPreviousblockhash(int previousblockhash) {
		this.previousblockhash = previousblockhash;
	}
		
	
}
