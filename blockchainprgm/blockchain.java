package blockchainprgm;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.html.BlockView;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class blockchain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi iam yashu";
		int i= str.hashCode();
	//	System.out.println("The statement is "+ str+"  the hash code is " +i);
		String list[]= {"taylor","yash","virat","shawn"};
		int  j= Arrays.hashCode(list);
	//	System.out.println("The list is "+list+" The hash code is "+ j);
		
		ArrayList<block> blockchain = new ArrayList<>();
		
		String[] initialvalues= {"taylor","yash"}; 
		block firstblock = new block(initialvalues,0);
		blockchain.add(firstblock);
		System.out.println("first block is " + firstblock.toString());
	//	System.out.println("block chain is"+blockchain.toString());
		
		String[] secondvalues= {"taylor","yash"}; 
		block secondBlock = new block(secondvalues, firstblock.getBlockhash());
		blockchain.add(secondBlock);
		System.out.println("second block is " + secondBlock.toString());
	//	System.out.println("block chain is"+blockchain.toString());
		
		String[] thirdvalues= {"taylor","yash"}; 
		block thirdBlock = new block(thirdvalues,secondBlock.getBlockhash());
		blockchain.add(thirdBlock);
		System.out.println("first block is " + thirdBlock.toString());
		System.out.println("block chain is"+blockchain.toString());
	}

}
