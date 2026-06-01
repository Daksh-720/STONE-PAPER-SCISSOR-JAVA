import java.util.*;




public class RPS_game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
       
        System.out.println("\n===========ROCK_PAPERS_SCISSORS============");

        System.out.println("Select numbers: ");
        System.out.println("1. ROCK");
        System.out.println("2. PAPERS");
        System.out.println("3. SCISSORS");
        System.out.print("=========/ Your-Turn /=========");
        System.out.println();

        int n;

        while(true){
        System.out.print("Choose a number for Element: ");
        n = sc.nextInt();

            switch (n) {
            case 1: System.out.println("\n======You Chose ROCK======");
            break;
            case 2: System.out.println("\n======You Chose PAPERS======");
            break;
            case 3: System.out.println("\n=======You Chose SCISSORS=======");
            break;
        
            default: System.out.println("\n~~~~~~~INVALID CHOICE~~~~~~~\n");
            continue;
        }
        break;
     }
    sc.close();
    

    System.out.print("\nCOMPUTER IS THINKING..");

    for(int i=1; i<=5; i++){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("\n-----YOU DISTURBED COMPUTER WHILE THINKING-----");
        }

        System.out.print(".");
    }
    System.out.println();



    int ComputerChoice = r.nextInt(3)+1;

    switch(ComputerChoice){
         case 1: System.out.println("\n======Computer Chose ROCK======\n");
            break;
            case 2: System.out.println("\n======Computer Chose PAPERS======\n");
            break;
            case 3: System.out.println("\n=======Computer Chose SCISSORS=======\n");
            break;
        
            default: System.out.println("\n~~~~~~~INVALID CHOICE~~~~~~~\n");
            break;
    }

    
    if(n == ComputerChoice){
        System.out.println("=======It's A DRAW=======");
    }
    else if((n==1 && ComputerChoice==3) || (n==2 && ComputerChoice==1) || (n==3 && ComputerChoice==2)){
        System.out.println("==========/ YOU WON /============");
    }
    else{
        System.out.println("=======/ COMPUTER WON /=======");
    }

   }
    
}
