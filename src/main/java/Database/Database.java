package Database;

import Entity.School;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public interface Database {
    public void InitializeDb(Object object , Method method);
    public ArrayList<School> getDb();
}
