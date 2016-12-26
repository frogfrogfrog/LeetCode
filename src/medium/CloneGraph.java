package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 42160 on 2016/12/26.
 */
public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return cloneNodeDFS(new HashMap<Integer, UndirectedGraphNode>(), node);
    }

    public UndirectedGraphNode cloneNodeDFS(Map<Integer, UndirectedGraphNode> map, UndirectedGraphNode node) {
        if (node == null)
            return null;
        if (map.containsKey(node.label))
            return map.get(node.label);
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            newNode.neighbors.add(cloneNodeDFS(map, neighbor));
        }
        return newNode;
    }
}
