package map;

import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class algo implements Comparable<algo> {
   public static String []colors={"Red","Blue","Yellow","Green","Pink"};
    //to travel all the graph from the staring node in A* way
    public static Void traverse(Node start){
        
         PriorityQueue<Node> openList = new PriorityQueue<Node>(20, new Comparator<Node>(){
                //override compare method
                public int compare(Node i, Node j){
                    if(i.pathCost > j.pathCost){ return 1;}
                    else if (i.pathCost < j.pathCost){ return -1; }
                    else{  return 0;  }
                }//end compare
            }//end queue
        );//end queue
         
           PriorityQueue<Node> closedList = new PriorityQueue<Node>(20, new Comparator<Node>(){
                //override compare method
                public int compare(Node i, Node j){
                    if(i.pathCost > j.pathCost){ return 1;}
                    else if (i.pathCost < j.pathCost){ return -1; }
                    else{  return 0;  }
                }//end compare
            }//end queue
        );//end queue
         
        start.f = start.pathCost + start.h;
        
        openList.add(start);
        
        while (!openList.isEmpty()) { 
            
            Node node = openList.remove();
           
            for(Edge a: node.adjacencies){
                
                Node m = a.target;
                double pathCost = node.g + a.cost;
                 node.nigh++;
                
                if (!openList.contains(m) && !closedList.contains(m)) {
                    m.parent = node;
                    m.g = pathCost;
                    m.f = m.g + m.h;
                    coloring.color(m,colors);
                    openList.add(m);
                    
                } 
                else {
                    
                    if (pathCost < m.g) {
                        m.parent = node;
                        m.g = pathCost;
                        m.f = m.g + m.h;
                        coloring.color(m,colors);
                        openList.add(m);
                        
                        if (closedList.contains(m)) {
                            closedList.remove(m);
                            openList.add(m);
                        }
                    }
                }  
            }
            
            openList.remove(node);
            closedList.add(node);          
        }  
        return null;
        
    }//end travers
    
    
    static public void display(Node n){
     PriorityQueue<Node> openList = new PriorityQueue<Node>(20, new Comparator<Node>(){
                //override compare method
                public int compare(Node i, Node j){
                    if(i.pathCost > j.pathCost){ return 1;}
                    else if (i.pathCost < j.pathCost){ return -1; }
                    else{  return 0;  }
                }//end compare
            }//end queue
        );//end queue
         
           PriorityQueue<Node> closedList = new PriorityQueue<Node>(20, new Comparator<Node>(){
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
            
            System.out.println("The city << "+node.name +" >>");
            System.out.println("Colored in { "+node.color +" } and has the nighboors: " );
            for(Edge a: node.adjacencies){ 
                Node m = a.target;
                System.out.print(a.target.name+"    ");
                if (!openList.contains(m) && !closedList.contains(m))  {
                            closedList.remove(m);
                            openList.add(m);
                        }
                }
          
            System.out.println();
            openList.remove(node);
            closedList.add(node);          
        }
           
    }//end display
   
}//end class