package dao.impl;

import org.apache.log4j.Logger;

public class DaoH2Odontologo {

    public static final Logger logger = Logger.getLogger(DaoH2Odontologo.class);
    public static final String INSERT = "INSERT INTO PACIENTES VALUES(DEFAULT,?,?,?,?,? )";
    public static final String SELECT_ID = "SELECT * FROM PACIENTES WHERE ID = ?";

}
