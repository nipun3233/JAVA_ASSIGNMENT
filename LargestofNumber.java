
public class largestnumber { 
		public static void main(String[] args) {
			int[] num = {19,35,46,82,28,72};
			int max = num[0];
			for(int i=0;i<num.length;i++) {
				if(num[i]>max) {
					max = num[i];
				}
			}System.out.println(max);
		}

	}



