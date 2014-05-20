package study;

public class MyCalc {
	public int myHap(){
		int sum = 0;
		for(int i=0;i<=10;i++){
			sum+=i;
		}
		return sum;
	}
	public int myHap(int start, int end){
		int sum = 0;
		for(int i=start;i<=end;i++){
			sum+=i;
		}
		return sum;
	}
}