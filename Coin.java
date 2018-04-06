
public class Coin{

int value;

public Coin(int value)
{
	this.value= value;
	
}

public boolean isDollarCoin(){
	if((this.value*60)%60 ==0)
	{
		return true;
	}
	return false;
}
}