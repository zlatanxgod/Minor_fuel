import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static class abc{
        int an = 3;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        WeightedGraph graph= new WeightedGraph();

        graph.addNode("A");
        graph.addNode("B",true);
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addNode("F");
        graph.addNode("G");
        graph.addNode("H");
        graph.addNode("I",true);
        graph.addNode("J",true);

        graph.addEdge("A","B",5);
        graph.addEdge("A","C",1);
        graph.addEdge("B","E",60);
        graph.addEdge("C","D",2);
        graph.addEdge("C","G",12);
        graph.addEdge("D","E",3);
        graph.addEdge("E","J",4);
        graph.addEdge("E","I",8);
        graph.addEdge("E","F",1);

        graph.addEdge("G","H",3);
        graph.addEdge("G","F",2);
        graph.addEdge("I","H",4);
        graph.addEdge("I","J",20);
        int choose;

        do {
            System.out.println("\n\t\t\t\t\t\t\t\t**********************************************************************");
            System.out.println("\t\t\t\t\t\t\t\t| Vehicle Routing using Dijkstra algorithm and its analysis using ML |");
            System.out.println("\t\t\t\t\t\t\t\t*********************** MINOR PROJECT 1 ******************************");
            System.out.println("\n\t\t\t\t\t\t\t\t********************** Lets Get Started ******************");
            System.out.println("\t\t\t\t\t\t\t\tPress 1 : Print The Graph On Console ");
            System.out.println("\t\t\t\t\t\t\t\tPress 2 : Find The Shortest Route ");
            System.out.println("\t\t\t\t\t\t\t\tPress 3 : Exit");
            System.out.print("\t\t\t\t\t\t\t\tPlease Select Option From Above: ");
            choose=scan.nextInt();

            switch (choose){
                case 1:
                    graph.print();
                    break;
                case 2:
                    finalDetails(graph);

                   // System.out.println(path);
                    break;
                case  3:
                    break;

                default:
                    System.out.println("Wrong Choice! Please select the correct option");
                    break;

            }
        } while(choose!=3);


//





    }
    public static void finalDetails( WeightedGraph graph) {
        int fuel;
        Scanner scan = new Scanner(System.in);
        System.out.print("Starting Point : ");
        String start = scan.next().toUpperCase();
        System.out.print("Destination : ");
        String end = scan.next().toUpperCase();
        System.out.print("Current fuel in Car : ");
        fuel = scan.nextInt();
        String ans;

        Path path = graph.getShortestPath(start, end);
        System.out.println("************************");
        System.out.println("|         Status       |" );
        System.out.println("|                      |");
        System.out.println("| Source: "+start+"            |");
        System.out.println("| Destination: "+end+"       |");
        System.out.println("| Fuel in the car: "+fuel+" |");
        System.out.println("| Path: "+path+"  |");
        System.out.println("| Distance Covered:          |");
        System.out.println("************************");
        int dist = graph.shortestpathLength(start, end);
        if (dist > fuel) {
            System.out.println("\nWe are trying to redirect current path...");
            String redirect = graph.redirectedPath(start, end, fuel);

            System.out.println("\n*****************************");
            System.out.println("|        New Status        |" );
            System.out.println("|                          |");
            System.out.println("| Source: "+start+"                |");
            System.out.println("| Destination: "+end+"           |");
            System.out.println("| Fuel in the car: "+fuel+"       |");
            System.out.println("| New Path: "+redirect+"  |");
            System.out.println("| Distance Covered:        |");
            System.out.println("*****************************");
            //System.out.println(redirect);
        }
    }
}
