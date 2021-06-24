
public class While {
	public static void main(String[] args) {
		int[] num = new int[50];
		int i = 1;
		while (i<=50) {
			num[i-1] = i;
			i++;
		}
		i = 1;
		do {
			if (num[i-1]%2==1) {
				num[i-1]+=5;
			}
			i+=1;
		} while (i<=50);
		i = 0;
		int number = 0;
		while (i<50) {
			number = num[i];
			if (number%6==0 & number%4==0) {
				System.out.println("Six!!Four!!");
			} else if (number%6==0) {
				System.out.println("Six!!");
			} else if (number%4==0) {
				System.out.println("Four!!");
			} else {
				System.out.println(number);
			}
			i++;
		}
	}
}
