package admin;

import menuBar.MenuBarControl;
import profileView.Info;
import profileView.ProfileView;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;
import database.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;



public class Admin implements Initializable {


    @FXML
    TableView<AdminTable> adminTableView;
    @FXML
    TableColumn<AdminTable,Integer> adminTableStudentNo;
    @FXML
    TableColumn<AdminTable,String> adminTableStudentName;
    @FXML
    TableColumn<AdminTable,String> adminTableStudentID;
    @FXML
    TableColumn<AdminTable,String> adminTableStudentDepartment;
    @FXML
    TableColumn<AdminTable,Double> adminTableStudentCGPA;
    @FXML
    TableColumn<AdminTable,String> adminTableStudentPhone;
    @FXML
    TableColumn<AdminTable,String> adminTableStudentDOB;
    @FXML
    TableColumn<AdminTable,String> adminTableStudentPassword;
    @FXML
    TableColumn<AdminTable,String> adminTableGuardianName;
    @FXML
    TableColumn<AdminTable,String> adminTableGuardianEmail;
    @FXML
    TableColumn<AdminTable,String> adminTableGuardianPhone;
    @FXML
    TableColumn<AdminTable,String> adminTableStudentAddress;




    @FXML
    private Button adminClearButtonClick;
    @FXML
    private Button adminSaveButtonClick;



    @FXML
    private TextField adminTFStudentFname;
    @FXML
    private TextField adminTFStudentLname;
    @FXML
    private TextField adminTFStudentID;
    @FXML
    private ChoiceBox adminCBStudentDepartment;
    @FXML
    private TextField adminTFStudentEmail;
    @FXML
    private TextField adminTFStudentPhone;
    @FXML
    private TextField adminTFStudentAddress;
    @FXML
    private DatePicker adminDPStudentDOB;
    @FXML
    private TextField adminTFStudentPassword;    
    @FXML
    private TextField adminTFGuardianFname;
    @FXML
    private TextField adminTFGuardianLname;
    @FXML
    private TextField adminTFGuardianEmail;
    @FXML
    private TextField adminTFGuardianPhone;
    @FXML
    private TextField adminTFSearch;
    
    @FXML
    private TextField adminTFS1SemGpa;

    @FXML
    private TextField adminTFS2SemGpa;

    @FXML
    private TextField adminTFS3SemGpa;

    @FXML
    private TextField adminTFS4SemGpa;

    @FXML
    private TextField adminTFS5SemGpa;

    @FXML
    private TextField adminTFS6SemGpa;

    @FXML
    private TextField adminTFS7SemGpa;

    @FXML
    private TextField adminTFS8SemGpa;

    @FXML
    private TextField adminTFS9SemGpa;

    @FXML
    private TextField adminTFS10SemGpa;

    @FXML
    private TextField adminTFS11SemGpa;

    @FXML
    private TextField adminTFS12SemGpa;

    @FXML
    private TextField adminTFSCgpa;

    
   
    private DBConnection database = new DBConnection();
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    private boolean isSetAdminAddNewButtonClick;
    private boolean isSetAdminEditButtonClick;
    private MenuBarControl menuBarControl = new MenuBarControl();

    private String temp;




    /*private ObservableList<AdminTable> adminTableData = FXCollections.observableArrayList(

            //Make a Observable List from adminTable by creating an Object
            //This Observable List can take data with every Property
            */



    private ObservableList getDataFromSqlAndAddToObservableList(String query){
        ObservableList<AdminTable> adminTableData = FXCollections.observableArrayList();
        try {

            connection = database.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);//"SELECT * FROM students;"
            while(resultSet.next()){
                adminTableData.add(new AdminTable(
                        resultSet.getInt("dbStudentSerialNo"),
                        resultSet.getString("dbStudentFname")+" "+resultSet.getString("dbStudentLname"),
                        resultSet.getString("dbStudentID"),
                        resultSet.getString("dbStudentDepartment"),
                        resultSet.getDouble("dbStudentCgpa"),
                        resultSet.getString("dbStudentPhone"),
                        resultSet.getString("dbStudentDOB"),
                        resultSet.getString("dbStudentPassword"),
                        resultSet.getString("dbGuardianFname")+" "+resultSet.getString("dbGuardianLname"),
                        resultSet.getString("dbGuardianEmail"),
                        resultSet.getString("dbGuardianPhone"),
                        resultSet.getString("dbStudentAddress"),
                        resultSet.getString("dbStudent1SemGpa"),
                        resultSet.getString("dbStudent2SemGpa"),
                        resultSet.getString("dbStudent3SemGpa"),
                        resultSet.getString("dbStudent4SemGpa"),
                        resultSet.getString("dbStudent5SemGpa"),
                        resultSet.getString("dbStudent6SemGpa"),
                        resultSet.getString("dbStudent7SemGpa"),
                        resultSet.getString("dbStudent8SemGpa"),
                        resultSet.getString("dbStudent9SemGpa"),
                        resultSet.getString("dbStudent10SemGpa"),
                        resultSet.getString("dbStudent11SemGpa"),
                        resultSet.getString("dbStudent12SemGpa"),
                        resultSet.getString("dbStudentCgpa")
                        
                        

                        ));
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adminTableData;

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        //1st initially get all data from MySQL server
        //And set it to Observable arrayList
        //getDataFromSqlAndAddToObservableList();


        //Get data from adminTableData ObservableList and set thus data on JavaFX table column

        adminTableStudentNo.setCellValueFactory(new PropertyValueFactory<AdminTable,Integer>("adminTableDataNo")); // Point JavaFX adminTableStudentNo column at AdminTable's adminTableDataNo variable Property
        adminTableStudentName.setCellValueFactory(new PropertyValueFactory<AdminTable, String>("adminTableDataStudentName"));
        adminTableStudentID.setCellValueFactory(new PropertyValueFactory<AdminTable, String>("adminTableDataStudentID"));
        adminTableStudentDepartment.setCellValueFactory(new PropertyValueFactory<AdminTable, String>("adminTableDataStudentDepartment"));
        adminTableStudentCGPA.setCellValueFactory(new PropertyValueFactory<AdminTable, Double>("adminTableDataStudentCGPA"));
        adminTableStudentPhone.setCellValueFactory(new PropertyValueFactory<AdminTable, String>("adminTableDataStudentPhone"));
        adminTableStudentDOB.setCellValueFactory(new PropertyValueFactory<AdminTable, String>("adminTableDataStudentDOB"));
        adminTableStudentPassword.setCellValueFactory(new PropertyValueFactory<AdminTable,String>("adminTableDataStudentPassword"));
        adminTableGuardianName.setCellValueFactory(new PropertyValueFactory<AdminTable, String>("adminTableDataGuardianName"));
        adminTableGuardianEmail.setCellValueFactory(new PropertyValueFactory<AdminTable, String>("adminTableDataGuardianEmail"));
        adminTableGuardianPhone.setCellValueFactory(new PropertyValueFactory<AdminTable, String>("adminTableDataGuardianPhone"));
        adminTableStudentAddress.setCellValueFactory(new PropertyValueFactory<AdminTable, String>("adminTableDataStudentAddress"));
        
        

        adminTableView.setItems(getDataFromSqlAndAddToObservableList("SELECT * FROM student;"));//Point JavaFX table at adminTableData ObservableList

    }


    @FXML
    private void setAdminAddNewButtonClick(Event event){
        adminSetAllEnable();
        isSetAdminAddNewButtonClick = true;
    }

    private void adminSetAllEnable(){
        adminTFStudentFname.setDisable(false);
        adminTFStudentLname.setDisable(false);
        adminTFStudentID.setDisable(false);
        adminCBStudentDepartment.setDisable(false);
        adminTFStudentEmail.setDisable(false);
        adminTFStudentPhone.setDisable(false);
        adminTFStudentAddress.setDisable(false);
        adminDPStudentDOB.setDisable(false);
        adminTFStudentPassword.setDisable(false);
        adminTFGuardianFname.setDisable(false);
        adminTFGuardianLname.setDisable(false);
        adminTFGuardianEmail.setDisable(false);
        adminTFGuardianPhone.setDisable(false);
        adminTFS1SemGpa.setDisable(false);
        adminTFS2SemGpa.setDisable(false);
        adminTFS3SemGpa.setDisable(false);
        adminTFS4SemGpa.setDisable(false);
        adminTFS5SemGpa.setDisable(false);
        adminTFS6SemGpa.setDisable(false);
        adminTFS7SemGpa.setDisable(false);
        adminTFS8SemGpa.setDisable(false);
        adminTFS9SemGpa.setDisable(false);
        adminTFS10SemGpa.setDisable(false);
        adminTFS11SemGpa.setDisable(false);
        adminTFS12SemGpa.setDisable(false);
        adminTFSCgpa.setDisable(false);


        adminSaveButtonClick.setDisable(false);
        adminClearButtonClick.setDisable(false);

    }


    private void adminSetAllDisable(){
        adminTFStudentFname.setDisable(true);
        adminTFStudentLname.setDisable(true);
        adminTFStudentID.setDisable(true);
        adminCBStudentDepartment.setDisable(true);
        adminTFStudentEmail.setDisable(true);
        adminTFStudentPhone.setDisable(true);
        adminTFStudentAddress.setDisable(true);
        adminDPStudentDOB.setDisable(true);
        adminTFStudentPassword.setDisable(true);
        adminTFGuardianFname.setDisable(true);
        adminTFGuardianLname.setDisable(true);
        adminTFGuardianEmail.setDisable(true);
        adminTFGuardianPhone.setDisable(true);
        adminTFS1SemGpa.setDisable(true);
        adminTFS2SemGpa.setDisable(true);
        adminTFS3SemGpa.setDisable(true);
        adminTFS4SemGpa.setDisable(true);
        adminTFS5SemGpa.setDisable(true);
        adminTFS6SemGpa.setDisable(true);
        adminTFS7SemGpa.setDisable(true);
        adminTFS8SemGpa.setDisable(true);
        adminTFS9SemGpa.setDisable(true);
        adminTFS10SemGpa.setDisable(true);
        adminTFS11SemGpa.setDisable(true);
        adminTFS12SemGpa.setDisable(true);
        adminTFSCgpa.setDisable(true);


        adminSaveButtonClick.setDisable(true);
        adminClearButtonClick.setDisable(true);

    }


    @FXML
    private void setAdminSaveButtonClick(Event event){
        try{
            connection = database.getConnection();
            statement = connection.createStatement();

            if(isSetAdminAddNewButtonClick){
                int rowsAffected = statement.executeUpdate("insert into student "+
                        "(dbStudentFname,dbStudentLname,dbStudentID,dbStudentDOB,dbStudentPassword,dbStudentDepartment,dbStudentEmail,dbStudentPhone,"
                        + "dbStudentAddress,dbGuardianFname,dbGuardianLname,dbGuardianEmail,dbGuardianPhone,dbStudent1SemGpa,dbStudent2SemGpa,"
                        + "dbStudent3SemGpa,dbStudent4SemGpa,dbStudent5SemGpa,dbStudent6SemGpa,dbStudent7SemGpa,dbStudent8SemGpa,dbStudent9SemGpa,"
                        + "dbStudent10SemGpa,dbStudent11SemGpa,dbStudent12SemGpa,dbStudentCgpa)"+
                        "values ('"+adminTFStudentFname.getText()+"','"+adminTFStudentLname.getText()+"','"+adminTFStudentID.getText()
                        +"','"+adminDPStudentDOB.getValue()
                        +"','"+adminTFStudentPassword.getText()
                        +"','"+adminCBStudentDepartment.getValue().toString().trim()
                        +"','"+adminTFGuardianEmail.getText()
                        +"','"+adminTFStudentPhone.getText()
                        +"','"+adminTFStudentAddress.getText()
                        +"','"+adminTFGuardianFname.getText()
                        +"','"+adminTFGuardianLname.getText()
                        +"','"+adminTFGuardianEmail.getText()
                        +"','"+adminTFGuardianPhone.getText()
                        +"','"+adminTFS1SemGpa.getText()
                        +"','"+adminTFS2SemGpa.getText()
                        +"','"+adminTFS3SemGpa.getText()
                        +"','"+adminTFS4SemGpa.getText()
                        +"','"+adminTFS5SemGpa.getText()
                        +"','"+adminTFS6SemGpa.getText()
                        +"','"+adminTFS7SemGpa.getText()
                        +"','"+adminTFS8SemGpa.getText()
                        +"','"+adminTFS9SemGpa.getText()
                        +"','"+adminTFS10SemGpa.getText()
                        +"','"+adminTFS11SemGpa.getText()
                        +"','"+adminTFS12SemGpa.getText()
                        +"','"+adminTFSCgpa.getText()
                        

                        +"'); ");
                
                statement.executeUpdate("insert into studentgpa (dbstudentgpaID) VALUES ('"+adminTFStudentID.getText()+"')");
                
            }
            else if (isSetAdminEditButtonClick){

                int rowsAffected = statement.executeUpdate("update student set "+
                        "dbStudentFname = '"+adminTFStudentFname.getText()+"',"+
                        "dbStudentLname = '"+adminTFStudentLname.getText()+"',"+
                        "dbStudentID = '"+adminTFStudentID.getText()+"',"+
                        "dbStudentDOB = '"+adminDPStudentDOB.getValue()+"',"+
                        "dbStudentPassword = '"+adminTFStudentPassword.getText()+"',"+
                        "dbStudentDepartment = '"+adminCBStudentDepartment.getValue().toString().trim()+"',"+
                        "dbStudentEmail = '"+adminTFStudentEmail.getText()+"',"+
                        "dbStudentPhone = '"+adminTFStudentPhone.getText()+"',"+
                        "dbStudentAddress = '"+adminTFStudentAddress.getText()+"',"+
                        "dbGuardianFname = '"+adminTFGuardianFname.getText()+"',"+
                        "dbGuardianLname = '"+adminTFGuardianLname.getText()+"',"+
                        "dbGuardianEmail = '"+adminTFGuardianEmail.getText()+"',"+
                        "dbGuardianPhone = '"+adminTFGuardianPhone.getText()+"',"+
                        "dbStudent1SemGpa = '"+adminTFS1SemGpa.getText()+"',"+
                        "dbStudent2SemGpa = '"+adminTFS2SemGpa.getText()+"',"+
                        "dbStudent3SemGpa = '"+adminTFS3SemGpa.getText()+"',"+
                        "dbStudent4SemGpa = '"+adminTFS4SemGpa.getText()+"',"+
                        "dbStudent5SemGpa = '"+adminTFS5SemGpa.getText()+"',"+
                        "dbStudent6SemGpa = '"+adminTFS6SemGpa.getText()+"',"+
                        "dbStudent7SemGpa = '"+adminTFS7SemGpa.getText()+"',"+
                        "dbStudent8SemGpa = '"+adminTFS8SemGpa.getText()+"',"+
                        "dbStudent9SemGpa = '"+adminTFS9SemGpa.getText()+"',"+
                        "dbStudent10SemGpa = '"+adminTFS10SemGpa.getText()+"',"+
                        "dbStudent11SemGpa = '"+adminTFS11SemGpa.getText()+"',"+
                        "dbStudent12SemGpa = '"+adminTFS12SemGpa.getText()+"',"+
                        "dbStudentCgpa = '"+adminTFSCgpa.getText()+

                        "' where dbStudentID = '"+
                        temp+"';");
                
                if (temp.equals(adminTFStudentID.getText())){
                    statement.executeUpdate("update studentgpa set dbstudentgpaID ='"+adminTFStudentID.getText()+"'where dbstudentgpaID = '"+ temp+"';");
                }
                
            }


            connection.close();
            statement.close();
            resultSet.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        adminSetAllClear();
        adminSetAllDisable();
        adminTableView.setItems(getDataFromSqlAndAddToObservableList("SELECT * FROM student;"));
        isSetAdminEditButtonClick=false;
        isSetAdminAddNewButtonClick = false;
    }


    private void adminSetAllClear(){
        adminTFStudentFname.clear();
        adminTFStudentLname.clear();
        adminTFStudentID.clear();
        adminTFStudentEmail.clear();
        adminTFStudentPhone.clear();
        adminTFStudentAddress.clear();
        adminDPStudentDOB.equals("");
        adminTFStudentPassword.clear();
        adminTFGuardianFname.clear();
        adminTFGuardianLname.clear();
        adminTFGuardianEmail.clear();
        adminTFGuardianPhone.clear();
        adminTFS1SemGpa.clear();
        adminTFS2SemGpa.clear();
        adminTFS3SemGpa.clear();
        adminTFS4SemGpa.clear();
        adminTFS5SemGpa.clear();
        adminTFS6SemGpa.clear();
        adminTFS7SemGpa.clear();
        adminTFS8SemGpa.clear();
        adminTFS9SemGpa.clear();
        adminTFS10SemGpa.clear();
        adminTFS11SemGpa.clear();
        adminTFS12SemGpa.clear();
        adminTFSCgpa.clear();

    }

    @FXML
    private void setAdminClearButtonClick(Event event){
        adminSetAllClear();
        adminSetAllDisable();
        isSetAdminEditButtonClick=false;
        isSetAdminAddNewButtonClick = false;
    }

    @FXML
    private void setAdminRefreshButtonClick(Event event){
        adminTableView.setItems(getDataFromSqlAndAddToObservableList("SELECT * FROM student;"));//SQL Query
        adminTFSearch.clear();
    }


    @FXML
    private void setAdminSearchButtonClick(Event event){
        String sqlQuery = "select * FROM student where dbStudentID = '"+adminTFSearch.getText()+"';";
        adminTableView.setItems(getDataFromSqlAndAddToObservableList(sqlQuery));
    }

    @FXML
    private void setAdminEditButtonClick(Event event){
        AdminTable getSelectedRow = adminTableView.getSelectionModel().getSelectedItem();


        String sqlQuery = "select * FROM student where dbStudentID = '"+getSelectedRow.getAdminTableDataStudentID()+"';";

        try {
            connection = database.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);
            adminSetAllEnable();
            while(resultSet.next()) {
                adminTFStudentFname.setText(resultSet.getString("dbStudentFname"));
                adminTFStudentLname.setText(resultSet.getString("dbStudentLname"));
                adminTFStudentID.setText(resultSet.getString("dbStudentID"));
                adminCBStudentDepartment.setValue(resultSet.getString("dbStudentDepartment"));
                adminTFStudentEmail.setText(resultSet.getString("dbStudentEmail"));
                adminTFStudentPhone.setText(resultSet.getString("dbStudentPhone"));
                adminTFStudentAddress.setText(resultSet.getString("dbStudentAddress"));
                try {
                    if (!(resultSet.getString("dbStudentDOB").isEmpty())) {
                        adminDPStudentDOB.setValue(LocalDate.parse(resultSet.getString("dbStudentDOB")));
                    }
                }
                catch (NullPointerException e){
                    adminDPStudentDOB.setValue(null);
                }
                
                adminTFStudentPassword.setText(resultSet.getString("dbStudentPassword"));
                adminTFGuardianFname.setText(resultSet.getString("dbGuardianFname"));
                adminTFGuardianLname.setText(resultSet.getString("dbGuardianLname"));
                adminTFGuardianEmail.setText(resultSet.getString("dbGuardianEmail"));
                adminTFGuardianPhone.setText(resultSet.getString("dbGuardianPhone"));
                adminTFS1SemGpa.setText(resultSet.getString("dbStudent1SemGpa"));
                adminTFS2SemGpa.setText(resultSet.getString("dbStudent2SemGpa"));
                adminTFS3SemGpa.setText(resultSet.getString("dbStudent3SemGpa"));
                adminTFS4SemGpa.setText(resultSet.getString("dbStudent4SemGpa"));
                adminTFS5SemGpa.setText(resultSet.getString("dbStudent5SemGpa"));
                adminTFS6SemGpa.setText(resultSet.getString("dbStudent6SemGpa"));
                adminTFS7SemGpa.setText(resultSet.getString("dbStudent7SemGpa"));
                adminTFS8SemGpa.setText(resultSet.getString("dbStudent8SemGpa"));
                adminTFS9SemGpa.setText(resultSet.getString("dbStudent9SemGpa"));
                adminTFS10SemGpa.setText(resultSet.getString("dbStudent10SemGpa"));
                adminTFS11SemGpa.setText(resultSet.getString("dbStudent11SemGpa"));
                adminTFS12SemGpa.setText(resultSet.getString("dbStudent12SemGpa"));
                adminTFSCgpa.setText(resultSet.getString("dbStudent1SemGpa"));

            }

            temp=adminTFStudentID.getText();
            isSetAdminEditButtonClick = true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void setAdminDeleteButtonClick(Event event){

        AdminTable getSelectedRow = adminTableView.getSelectionModel().getSelectedItem();
        String sqlQuery = "delete from student where dbStudentID = '"+getSelectedRow.getAdminTableDataStudentID()+"';";
        try {
            connection = database.getConnection();
            statement = connection.createStatement();

            statement.executeUpdate(sqlQuery);
            statement.executeUpdate("delete from studentgpa where dbstudentgpaID ='"+getSelectedRow.getAdminTableDataStudentID()+"';");
            adminTableView.setItems(getDataFromSqlAndAddToObservableList("SELECT * FROM student;"));

        }
        catch (SQLException e) {
            e.printStackTrace();
        }


        
    }

    @FXML
    private void setAdminViewButtonClick(Event event) throws IOException {

    	try {
        Info info = new Info(adminTableView.getSelectionModel().getSelectedItem().getAdminTableDataStudentID());        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/profileView/profileView.fxml"));
        loader.load();
        Parent p = loader.getRoot();
        Scene studentScene = new Scene(p);        
        studentScene.getStylesheets().add(getClass().getResource("/main/applicationProfile.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(studentScene);        

        ProfileView profileView = loader.getController();
        profileView.setCurrentInfo(info);
        stage.show();
    	}
    	catch(NullPointerException e) {
    		
    		NotificationType notificationType = NotificationType.ERROR;
            TrayNotification tray = new TrayNotification();
            tray.setTitle("ATTENTION!");
            tray.setMessage("You have to pick one name!");
            tray.setNotificationType(notificationType);
            tray.showAndDismiss(Duration.millis(3000));
    	}
            	

    }

    @FXML
    private void setAdminCloseButtonClick(Event event){
        menuBarControl.close();
    }

    @FXML
    private void setAdminAboutButtonClick(Event event) throws IOException {
        menuBarControl.about();
    }

    @FXML
    private void setAdminCoursePanelClick(Event event) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/admin/Course.fxml"));
        loader.load();
        Parent p = loader.getRoot();
        Scene course = new Scene(p);
        course.getStylesheets().add(getClass().getResource("/main/applicationCourse.css").toExternalForm());
        Stage stage = new Stage();        
        stage.setScene(course);
        stage.setTitle("Course Panel");
        stage.show();
    }

   
    
   

}
