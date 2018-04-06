
import java.util.HashMap;
import java.util.Map;

public class CastleBuilding{
	
	public static void main(String[] args){
		
		int[] arr = new int[]{2,6,6,6,3};
	//int[] arr = new int[]{4,1,6};
	int numOfPossibleCastles = 0;
	numOfPossibleCastles = findNumOfPossibleCastles(arr);
	
	System.out.println("number of castles can be built are "+numOfPossibleCastles);
	
	}
	
	private static int findNumOfPossibleCastles(int[] arr){
		Map<Integer, Integer> peaksMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> valleysMap = new HashMap<Integer, Integer>();
		
		int numOfCastles = 0;
		if(arr[0]!=0){
			numOfCastles=1;
		}
		for(int i =1; i<arr.length; i++)
		{
		
        if(arr[i]>=arr[i-1] &&	i+1<arr.length && arr[i]>=arr[i+1]){
         if(!peaksMap.containsKey(arr[i])){
			 peaksMap.put(arr[i],1)
        }		
		}
		if(arr[i]<=arr[i-1] &&	i+1<arr.length && arr[i]<=arr[i+1]){
         if(!valleysMap.containsKey(arr[i])){
			 valleysMap.put(arr[i],1)
        }		
		}
		
	}
	if(peaksMap != null){
		numOfCastles += peaksMap.size();
	}
	if(valleysMap != null){
		numOfCastles += valleysMap.size();
	}
	return numOfCastles;
	
}
}