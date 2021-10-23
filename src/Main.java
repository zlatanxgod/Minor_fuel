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
