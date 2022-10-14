

public class Main2 {
        public static void main(String[] args) {
            int x = 3;
            int z = 5;
            int res = 0;
            
            
            
            for(int i = 0; i < 1000; i++){
                if(i % x == 0 || i % z == 0){
                    res += i;
                }
            }
            
            System.out.println("A soma dos multiplos de 3 e 5 abaixo de 1000, é: " +res);
    
        }
    }
    

