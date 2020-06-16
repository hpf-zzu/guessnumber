package com.twschool.practice;

public class Main {

        private static final int RUN_TIMES = 6;

        public static void main(String[] args) throws Exception {
            for (int i = 0; i < RUN_TIMES; i++) {
                String input = new GuessNumber().input();
                System.out.println(input);

                if(input.length() == 4) {
                    int[] answer = {1,2,3,4};

                    int[] array = new GuessNumber().toArray(input);
                    int intAnumber = new GuessNumber().getSameAnumber(array, answer);
                    int intBnumber = new GuessNumber().getSameBnumber(new GuessNumber().getSameCount(array, answer),
                            new GuessNumber().getSameAnumber(array, answer));
                    String output = new GuessNumber().printAnswer(intAnumber, intBnumber);
                    System.out.println(output);
                }else{
                    System.out.println("input four number!");
                }
            }


        }
    }



