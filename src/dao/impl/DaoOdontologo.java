package dao.impl;

import dao.IDao;
import model.Odontologo;
import org.apache.log4j.Logger;

public class DaoOdontologo implements IDao<Odontologo> {


    public static final Logger logger = Logger.getLogger(DaoOdontologo.class);

    public static final String INSERT = "INSERT INTO ODONTOLOGOS VALUES(DEFAULT,?,?,? )";
    public static final String SELECT_ALL = "SELECT * FROM ODONTOLOGOS";

}
