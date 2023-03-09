package map;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
 
public class coloring {
    
    //Chech if the color for this city is right to have it
    public static boolean isSafe(Node n ,String color){
        PriorityQueue<Node> openList = new PriorityQueue<Node>(20, new Comparator<Node>(){
                //override compare method
                public int compare(Node i, Node j){
                    if(i.pathCost > j.pathCost){ return 1;}
                    else if (i.pathCost < j.pathCost){ return -1; }
                    else{  return 0;  }
                }//end compare
            }//end queue
        );//end queue
        openList.add(n);
         while (!openList.isEmpty()) { 
           Node node = openList.remove();
           for(Edge a: node.adjacencies){
            if(a.target.color==color)
                return false;
             }//end for
          openList.remove(node);
          }//end while
         return true;
    }//end isSafe
    
    //Coloring the graph
    public static void color(Node n,String []colors){
        PriorityQueue<Node> openList = new PriorityQueue<Node>(20, new Comparator<Node>(){
                //override compare method
                public int compare(Node i, Node j){
                    if(i.pathCost > j.pathCost){ return 1;}
                    else if (i.pathCost < j.pathCost){ return -1; }
                    else{  return 0;  }
                }//end compare
            }//end queue
        );//end queue
         
        openList.add(n);
        
        while (!openList.isEmpty()) {
            Node node = openList.remove();
         node.visited=true;
        for(int i=0;i<colors.length;i++){
           if(isSafe(node,colors[i])) {
               node.color=colors[i];
               break;
             } 
           else continue;
           }//end for
        
          //adding nighboors off not visited yet
          for(Edge a: node.adjacencies){ if(!a.target.visited)openList.add(a.target); }
        }//end while
    }//end color
    
}//end class
