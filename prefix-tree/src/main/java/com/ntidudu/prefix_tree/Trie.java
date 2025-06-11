package com.ntidudu.prefix_tree;

import java.util.HashMap;

public class Trie {
    
    private final TrieNode root;

    public Trie(){
        this.root = new TrieNode();
    }

    public void insert(String word){
        TrieNode currentNode = root;

        for(char _char : word.toCharArray()){

                if(!currentNode.getChildren().containsKey(_char)){
                    currentNode.getChildren().put(_char, new TrieNode());
            }
                currentNode = currentNode.getChildren().get(_char);


        }

        currentNode.setIs_end_of_word(true);
    }

    public boolean search(String word){
        TrieNode currentNode = root;

        for(char _char : word.toCharArray()){
            if(!currentNode.getChildren().containsKey(_char)){
                return false;
            }
            currentNode = currentNode.getChildren().get(_char);
        }

        return true;
    }

}
