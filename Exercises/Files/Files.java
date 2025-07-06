package Exercises.Files;

import java.io.*;

public class Files {
    public static void main(String[] args) {
        String data = """
    id,first_name,last_name,email,gender
    1,Fanchette,Williamson,fwilliamson0@github.com,F
    2,Aleksandr,Matts,amatts1@webs.com,M
    3,Maurie,Cordero,mcordero2@google.co.jp,M
    4,Donnajean,Crowson,dcrowson3@google.com.hk,F
    5,Ricardo,Gofton,rgofton4@nytimes.com,M
    6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
    7,Marjorie,Blumsom,mblumsom6@joomla.org,F
    8,Lester,Huyghe,lhuyghe7@jugem.jp,M
    9,Merrily,Stangoe,mstangoe8@tiny.cc,F
    10,Reider,Karel,rkarel9@github.io,M
    11,Dory,Jolliff,djolliffa@wufoo.com,F
    12,Homerus,Averay,haverayb@skyrock.com,M
    13,Alyda,Muglestone,amuglestonec@is.gd,F
    14,Pinchas,Louca,ploucad@google.es,M
    15,Cherin,Eltringham,celtringhame@parallels.com,F
    16,Mufi,Rothert,mrothertf@dropbox.com,F
    17,Jordana,Everex,jeverexg@ucla.edu,F
    18,Belle,Rother,brotherh@auda.org.au,F
    19,Clevie,Sifflett,csiffletti@furl.net,M
    20,Gretchen,Abell,gabellj@1688.com,F
""";
//        try {
//
//            String filePath = "src/data.csv";
//            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
//
//            writer.write(data);
//            writer.close();
//
//            System.out.println("Content successfully written to " + "data.csv");
//        } catch (IOException e) {
//            System.out.println("Here is the message" + e.getMessage());
//        }

        String file = "src/data.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder fileContents = new StringBuilder();
            String line;

            // Skipping the header
            String header = reader.readLine();

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                System.out.println();

                fileContents.append(line).append("\n");
            }

            reader.close();

            System.out.println("Content of the file 'data.csv'");
            System.out.println(fileContents);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
