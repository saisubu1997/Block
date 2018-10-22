import java.util.*;
public class BlockChain {
    private int prevoiusHash;
    private String[] transactions;
    private int blockHash;
    public BlockChain(int prevoiusHash, String[] transactions) {
        this.prevoiusHash = prevoiusHash;
        this.transactions = transactions;
        Object[] contents = {Arrays.hashCode(transactions),prevoiusHash};
        this.blockHash = Arrays.hashCode(contents);
    }    
    public int getPrevoiusHash() {
        return prevoiusHash;
    }
    public String[] getTransactions() {
        return transactions;
    }
    public int getBlockHash(){
        return blockHash;
    }
    
    ArrayList<BlockChain> blockchain = new ArrayList<>();
    public static void main(String[] args) {
      String[] firstTransactions = {"HI i am sai","i hav 10 bitcoins"};
      BlockChain firstBlock = new BlockChain(0, firstTransactions);
        System.out.println(firstBlock.getBlockHash());
        //SecondBlock
        System.out.println("SecondBLock");
        String[] Transactions2 = {"I need more bit coins","i will barrow another 10 bitcoins"};
      BlockChain Block2 = new BlockChain(firstBlock.getBlockHash(), Transactions2);
        System.out.println(Block2.getBlockHash());
        //ThirdBlock
       System.out.println("ThirdBlock");
        String[] Transactions3 = {"I got enough bit coins","Thankyou"};
      BlockChain Block3 = new BlockChain(Block2.getBlockHash(), Transactions3);
        System.out.println(Block3.getBlockHash());     
    }
}
