package quetion3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class question3 {

        public static void main(String[] args) throws Exception{
//            String line;
//            int count = 0;
//
//            //Opens a file in read mode
//            FileReader file = new FileReader("abc.txt ");
//            BufferedReader br = new BufferedReader(file);
//uik
//            //Gets each line till end of file is reached
//            while((line = br.readLine()) != null) {
//                //Splits each line into words
//                String words[] = line.split("");
//                //Counts each word
//                count = count + words.length;
//
//            }
//
//            System.out.println("Number of words present in given file: " + count);
////            br.close();
//            FileReader fr=new FileReader("/home/tarundeep/IdeaProjects/Assignment2/src/abc.txt");
//            BufferedReader br=new BufferedReader(fr);
//
//            int i;
//            int count=0;
//            while((i=br.read())!=-1){
//                if(i="tarun")
//                    count++;
//                System.out.print(count);
//            }
//            br.close();
//            fr.close();
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the file location");
            String location=sc.nextLine();
            int count = 0;
            System.out.println("enter the searched word");
            String searchWord=sc.nextLine();

            FileReader fr=new FileReader(location);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
                line = reader.readLine();
            }
            reader.close();

            System.out.println("The word '" + searchWord + "' occurs " + count + " times in the file.");
        }
    }



