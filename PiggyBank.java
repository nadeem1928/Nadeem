
public class PiggyBank{

  static int totalMoney;
  Coin coin;
  
  public int getTotalMoney(){
	  return totalMoney;
  }
  
  public int depositMoney(int amt){
	      coin = new Coin(amt);
		  if(coin.isDollarCoin()){
			  if((totalMoney+amt)<=2{
				  totalMoney+=amt;
			  }
			  else{
				  resetBank();
			  }
		  }
		  return totalMoney;
  }
		 
   public int resetBank(){
	   if(totalMoney==2){
		   totalMoney=0;
	   }
	   return totalMoney;
   }
   
}