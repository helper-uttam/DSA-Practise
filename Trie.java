public class Trie
{
    public static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        char ch;
        boolean isTerminal;
        //constructor
        TrieNode(char c){
            ch = c;
            isTerminal = false;
        }
    }
    
    public static class Trie{
        TrieNode root;

        Trie(){
            root = new TrieNode('\0');
        }
        
        void insertWordsUtil(TrieNode root, String word){
            if(word.length() == 0) {
                root.isTerminal = true;
                return;
            }
            
            int index = word.charAt(0) - 'A';
            TrieNode child;
            
            if(root.children[index] != null){
                child = root.children[index];
            }else{
                child = new TrieNode(word.charAt(0));
                root.children[index] = child;
            }
            insertWordsUtil(child, word.substring(1));   
        }
        
        boolean searchWordUtils(TrieNode root, String word){
            if(word.length() == 0) return root.isTerminal;
            
            int index = word.charAt(0) - 'A';
            if(root.children[index] != null){
                return searchWordUtils(root.children[index], word.substring(1));
            }else{
                return false;
            }
        }    
        
        void insertWords(String word){
           insertWordsUtil(root, word);
        }
        boolean searchWords(String word){
            return searchWordUtils(root, word);
        }        
    };

	public static void main(String[] args) {
	    Trie f = new Trie();
		f.insertWords("UTTAM");
		f.insertWords("AKSHIT");
		f.insertWords("SOURAV");
		System.out.println(f.searchWords("UTTAM"));
		System.out.println(f.searchWords("SWEEY"));
		System.out.println(f.searchWords("SUHANI"));
	}
}
