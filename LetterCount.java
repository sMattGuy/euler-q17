public class LetterCount{
	public static void main(String[] args){
		String[] numbers = {"","one","two","three","four","five","six","seven","eight","nine"};
		String[] oddNums = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] prefix = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		//ten = 3
		//hundred and= 10
		//hundred = 7
		//one thousand = 11
		int ans = 0;
		
		/**
		1 to 100
		67 for teens
		46 for prefixes
		36*
		**/
		int temp = 0;
		
		for(int z=0;z<10;z++){
			//start numbers
			for(int i=0;i<numbers.length;i++){
				if(z!=0){
					if(i==0)
						temp = temp + 7 + numbers[z].length();
					else
						temp = temp + 10 + numbers[z].length(); // z hundred and
				}
				temp = temp + numbers[i].length(); //number
				if(z==0)
					System.out.println(numbers[i]+"="+temp);
				else
					System.out.println(numbers[z]+" hundred and "+numbers[i]+"="+temp);
			}
			
			//ten and eleven to nineteen
			for(int i=0;i<oddNums.length;i++){
				if(z!=0){
					temp = temp + 10 + numbers[z].length(); // z hundred and
				}
				temp = temp + oddNums[i].length();
				if(z==0)
					System.out.println(oddNums[i]+"="+temp);
				else
					System.out.println(numbers[z]+" hundred and "+oddNums[i]+"="+temp);
			}
			
			//twentyone to ninety nine;
			for(int i=0;i<prefix.length;i++){
				for(int j=0;j<numbers.length;j++){
					if(z==0)
						temp = temp + (numbers[j].length()+prefix[i].length());
					else
						temp = temp + (numbers[j].length()+prefix[i].length()) + (numbers[z].length()+10);
					if(z==0)
						System.out.println(prefix[i]+" "+numbers[j]+"="+temp);
					else
						System.out.println(numbers[z]+" hundred and "+prefix[i]+" "+numbers[j]+"="+temp);
				}
			}
		}
		
		temp = temp + 11;
		System.out.println(temp);
	}
}