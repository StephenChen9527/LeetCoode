package com.nullbugs.easy;

public class Exam824 {

    public String toGoatLatin(String S) {
        String[] split = S.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            switch (split[i].charAt(0)){
                case 'a':;
                case 'e':;
                case 'i':;
                case 'o':;
                case 'u':;
                case 'A':;
                case 'E':;
                case 'I':;
                case 'O':;
                case 'U':
                    sb.append(split[i],1,split[i].length()-1)
                      .append(split[i].charAt(0))
                    ;
                    break;
                default:

                    break;

            }
        }
        return null;
    }
}
