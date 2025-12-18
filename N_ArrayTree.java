
import java.util.ArrayList;
import java.util.List;
class Node{
    String val;
    List<Node> children;
    public Node(String data){
        this.val=data;
        this.children=new ArrayList<>();
    } 
    public void add(String data){
        this.val=data;
    }
    public void addChild(Node child){
        children.add(child);
    }

}
class N_ArrayTree{
    public static Node ThroneInheritance(String kingName) {
        return new Node(kingName);
        
    }
    
    public static void birth(Node root, String parentName, String childName) {
        if(root==null) {
            return;
        }
        if(root.val.equals(parentName)){
            root.addChild(new Node(childName));
            return;
        }
        for (Node child : root.children) {
            birth(child, parentName, childName);
        }
        
    }
    public static void death(Node root,String name){
        if(root==null) return;
        if(root.val.equals(name)){
            root.add("#");
            return;
        }
        for(Node child: root.children){
            death(child,name);
        }
    }
    
    
    
    public static List<String> getInheritanceOrder(Node root,List<String> list) {
        if(root==null){
            return list;
        }
        if(!root.val.equals("#")){
            list.add(root.val);
        }
        
        for(Node child: root.children){
            getInheritanceOrder(child,list);
        }
        return list;

        
    }
    public static void main(String[] args) {
        Node root=ThroneInheritance("king");
        birth(root,"king","andy");
        birth(root,"king","alice");
        birth(root,"king","bob");
        birth(root,"bob","max");
        List<String> list= new ArrayList<>();
        getInheritanceOrder(root,list);
        System.out.println(list);
        death(root,"alice");
        List<String> res= new ArrayList<>();
        getInheritanceOrder(root,res);
        System.out.println(res);
        
    }
}