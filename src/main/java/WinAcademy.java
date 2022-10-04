import Database.DBInitialization;
import Database.WinAcademyDatabase;
import Entity.*;
import Entity.Class;
import Entity.builders.StudentBuilder;
import Entity.builders.TeacherBuilder;
import util.Date;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class WinAcademy {
    public static void main(String[] args) throws NoSuchMethodException, FileNotFoundException {
        try {
            Properties props = new Properties();
            WinAcademyDatabase db = new WinAcademyDatabase();

            FileInputStream fis = new FileInputStream("C:\\Users\\Youcode\\Desktop\\solidity\\newp\\src\\main\\java\\app.config");
            props.load(fis);
            String methodName = props.getProperty("methodName");
            Method init = DBInitialization.class.getMethod(methodName);
            db.InitializeDb(new DBInitialization(),init);

            Runner runner = new Runner(db);
            runner.run();
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
