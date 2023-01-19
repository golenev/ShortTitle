package org.example;

public class ShortTitle {

    public static String getShortTitle(String sourceTitle, int maxLength) {
        String[] words = sourceTitle.split(" ");
        String resultString = "";
        for (int i = 0; i < words.length; i++) {
            if ((resultString.length() + words[i].length()) <= maxLength) {
                resultString += words[i] + " ";
            } else {
                break;
            }
        }
        if (maxLength > 1) {
            if (sourceTitle.length() >= maxLength) {
                return resultString.trim() + "...";
            } else return resultString.trim();
        } else return "";
    }
}

