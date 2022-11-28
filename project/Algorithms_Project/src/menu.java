import java.util.Scanner;
public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int option;
        do
        {
            System.out.println("\n\nCS 33200 Algorithms Project");
            System.out.println("Team: Java Juveniles \nEric Jimenez, Lennon Reyes Jr, Ethan Vogt");
			System.out.println("\nWhich algorithm would you like to simulate?");
			System.out.println("1 = Depth First Search");
			System.out.println("2 = Breadth First Search");
            System.out.println("3 = Prim's Algorithm");
            System.out.println("0 = exit");


			System.out.print("\nOption: ");
            try{
                option = Integer.parseInt(input.nextLine());
        } catch (Exception e){
            option = -1; 
            }
            switch(option)
            {
                case 0: System.out.println("\nGoodbye!"); break;
                case 1: DFS(); break;
                case 2: BFS(); break;
                case 3: Prims(); break;
                default: System.out.println("Invalid Option!"); break;


            }
        }
        while (option != 0);
        input.close();


    }
    public static void DFS()
    {
        System.out.println("This is the DFS Method");
        Scanner inputDFS = new Scanner(System.in);
        int n;
        System.out.print("\nPlease enter the number of elements you want: ");
        n = inputDFS.nextInt();
        int[] arrayDFS = new int[n];

        System.out.print("\nPlease enter the numbers you want to sort: ");
        for (int i = 0; i < n; i++)
        {
            arrayDFS[i] = inputDFS.nextInt();
        }
        System.out.println("The numbers you have entered are: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arrayDFS[i] + " ");
        }


    }
    public static void BFS()
    {
        System.out.println("This is the BFS Method");
        Scanner inputBFS = new Scanner(System.in);
    }

    public static void Prims()
    {
        System.out.println("This is Prim's Algorithm Method");
        Scanner inputPrims = new Scanner(System.in);

    }
}
