public class Trie {
    public Node root;
    
    public Trie() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        // gets the root node;
        Node currentNode = this.root;
        
        // iterates over every character in the word
        for(int i = 0; i < word.length(); i++) {
            // currentLetter is just the character / letter at the iteration
            Character currentLetter = word.charAt(i);
            // ask if the current letter is in the map of the current node
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }
    
    public void printAllKeys() {
        printAllKeys(this.root, -1);
    }
    
    public void printAllKeys(Node focus, int level) {
        boolean lastPass = true;
        ++level;
        for (Character letter : focus.children.keySet()) {
            if (focus.children.get(letter) != null) {
                tab(level);
                System.out.println("[" + letter + "]");
                printAllKeys(focus.children.get(letter), level);
                lastPass = false;
            }
        }
        if (lastPass) { tab(level); System.out.println("[.isCompleteWord = true]"); }
        
    }
    
    public void tab(int level) {
        for (int i = 0; i < level; ++i) {
            if (i == level - 1) { System.out.print("\\"); }
            else { System.out.print("\t"); }
        }
        if (level > 0) { System.out.print("--->"); }
    }
    
    public boolean isValidPrefix(String prefix) {
        int letterCount = 0;
        Node focus = this.root;
        while (letterCount < prefix.length()) {
            if (focus.children.get(prefix.charAt(letterCount)) != null) {
                focus = focus.children.get(prefix.charAt(letterCount++));
            } else { return false; }
        }
        return true;
    }
    
    public boolean isValidWord(String word) {
        Character letter = word.charAt(0);
        word = word.substring(1);
        Node focus = this.root;
        while (word.length() > 0) {
            if (focus.children.get(letter) != null) {
                focus = focus.children.get(letter);
                letter = word.charAt(0);
                word = word.substring(1);
                System.out.println(letter + "" + "    " + word);
            }
        }
        return focus.children.get(letter).isCompleteWord;
    }
}
