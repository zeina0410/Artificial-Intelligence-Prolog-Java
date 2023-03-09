package map;

import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class map {
    
    public static void main(String[] args) {
        // TODO code application logic here
              //initialize the graph base on the Romania map
              
              
        Node n1 = new Node("Arad",366);
        Node n2 = new Node("Zerind",374);
        Node n3 = new Node("Oradea",380);
        Node n4 = new Node("Sibiu",253);
        Node n5 = new Node("Fagaras",178);
        Node n6 = new Node("Rimnicu Vilcea",193);
        Node n7 = new Node("Pitesti",98);
        Node n8 = new Node("Timisoara",329);
        Node n9 = new Node("Lugoj",244);
        Node n10 = new Node("Mehadia",241);
        Node n11 = new Node("Drobeta",242);
        Node n12 = new Node("Craiova",160);
        Node n13 = new Node("Bucharest",100);
        Node n14 = new Node("Giurgiu",177);
        Node n15 = new Node("Urziceni",80);
        Node n16 = new Node("Hrisova",151);
        Node n17 = new Node("Eforie",161);
        Node n18 = new Node("Vaslui",199);
        Node n19 = new Node("Iasi",226);
        Node n20 = new Node("Neamt",60);
        //initialize the edges
        n1.adjacencies = new Edge[]{
            new Edge(n2,75),
            new Edge(n4,140),
            new Edge(n8,118)
        };

        n2.adjacencies = new Edge[]{
            new Edge(n1,75),
            new Edge(n3,71)
        };

        n3.adjacencies = new Edge[]{
            new Edge(n2,71),
            new Edge(n4,151)
        };

        n4.adjacencies = new Edge[]{
            new Edge(n1,140),
            new Edge(n5,99),
            new Edge(n3,151),
            new Edge(n6,80),
        };

        n5.adjacencies = new Edge[]{
            new Edge(n4,99),
            new Edge(n13,211)
        };

        n6.adjacencies = new Edge[]{
            new Edge(n4,80),
            new Edge(n7,97),
            new Edge(n12,146)
        };

        n7.adjacencies = new Edge[]{
            new Edge(n6,97),
            new Edge(n13,101),
            new Edge(n12,138)
        };

        n8.adjacencies = new Edge[]{
            new Edge(n1,118),
            new Edge(n9,111)
        };

        n9.adjacencies = new Edge[]{
            new Edge(n8,111),
            new Edge(n10,70)
        };

        n10.adjacencies = new Edge[]{
            new Edge(n9,70),
            new Edge(n11,75)
        };

        n11.adjacencies = new Edge[]{
            new Edge(n10,75),
            new Edge(n12,120)
        };

        n12.adjacencies = new Edge[]{
            new Edge(n11,120),
            new Edge(n6,146),
            new Edge(n7,138)
        };

        n13.adjacencies = new Edge[]{
            new Edge(n7,101),
            new Edge(n14,90),
            new Edge(n5,211),
            new Edge(n15,85)
        };

        n14.adjacencies = new Edge[]{
            new Edge(n13,90)
        };
        
        n15.adjacencies = new Edge[]{
            new Edge(n13,85),
            new Edge(n16,98),
            new Edge(n18,142)
        };
        
        n16.adjacencies = new Edge[]{
            new Edge(n17,86),
            new Edge(n15,98)
        };
        
        n17.adjacencies = new Edge[]{
            new Edge(n16,86)
        };
        
        n18.adjacencies = new Edge[]{
            new Edge(n15,142),
            new Edge(n19,92)
        };
        n19.adjacencies = new Edge[]{
            new Edge(n18,92),
            new Edge(n20,87)
        };
        n20.adjacencies = new Edge[]{
            new Edge(n19,87)
        };
        
        algo.traverse(n1);
        algo.display(n1);
        System.out.println(); 
    }
}//end class

  
