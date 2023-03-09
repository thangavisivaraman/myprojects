package feb;

public class Test {
	public static void main(String[]args) {
		int max=1;
		int min=1;
        for(int i=1;i<=5;i++){
            if(i>max){
                max=i;
            }
            if(i<min) {
            	min=i;
            }
        }
            
            System.out.println(max);
            System.out.println(min);
            
        }
        
    }

	


