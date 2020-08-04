package com.qiuqi.mark.common.algstru;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 8/3/20 11:32 AM
 */
public class Graph {
    private ArrayList<String> nodeList;
    private int nodeSize;
    private int edageSize;
    private boolean[] isVisited;

    private int[][] graph;

    public static void main(String[] args){
        String[] arr = {"A","B","C","D","E","F"};
        Graph graph = new Graph(arr.length);
        for(String node:arr){
            graph.addNode(node);
        }
        graph.insertEdge(0,1,1);
        graph.insertEdge(0,3,1);
        graph.insertEdge(1,2,1);
        graph.insertEdge(2,3,1);
        graph.insertEdge(2,4,1);
        graph.insertEdge(2,5,1);
        graph.insertEdge(3,5,1);
        graph.showGraph();
        graph.dfs();
    }

    public Graph(int n){
        nodeSize = n;
        nodeList = new ArrayList<String>(n);
        edageSize = 0;
        graph = new int[n][n];
        isVisited = new boolean[n];

    }

    public void addNode(String node){
        nodeList.add(node);
    }

    public int getNodeIndex(String node){
        return nodeList.indexOf(node);
    }

    public void showGraph(){
        for(int[] link:graph){
            System.out.println(Arrays.toString(link));
        }
    }

    public void insertEdge(int v1, int v2, int weight){
        graph[v1][v2] = weight;
        graph[v2][v1] = weight;
        edageSize++;
    }

    public int firstNeiNode(int i){
        for(int j=0;j<nodeSize;j++){
            if(graph[i][j]>0){
                return j;
            }
        }
        return -1;
    }

    public int nextNeiNode(int v1, int v2){
        for(int j=v2+1;j<nodeSize;j++){
            if(graph[v1][j]>0){
                return j;
            }
        }
        return -1;
    }

    public void dfs(int i){
        System.out.println(nodeList.get(i));
        isVisited[i] = true;
        int w = firstNeiNode(i);
        while (w != -1){
            //当此次递归结束的时候，也就是从该节点出发走到尽头之时；
            if(!isVisited[w]){
                dfs(w);
            }
            //然后回溯到开始结点寻找下一个继续，直到所有都找到尽头
            w = nextNeiNode(i, w);
        }

    }

    public void dfs(){
        //此次重载是为了覆盖无连通图，就是存在完全孤立的结点
        for(int i=0;i<nodeSize;i++){
            if(!isVisited[i]){
                dfs(i);
            }
        }
    }

    public void bfs(){

    }
}
