package Cipher;

public class Hill{
    public String encrypt(String datas, String keys) {
        int razmermatricy = datas.length();
        char[] vector = new char[razmermatricy];

        char data[] = datas.toCharArray();
        char key[] = keys.toCharArray();

        /* Умножаем */
        for(int i = 0; i < razmermatricy; i++) {
            for(int j = 0; j < razmermatricy; j++) {
                key[j * razmermatricy + i] *= data[i];
            }
        }
        /* Суммируем */
        for(int i = 0; i < razmermatricy; i++) {
            vector[i] = 0;					/* Сначалу нуль */
            for(int j = 0; j < razmermatricy; j++) {
                vector[i] += key[j * razmermatricy + i];
            }
        }
        for(int i = 0; i < razmermatricy; i++) {
            vector[i] = (char)(vector[i] % 26 + 'a');
        }

        return new String(vector);
    }
}
