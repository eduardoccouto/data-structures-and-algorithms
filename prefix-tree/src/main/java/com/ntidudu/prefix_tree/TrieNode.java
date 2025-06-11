package com.ntidudu.prefix_tree;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    private boolean is_end_of_word;
    private HashMap<Character, TrieNode> children;
    
    public TrieNode(){
        this.children = new HashMap<Character, TrieNode>();
        this.is_end_of_word = false;
    }

    public boolean isIs_end_of_word() {
        return is_end_of_word;
    }

    public void setIs_end_of_word(boolean is_end_of_word) {
        this.is_end_of_word = is_end_of_word;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(HashMap<Character, TrieNode> children) {
        this.children = children;
    }

}
