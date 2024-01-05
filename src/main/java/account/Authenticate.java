/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author kir7
 */
public class Authenticate extends User {
    public static boolean valDOB(String DOB){   //validates the date of birth
        DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        dateformat.setLenient(false);
        try{
            date = dateformat.parse(DOB);
            return true;
        }
        catch(Exception e){
        return false;
        }
    }
        public boolean unameVal() throws FileNotFoundException, IOException{
        File file = new File("user.txt"); // new file instance
        if(!file.exists()){ //creates file if doesnt exist
            file.createNewFile();
        }
        Scanner fileReader = new Scanner(file); //scanner instance to read file
        while(fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            String[] value = line.split("_");    //split on "_"
            if(uname.equals(value[7])){
                return true;
            }
        }
        return false;
    }
        
}
