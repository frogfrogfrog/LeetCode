package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 42160 on 2016/12/26.
 */
public class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;

    UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
}
