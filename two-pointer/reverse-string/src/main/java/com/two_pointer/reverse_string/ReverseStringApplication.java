package com.two_pointer.reverse_string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReverseStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseStringApplication.class, args);

		String string = "Eduardo Couto";

		System.out.println(_reverseWord(string));

	}

	public static String reverseWords(String s) {
		int lastSpaceIndex = -1;
		char[] chArray = s.toCharArray(); // transforma em array de caracteres
		int len = s.length(); // resgata o tamanho da string
		for (int strIndex = 0; strIndex <= len; strIndex++) { // percorre do começo da string, enquanto for menor ou
																// igual ao tamanho da string
			if (strIndex == len || chArray[strIndex] == ' ') { // se o index for do tamanho da string, ou se for um
																// espaço
				int startIndex = lastSpaceIndex + 1;
				int endIndex = strIndex - 1;
				while (startIndex < endIndex) {
					char temp = chArray[startIndex];
					chArray[startIndex] = chArray[endIndex];
					chArray[endIndex] = temp;
					startIndex++;
					endIndex--;
				}
				lastSpaceIndex = strIndex;
			}
		}
		return new String(chArray);

	}

	public static String _reverseWord(String s) {

		int ultimo_espaco_vazio = -1;
		char[] _stringArray = s.toCharArray();
		int lenStr = s.length();
		for (int index = 0; index <= s.length(); index++) {
			if (index == lenStr || _stringArray[index] == ' ') {

				int direita = index - 1;
				int esquerda = ultimo_espaco_vazio + 1;

				while (direita > esquerda) {

					char aux = _stringArray[direita];
					_stringArray[direita] = _stringArray[esquerda];
					_stringArray[esquerda] = aux;

					direita--;
					esquerda++;
				}

				ultimo_espaco_vazio = index;

			}

		}
		return new String(_stringArray);

	}

}
