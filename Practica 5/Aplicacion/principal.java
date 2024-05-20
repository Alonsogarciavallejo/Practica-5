package Aplicacion;
import Matematicas.graph;
import java.util.List;
import java.util.ArrayList;

public class principal{


public static void main(String[] args) throws Exception {
    graph<Integer> g = new graph<>();
    g.addEdge(1, 2);
    g.addEdge(1, 5);
    g.addEdge(2, 3);
    g.addEdge(3, 4);
    g.addEdge(5, 4);

    List<Integer> expectedPath = new ArrayList<>();
    expectedPath.add(1);
    expectedPath.add(5);
    expectedPath.add(4);

    System.out.println("Grafo:");
    System.out.println(g);

    System.out.println("Camino más corto entre 1 y 4:");
    System.out.println(g.shortestPath(1, 4)); // Esto debería imprimir null ya que el método shortestPath aún no está implementado.
}
}
