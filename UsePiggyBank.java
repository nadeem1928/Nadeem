public class UsePiggyBank{

public static void main(String[ args){
	PiggyBank piggyBank = new PiggyBank();
	int currentAmount = 0;
	piggyBank.totalMoney=0;
	
	currentAmount = piggyBank.depositMoney(1);
	System.out.println("current amount in piggy bank is "+currentAmount);
	
		currentAmount = piggyBank.depositMoney(1);
	System.out.println("current amount in piggy bank is "+currentAmount);
	
		currentAmount = piggyBank.depositMoney(1);
		if(currentAmount==0){
		}System.out.println("Piggy Bank is full..we have reset the bank for you");
	System.out.println("current amount in piggy bank is "+currentAmount);
}
}