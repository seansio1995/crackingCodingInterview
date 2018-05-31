package TreeAndGraph;
// dfs and bfs in Graph
public class searching {
    void dfs(Node root){
        if(root==null) return;

        visit(root);
        root.visited=true;
        for each (Node n in root.adjacent){
            if(n.visited==false) {
                dfs(n);
            }
        }
    }


    void bfs(Node root){
        Queue q=new Queue();
        root.marked=true;

        q.enqueue(root);

        while(!q.isEmpty()){
            Node r=q.dequeue();
            visit(r);
            foreach(Node n in r.adjacent){
                if(n.marked==false){
                    n.marked=true;
                    q.enqueue(n);
                }
            }
        }

    }
}
