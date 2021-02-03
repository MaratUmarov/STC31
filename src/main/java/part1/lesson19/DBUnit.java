package part1.lesson19;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUnit {
    DBUnit() {
    }

    public  void createDB(Connection connection) throws SQLException {

        try (Statement statement = connection.createStatement ()) {
            statement.execute ( "drop  table IF EXISTS Taxi,Passengers,Orders,Location_adress ;\n"
                    + "create table Taxi\n" +
                    "(\n" +
                    "id_Taxi  int not null constraint Taxi_id_pk Primary key,\n" +
                    "car varchar ,\n" +
                    "model varchar ,\n" +
                    "gosnumber varchar\n" +
                    "\n" +
                    ");\n" +
                    "\n" +
                    "create table Passengers\n" +
                    " (\n" +
                    " pass_id integer  not null constraint pass_id_pk Primary key,\n" +
                    "\t Name_pass varchar  not null\n" +
                    "\n" +
                    " );\n" +
                    "\n" +
                    "  create table Location_adress\n" +
                    "  (\n" +
                    "  loc_id int  constraint loc_ID_pk primary key,\n" +
                    "\t  point_Name varchar not null\n" +
                    "  );\n" +
                    "\n" +
                    "  create table Orders\n" +
                    "  (\n" +
                    "  id_order int constraint order_ID_pk primary key,\n" +
                    "\t  Point_from varchar not null,\n" +
                    "\t  Point_to varchar not null,\n" +
                    "\tdate date,\n" +
                    "\t  order_sum int,\n" +
                    "\t  id_pass int  constraint order_pass_id_fk references Passengers,\n" +
                    "\t  id_taxi int  constraint order_id_Taxi_fk references Taxi\n" +
                    "  );\n" +
                    "\n" +
                    "  insert into taxi(id_Taxi,car,model,gosnumber)\n" +
                    "  values\n" +
                    "  (1,'Renault','Logan','A526PC116'),\n" +
                    "  (2,'Chevrolet','Cruze','B001AT116'),\n" +
                    "  (3,'BMW','3series','B525XM116'),\n" +
                    "  (4,'BMW','5series','A111PC116'),\n" +
                    "  (5,'Renault','Duster','C654PP77'),\n" +
                    "  (6,'Renault','Logan','Н291ПП116'),\n" +
                    "  (7,'Chevrolet','Cobalt','Л073ВА116');\n" +
                    "\n" +
                    "  insert into passengers (pass_id,name_pass)\n" +
                    "values\n" +
                    "(1,'Иванов'),\n" +
                    "(2,'Ковалева'),\n" +
                    "(3,'Сидоров'),\n" +
                    "(4,'Гатаулин'),\n" +
                    "(5,'Скворцова');\n" +
                    "\n" +
                    "insert into location_adress(loc_id,Point_name)\n" +
                    "values\n" +
                    "(1,'Point_A'),\n" +
                    "(2,'Point_B'),\n" +
                    "(3,'Point_C');\n" +
                    "\n" +
                    "insert into Orders(id_order,Point_from,Point_to,date,order_sum,id_pass,id_taxi)\n" +
                    "values\n" +
                    "(1,'Point_A','Point_B','2020-03-12',100,3,1),\n" +
                    " (2,'Point_B','Point_C','2020-04-02',120,2,2),\n" +
                    " (3,'Point_C','Point_B','2020-07-11',120,1,3),\n" +
                    "  (4,'Point_A','Point_C','2020-03-12',200,5,4);" );

        }


    }

}
