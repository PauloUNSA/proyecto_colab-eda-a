public class Main  {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hola");
        System.out.println(trie.search("hola"));
    }
}
