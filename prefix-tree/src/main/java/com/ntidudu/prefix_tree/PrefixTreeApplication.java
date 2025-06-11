package com.ntidudu.prefix_tree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrefixTreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrefixTreeApplication.class, args);

		Trie trie = new Trie();

		trie.insert("carro");
		trie.insert("moto");
		trie.insert("apple");
		trie.insert("ap");


		System.out.println(trie.search("carro"));






	}

}
