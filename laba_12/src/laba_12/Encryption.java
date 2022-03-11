package laba_12;


import java.util.Scanner;

public class Encryption {
    public void enc(){
        Scanner scanner = new Scanner(System.in);
        char[] alphabet = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я','-','1','2'};
        char[] newalphabet = new char[alphabet.length];
        char[] word_, neword, text_;
        char z;
        int k = 0, t;
        String word, text;

        System.out.print("Введите слова для зашифровки алфавита: ");
        word = scanner.nextLine();
        System.out.println("\nВы ввели слово: " + word);
        word_ = new char[word.length()];

        for(int i=0;i< word_.length;i++){
            word_[i] = word.charAt(i);
        }

        for(int i=0;i< word_.length;i++){
            for(int j=i+1;j< word_.length;j++){
                if(word_[i] == word_[j]){
                    word_[j] = '0';
                }
            }
        }

        for (int i=0;i< word_.length;i++){
            if(word_[i] == '0'){
                k++;
            }
        }

        for(int i=0;i<word_.length;i++){
            for(int j=i+1;j< word_.length;j++){
                if(word_[i] == '0'){
                    z = word_[j];
                    word_[j] = word_[i];
                    word_[i] = z;
                }
            }
        }

        System.out.print("\nСлово без повторяющихся букв: ");
        neword = new char[word_.length-k];
        for(int i=0;i< neword.length;i++){
            neword[i] = word_[i];
            System.out.print(neword[i]);
        }

        for(int i=0;i< neword.length;i++){
            newalphabet[i] = neword[i];
        }

        System.out.println();
        t = neword.length;
        for(int i=0;i<alphabet.length;i++){
            if(t < newalphabet.length){
                newalphabet[t] = alphabet[i];
                t++;
                for(int j=0;j<neword.length;j++) {
                    if (neword[j] == newalphabet[t-1]) {
                        t--;
                        break;
                    }
                }
            }
        }

        k=0;
        char[][] arrayalphabet = new char[(int)Math.sqrt(newalphabet.length)][(int)Math.sqrt(newalphabet.length)];
        for(int i=0;i<arrayalphabet.length;i++){
            for(int j=0;j< arrayalphabet.length;j++){
                arrayalphabet[i][j] = newalphabet[k];
                k++;
            }
        }

        System.out.println("\nАлфавит со словом для зашифровки и выброшенными символами из этого слова: ");
        for(int i=0;i<arrayalphabet.length;i++){
            for(int j=0;j< arrayalphabet.length;j++){
                System.out.print(arrayalphabet[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Введите слово, которое хотите зашифровать: ");
        text = scanner.nextLine();

        k=0;
        System.out.print("\nВаше слово: ");
        if(text.length()%2!=0){
            text_ = new char[text.length()+1];
            for(int i=0;i<text.length();i++){
                text_[i] = text.charAt(i);
                System.out.print(text_[i]);
            }
            text_[text_.length-1] = 'я';
            System.out.print("\n\nСлово с добавленной буквой, для создания парности символам слова: ");
            for(int i=0;i<text_.length;i++){
                System.out.print(text_[i]);
            }
        }else{
            text_ = new char[text.length()];
            for(int i=0;i<text_.length;i++){
                text_[i] = text.charAt(i);
                System.out.print(text_[i]);
            }
        }

        int[] ind1 = new int[2];
        int[] ind2 = new int[2];
        int b=0,c=0,x=0;
        text = "";
        for(int i=0;i<text_.length;i+=2){
            b=i+1;
            c=0;
            x=0;
            for(int q=0;q<arrayalphabet.length;q++){
                for(int w=0;w< arrayalphabet.length;w++){
                    if(text_[i] == arrayalphabet[q][w]){
                        ind1[c] = q;
                        c++;
                        ind1[c] = w;
                    }
                    c=0;
                    if(text_[b] == arrayalphabet[q][w]){
                        ind2[x] = q;
                        x++;
                        ind2[x] = w;
                    }
                    x=0;
                }
            }
            if(ind1[0] == ind2[0]){
                if(ind1[0] == ind2[0] && ind1[1]==(arrayalphabet.length-1)){
                    text+=arrayalphabet[ind1[0]][0];
                    text+=arrayalphabet[ind2[0]][ind2[1]+1];
                }else if(ind1[0] == ind2[0] && ind2[1]==(arrayalphabet.length-1)){
                    text+=arrayalphabet[ind2[0]][0];
                    text+=arrayalphabet[ind1[0]][ind1[1]+1];
                }else {
                    text += arrayalphabet[ind1[0]][ind1[1] + 1];
                    text += arrayalphabet[ind2[0]][ind2[1] + 1];
                }
            }
            if(ind1[1] == ind2[1]){
                if(ind1[1] == ind2[1] && ind1[0]==(arrayalphabet.length-1)){
                    text+=arrayalphabet[ind2[0]+1][ind2[1]];
                    text+=arrayalphabet[0][ind1[1]];
                }else if(ind1[1] == ind2[1] && ind2[0]==(arrayalphabet.length-1)){
                    text+=arrayalphabet[ind1[0]+1][ind1[1]];
                    text+=arrayalphabet[0][ind2[1]];
                }else {
                    text += arrayalphabet[ind2[0] + 1][ind2[1]];
                    text += arrayalphabet[ind1[0] + 1][ind1[1]];
                }
            }
            if(ind1[0] != ind2[0] && ind1[1] != ind2[1]){
                text+=arrayalphabet[ind1[0]][ind2[1]];
                text+=arrayalphabet[ind2[0]][ind1[1]];
            }
        }
        System.out.println("\nЗашифрованное слово: " + text);


        // ----------------------- РАСШИФРОВКА ----------------------- //

        b=0;
        c=0;
        x=0;
        String backtext = "";
        for(int i=0;i<text.length();i+=2){
            b=i+1;
            c=0;
            x=0;
            for(int q=0;q<arrayalphabet.length;q++){
                for(int w=0;w< arrayalphabet.length;w++){
                    if(text.charAt(i) == arrayalphabet[q][w]){
                        ind1[c] = q;
                        c++;
                        ind1[c] = w;
                    }
                    c=0;
                    if(text.charAt(b) == arrayalphabet[q][w]){
                        ind2[x] = q;
                        x++;
                        ind2[x] = w;
                    }
                    x=0;
                }
            }
            if(ind1[0] == ind2[0]){
                if(ind1[0] == ind2[0] && ind1[1]==0){
                    backtext+=arrayalphabet[ind1[0]][arrayalphabet.length-1];
                    backtext+=arrayalphabet[ind2[0]][ind2[1]-1];
                }else if(ind1[0] == ind2[0] && ind2[1]==0){
                    backtext+=arrayalphabet[ind2[0]][arrayalphabet.length-1];
                    backtext+=arrayalphabet[ind1[0]][ind1[1]-1];
                }else {
                    backtext += arrayalphabet[ind1[0]][ind1[1] - 1];
                    backtext += arrayalphabet[ind2[0]][ind2[1] - 1];
                }
            }
            if(ind1[1] == ind2[1]){
                if(ind1[1] == ind2[1] && ind1[0]==0){
                    backtext+=arrayalphabet[ind2[0]-1][ind2[1]];
                    backtext+=arrayalphabet[arrayalphabet.length-1][ind1[1]];
                }else if(ind1[1] == ind2[1] && ind2[0]==0){
                    backtext+=arrayalphabet[ind1[0]-1][ind1[1]];
                    backtext+=arrayalphabet[arrayalphabet.length-1][ind2[1]];
                }else {
                    backtext += arrayalphabet[ind2[0] - 1][ind2[1]];
                    backtext += arrayalphabet[ind1[0] - 1][ind1[1]];
                }
            }
            if(ind1[0] != ind2[0] && ind1[1] != ind2[1]){
                backtext+=arrayalphabet[ind1[0]][ind2[1]];
                backtext+=arrayalphabet[ind2[0]][ind1[1]];
            }
        }
        System.out.println("\nРасшифрованное слово: " + backtext);
    }
}
