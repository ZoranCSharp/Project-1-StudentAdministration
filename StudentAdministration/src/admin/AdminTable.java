package admin;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class AdminTable {
	private final SimpleIntegerProperty adminTableDataNo;
	private final SimpleStringProperty adminTableDataStudentName;
	private final SimpleStringProperty adminTableDataStudentID;
	private final SimpleStringProperty adminTableDataStudentDepartment;
	private final SimpleDoubleProperty adminTableDataStudentCGPA;
	private final SimpleStringProperty adminTableDataStudentPhone;
	private final SimpleStringProperty adminTableDataStudentDOB;
	private final SimpleStringProperty adminTableDataStudentPassword;
	private final SimpleStringProperty adminTableDataGuardianName;
	private final SimpleStringProperty adminTableDataGuardianEmail;
	private final SimpleStringProperty adminTableDataGuardianPhone;
	private final SimpleStringProperty adminTableDataStudentAddress;
	private final SimpleStringProperty adminTableData1SemGpa;
	private final SimpleStringProperty adminTableData2SemGpa;
	private final SimpleStringProperty adminTableData3SemGpa;
	private final SimpleStringProperty adminTableData4SemGpa;
	private final SimpleStringProperty adminTableData5SemGpa;
	private final SimpleStringProperty adminTableData6SemGpa;
	private final SimpleStringProperty adminTableData7SemGpa;
	private final SimpleStringProperty adminTableData8SemGpa;
	private final SimpleStringProperty adminTableData9SemGpa;
	private final SimpleStringProperty adminTableData10SemGpa;
	private final SimpleStringProperty adminTableData11SemGpa;
	private final SimpleStringProperty adminTableData12SemGpa;
	private final SimpleStringProperty adminTableDataCgpa;

	public AdminTable(int adminTableDataNo, String adminTableDataStudentName, String adminTableDataStudentID,
			String adminTableDataStudentDepartment, Double adminTableDataStudentCGPA, String adminTableDataStudentPhone,
			String adminTableDataStudentDOB, String adminTableDataStudentPassword, String adminTableDataGuardianName,
			String adminTableDataGuardianEmail, String adminTableDataGuardianPhone, String adminTableDataStudentAddress,
			String adminTableData1SemGpa, String adminTableData2SemGpa, String adminTableData3SemGpa,
			String adminTableData4SemGpa, String adminTableData5SemGpa, String adminTableData6SemGpa,
			String adminTableData7SemGpa, String adminTableData8SemGpa, String adminTableData9SemGpa,
			String adminTableData10SemGpa, String adminTableData11SemGpa, String adminTableData12SemGpa,
			String adminTableDataCgpa) {
		
		this.adminTableDataNo = new SimpleIntegerProperty(adminTableDataNo);
		this.adminTableDataStudentName = new SimpleStringProperty(adminTableDataStudentName);
		this.adminTableDataStudentID = new SimpleStringProperty(adminTableDataStudentID);
		this.adminTableDataStudentDepartment = new SimpleStringProperty(adminTableDataStudentDepartment);
		this.adminTableDataStudentCGPA = new SimpleDoubleProperty(adminTableDataStudentCGPA);
		this.adminTableDataStudentPhone = new SimpleStringProperty(adminTableDataStudentPhone);
		this.adminTableDataStudentDOB = new SimpleStringProperty(adminTableDataStudentDOB);
		this.adminTableDataStudentPassword = new SimpleStringProperty(adminTableDataStudentPassword);
		this.adminTableDataGuardianName = new SimpleStringProperty(adminTableDataGuardianName);
		this.adminTableDataGuardianEmail = new SimpleStringProperty(adminTableDataGuardianEmail);
		this.adminTableDataGuardianPhone = new SimpleStringProperty(adminTableDataGuardianPhone);
		this.adminTableDataStudentAddress = new SimpleStringProperty(adminTableDataStudentAddress);
		this.adminTableData1SemGpa = new SimpleStringProperty(adminTableData1SemGpa);
		this.adminTableData2SemGpa = new SimpleStringProperty(adminTableData2SemGpa);
		this.adminTableData3SemGpa = new SimpleStringProperty(adminTableData3SemGpa);
		this.adminTableData4SemGpa = new SimpleStringProperty(adminTableData4SemGpa);
		this.adminTableData5SemGpa = new SimpleStringProperty(adminTableData5SemGpa);
		this.adminTableData6SemGpa = new SimpleStringProperty(adminTableData6SemGpa);
		this.adminTableData7SemGpa = new SimpleStringProperty(adminTableData7SemGpa);
		this.adminTableData8SemGpa = new SimpleStringProperty(adminTableData8SemGpa);
		this.adminTableData9SemGpa = new SimpleStringProperty(adminTableData9SemGpa);
		this.adminTableData10SemGpa = new SimpleStringProperty(adminTableData10SemGpa);
		this.adminTableData11SemGpa = new SimpleStringProperty(adminTableData11SemGpa);
		this.adminTableData12SemGpa = new SimpleStringProperty(adminTableData12SemGpa);
		this.adminTableDataCgpa = new SimpleStringProperty(adminTableDataCgpa);

	}

	public Integer getAdminTableDataNo() {

		return adminTableDataNo.get();
	}

	public SimpleIntegerProperty adminTableDataNoProperty() {
		return adminTableDataNo;
	}

	public void setAdminTableDataNo(Integer adminTableDataNo) {
		this.adminTableDataNo.set(adminTableDataNo);
	}

	public String getAdminTableDataStudentName() {
		return adminTableDataStudentName.get();
	}

	public SimpleStringProperty adminTableDataStudentNameProperty() {
		return adminTableDataStudentName;
	}

	public void setAdminTableDataStudentName(String adminTableDataStudentName) {
		this.adminTableDataStudentName.set(adminTableDataStudentName);
	}

	public String getAdminTableDataStudentID() {
		return adminTableDataStudentID.get();
	}

	public SimpleStringProperty adminTableDataStudentIDProperty() {
		return adminTableDataStudentID;
	}

	public void setAdminTableDataStudentID(String adminTableDataStudentID) {
		this.adminTableDataStudentID.set(adminTableDataStudentID);
	}

	public String getAdminTableDataStudentDepartment() {
		return adminTableDataStudentDepartment.get();
	}

	public SimpleStringProperty adminTableDataStudentDepartmentProperty() {
		return adminTableDataStudentDepartment;
	}

	public void setAdminTableDataStudentDepartment(String adminTableDataStudentDepartment) {
		this.adminTableDataStudentDepartment.set(adminTableDataStudentDepartment);
	}

	public Double getAdminTableDataStudentCGPA() {
		return adminTableDataStudentCGPA.get();
	}

	public SimpleDoubleProperty adminTableDataStudentCGPAProperty() {
		return adminTableDataStudentCGPA;
	}

	public void setAdminTableDataStudentCGPA(Double adminTableDataStudentCGPA) {
		this.adminTableDataStudentCGPA.set(adminTableDataStudentCGPA);
	}

	public String getAdminTableDataStudentPhone() {
		return adminTableDataStudentPhone.get();
	}

	public SimpleStringProperty adminTableDataStudentPhoneProperty() {
		return adminTableDataStudentPhone;
	}

	public void setAdminTableDataStudentPhone(String adminTableDataStudentPhone) {
		this.adminTableDataStudentPhone.set(adminTableDataStudentPhone);
	}

	public String getAdminTableDataStudentDOB() {
		return adminTableDataStudentDOB.get();
	}

	public SimpleStringProperty adminTableDataStudentDOBProperty() {
		return adminTableDataStudentDOB;
	}

	public void setAdminTableDataStudentDOB(String adminTableDataStudentDOB) {
		this.adminTableDataStudentDOB.set(adminTableDataStudentDOB);
	}

	public String getaAminTableDataStudentPassword() {

		return adminTableDataStudentPassword.get();
	}

	public SimpleStringProperty adminTableDataStudentPasswordProperty() {

		return adminTableDataStudentPassword;
	}

	public void setAdminTableDataStudentPassword(String adminTableDataStudentPassword) {

		this.adminTableDataStudentPassword.set(adminTableDataStudentPassword);
	}

	public String getAdminTableDataGuardianName() {
		return adminTableDataGuardianName.get();
	}

	public SimpleStringProperty adminTableDataGuardianNameProperty() {
		return adminTableDataGuardianName;
	}

	public void setAdminTableDataGuardianName(String adminTableDataGuardianName) {
		this.adminTableDataGuardianName.set(adminTableDataGuardianName);
	}

	public String getAdminTableDataGuardianEmail() {
		return adminTableDataGuardianEmail.get();
	}

	public SimpleStringProperty adminTableDataGuardianEmailProperty() {
		return adminTableDataGuardianEmail;
	}

	public void setAdminTableDataGuardianEmail(String adminTableDataGuardianEmail) {
		this.adminTableDataGuardianEmail.set(adminTableDataGuardianEmail);
	}

	public String getAdminTableDataGuardianPhone() {
		return adminTableDataGuardianPhone.get();
	}

	public SimpleStringProperty adminTableDataGuardianPhoneProperty() {
		return adminTableDataGuardianPhone;
	}

	public void setAdminTableDataGuardianPhone(String adminTableDataGuardianPhone) {
		this.adminTableDataGuardianPhone.set(adminTableDataGuardianPhone);
	}

	public String getAdminTableDataStudentAddress() {
		return adminTableDataStudentAddress.get();
	}

	public SimpleStringProperty adminTableDataStudentAddressProperty() {
		return adminTableDataStudentAddress;
	}

	public void setAdminTableDataStudentAddress(String adminTableDataStudentAddress) {
		this.adminTableDataStudentAddress.set(adminTableDataStudentAddress);
	}

	public String getAdminTableData1SemGpa() {
		return adminTableData1SemGpa.get();
	}

	public SimpleStringProperty adminTableData1SemGpaProperty() {

		return adminTableData1SemGpa;
	}

	public void setAdminTableData1SemGpa(String adminTableData1SemGpa) {

		this.adminTableData1SemGpa.set(adminTableData1SemGpa);
	}

	public String getAdminTableData2SemGpa() {
		return adminTableData2SemGpa.get();
	}

	public SimpleStringProperty adminTableData2SemGpaProperty() {

		return adminTableData2SemGpa;
	}

	public void setAdminTableData2SemGpa(String adminTableData2SemGpa) {

		this.adminTableData2SemGpa.set(adminTableData2SemGpa);
	}

	public String getAdminTableData3SemGpa() {
		return adminTableData3SemGpa.get();
	}

	public SimpleStringProperty adminTableData3SemGpaProperty() {

		return adminTableData3SemGpa;
	}

	public void setAdminTableData3SemGpa(String adminTableData3SemGpa) {

		this.adminTableData3SemGpa.set(adminTableData3SemGpa);
	}

	public String getAdminTableData4SemGpa() {
		return adminTableData4SemGpa.get();
	}

	public SimpleStringProperty adminTableData4SemGpaProperty() {

		return adminTableData4SemGpa;
	}

	public void setAdminTableData4SemGpa(String adminTableData4SemGpa) {

		this.adminTableData4SemGpa.set(adminTableData4SemGpa);
	}

	public String getAdminTableData5SemGpa() {
		return adminTableData5SemGpa.get();
	}

	public SimpleStringProperty adminTableData5SemGpaProperty() {

		return adminTableData5SemGpa;
	}

	public void setAdminTableData5SemGpa(String adminTableData5SemGpa) {

		this.adminTableData5SemGpa.set(adminTableData5SemGpa);
	}

	public String getAdminTableData6SemGpa() {
		return adminTableData6SemGpa.get();
	}

	public SimpleStringProperty adminTableData6SemGpaProperty() {

		return adminTableData6SemGpa;
	}

	public void setAdminTableData6SemGpa(String adminTableData6SemGpa) {

		this.adminTableData6SemGpa.set(adminTableData6SemGpa);
	}

	public String getAdminTableData7SemGpa() {
		return adminTableData7SemGpa.get();
	}

	public SimpleStringProperty adminTableData7SemGpaProperty() {

		return adminTableData7SemGpa;
	}

	public void setAdminTableData7SemGpa(String adminTableData7SemGpa) {

		this.adminTableData7SemGpa.set(adminTableData7SemGpa);
	}

	public String getAdminTableData8SemGpa() {
		return adminTableData8SemGpa.get();
	}

	public SimpleStringProperty adminTableData8SemGpaProperty() {

		return adminTableData8SemGpa;
	}

	public void setAdminTableData8SemGpa(String adminTableData8SemGpa) {

		this.adminTableData8SemGpa.set(adminTableData8SemGpa);
	}

	public String getAdminTableData9SemGpa() {
		return adminTableData9SemGpa.get();
	}

	public SimpleStringProperty adminTableData9SemGpaProperty() {

		return adminTableData9SemGpa;
	}

	public void setAdminTableData9SemGpa(String adminTableData9SemGpa) {

		this.adminTableData9SemGpa.set(adminTableData9SemGpa);
	}

	public String getAdminTableData10SemGpa() {
		return adminTableData10SemGpa.get();
	}

	public SimpleStringProperty adminTableData10SemGpaProperty() {

		return adminTableData10SemGpa;
	}

	public void setAdminTableData10SemGpa(String adminTableData10SemGpa) {

		this.adminTableData10SemGpa.set(adminTableData10SemGpa);
	}

	public String getAdminTableData11SemGpa() {
		return adminTableData11SemGpa.get();
	}

	public SimpleStringProperty adminTableData11SemGpaProperty() {

		return adminTableData11SemGpa;
	}

	public void setAdminTableData11SemGpa(String adminTableData11SemGpa) {

		this.adminTableData11SemGpa.set(adminTableData11SemGpa);
	}

	public String getAdminTableData12SemGpa() {
		return adminTableData12SemGpa.get();
	}

	public SimpleStringProperty adminTableData12SemGpaProperty() {

		return adminTableData12SemGpa;
	}

	public void setAdminTableData12SemGpa(String adminTableData12SemGpa) {

		this.adminTableData12SemGpa.set(adminTableData12SemGpa);
	}

	public String getAdminTableDataCgpa() {
		return adminTableDataCgpa.get();
	}

	public SimpleStringProperty adminTableDataCgpaProperty() {

		return adminTableDataCgpa;
	}

	public void setAdminTableDataCgpa(String adminTableDataCgpa) {

		this.adminTableDataCgpa.set(adminTableDataCgpa);
	}

}
