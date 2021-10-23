import java.util.Scanner;

public class Main {
    public static class abc{
        int an = 3;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        WeightedGraph graph= new WeightedGraph();

        graph.addNode("A");
        graph.addNode("B");

        graph.addNode("C");
        graph.addNode("D",true);
        graph.addNode("E");

        graph.addEdge("A","B",3);
        graph.addEdge("A","C",4);
        graph.addEdge("A","D",2);
        graph.addEdge("C","D",1);
        graph.addEdge("B","E",1);
        graph.addEdge("D","E",5);
        graph.addEdge("B","D",6);

        int fuel;
        System.out.print("Starting Point : ");
        String start = scan.nextLine();
        System.out.print("Destination : ");
        String end = scan.nextLine();
        System.out.print("Current fuel in Car : ");
        fuel = scan.nextInt();
        String ans ;

        Path path = graph.getShortestPath(start,end);
        System.out.println(path);
        int dist = graph.shortestpathLength(start,end);
        if(dist> fuel){
            System.out.println("We are trying to redirect current path...");
            String redirect = graph.redirectedPath(start,end,fuel);
            System.out.println(redirect);
        }


        //System.out.println(path);
        //graph.print();
    }
}
