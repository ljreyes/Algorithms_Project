import java.util.ArrayList;
import java.util.LinkedList;
//import package.algorithms.*;


    class graph {
         int vertices;
         LinkedList<Integer> adjList[];

        //method that takes the number of nodes and creates an adjacency list.
        graph(int v) {
            //vertices = v;
            adjList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<Integer>();
            }
        }

        //method for adding an edge to the vertice with its weight.
        void addEdge(int v, int destination, int weight) {
            adjList[v].add(destination, weight);
        }

        // test
        void testPath(int start, int end) {
            int distance = 0;
            System.out.print( start + " (" + distance + "), " );

            int cur;
            do {
                cur = adjList[ start ].getFirst();
                distance += cur;
            } while ( cur != end );
            System.out.println();

        }

    }

    public class matrix {
        public static void main(String args[]) {
            //Creates the graph with 20 nodes.
           int vertices = 20;
            graph matrix = new graph(vertices);

            /*
                A = 0   B = 1   S = 2   K = 3   Y = 4
                N = 5   Q = 6   H = 7   J = 8   D = 9
                X = 10  Z = 11  E = 12  P = 13  T = 14
                F = 15  M = 16  L = 17  U = 18  G = 19
             */

            matrix.addEdge(0, 1, 5);
            matrix.addEdge(0, 5, 5);
            matrix.addEdge(1, 2, 2);
            matrix.addEdge(2, 3, 1);


            matrix.testPath( 0, 3 );
        }
    }
