package map;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Node {
    public final String name;
    public Edge[] adjacencies;
    public double f=0, g=0, h=0;
    public Node parent = null;
    public double pathCost;
    public String color=null;
    public int nigh=0;
    public boolean visited=false;
    public Node(String n,int heuristic){
        h = heuristic;
        name=n; 
    }

}//end class
