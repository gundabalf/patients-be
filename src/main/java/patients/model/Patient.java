package patients.model;
// Generated Jul 25, 2016 1:37:07 PM by Hibernate Tools 5.1.0.Beta1

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.owlike.genson.annotation.JsonIgnore;

/**
 * Patient generated by hbm2java
 */
@Entity
@Table(name = "patient", catalog = "patients")
public class Patient implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6060697695012732984L;
	private int internalNumber;
	private Integer version;
	private Insurance insurance;
	private Zip zip;
	private Integer patientId;
	private String patientType;
	private String sex;
	private String politeAddress;
	private String letterPoliteAddress;
	private String lastNamePrefix;
	private String title;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String dateOfBirthString;
	private String street;
	private String countryCode;
	private String city;
	private String homePhone;
	private String workPhone;
	private String mobilePhone;
	private String fax;
	private String email;
	private String www;
	private String staffId;
	private Integer doctorId;
	private String healthInsuranceAccount;
	private String healthInsuranceStatus;
	private String statusExtension;
	private String cardValidTo;
	private String surchargeStatus;
	private String homepatient;
	private Integer distance;
	private String handlingType;
	private String altPayeeActive;
	private String appoliteAddress;
	private String apletterPoliteAddress;
	private String aplastNamePrefix;
	private String aptitle;
	private String aplastName;
	private String apfirstName;
	private String apstreet;
	private String apzip;
	private String apcity;
	private String profession;
	private String company;
	private String bankId;
	private String bankName;
	private String bankAccount;
	private String active;
	private String recordCreationDate;
	private String recordModificationDate;
	private String remark;
	private Integer deleted;
	private String extPatientId;
	private String iban;
	private String bic;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Patient() {
	}

	public Patient(int internalNumber) {
		this.internalNumber = internalNumber;
	}

	public Patient(int internalNumber, Insurance insurance, Zip zip, Integer patientId, String patientType, String sex, String politeAddress, String letterPoliteAddress, String lastNamePrefix, String title, String firstName,
			String lastName, Date dateOfBirth, String street, String countryCode, String city, String homePhone, String workPhone, String mobilePhone, String fax, String email, String www, String staffId, Integer doctorId,
			String healthInsuranceAccount, String healthInsuranceStatus, String statusExtension, String cardValidTo, String surchargeStatus, String homepatient, Integer distance, String handlingType, String altPayeeActive,
			String appoliteAddress, String apletterPoliteAddress, String aplastNamePrefix, String aptitle, String aplastName, String apfirstName, String apstreet, String apzip, String apcity, String profession, String company,
			String bankId, String bankName, String bankAccount, String active, String recordCreationDate, String recordModificationDate, String remark, Integer deleted, String extPatientId, String iban, String bic) {
		this.internalNumber = internalNumber;
		this.insurance = insurance;
		this.zip = zip;
		this.patientId = patientId;
		this.patientType = patientType;
		this.sex = sex;
		this.politeAddress = politeAddress;
		this.letterPoliteAddress = letterPoliteAddress;
		this.lastNamePrefix = lastNamePrefix;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.street = street;
		this.countryCode = countryCode;
		this.city = city;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
		this.mobilePhone = mobilePhone;
		this.fax = fax;
		this.email = email;
		this.www = www;
		this.staffId = staffId;
		this.doctorId = doctorId;
		this.healthInsuranceAccount = healthInsuranceAccount;
		this.healthInsuranceStatus = healthInsuranceStatus;
		this.statusExtension = statusExtension;
		this.cardValidTo = cardValidTo;
		this.surchargeStatus = surchargeStatus;
		this.homepatient = homepatient;
		this.distance = distance;
		this.handlingType = handlingType;
		this.altPayeeActive = altPayeeActive;
		this.appoliteAddress = appoliteAddress;
		this.apletterPoliteAddress = apletterPoliteAddress;
		this.aplastNamePrefix = aplastNamePrefix;
		this.aptitle = aptitle;
		this.aplastName = aplastName;
		this.apfirstName = apfirstName;
		this.apstreet = apstreet;
		this.apzip = apzip;
		this.apcity = apcity;
		this.profession = profession;
		this.company = company;
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankAccount = bankAccount;
		this.active = active;
		this.recordCreationDate = recordCreationDate;
		this.recordModificationDate = recordModificationDate;
		this.remark = remark;
		this.deleted = deleted;
		this.extPatientId = extPatientId;
		this.iban = iban;
		this.bic = bic;
	}

	@Id

	@Column(name = "InternalNumber", unique = true, nullable = false)
	public int getInternalNumber() {
		return this.internalNumber;
	}

	public void setInternalNumber(int internalNumber) {
		this.internalNumber = internalNumber;
	}

	@Version
	@Column(name = "Version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "HealthInsuranceID")
	public Insurance getInsurance() {
		return this.insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ZIPID")
	public Zip getZip() {
		return this.zip;
	}

	public void setZip(Zip zip) {
		this.zip = zip;
	}

	@Column(name = "PatientID")
	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	@Column(name = "PatientType", length = 65535)
	public String getPatientType() {
		return this.patientType;
	}

	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}

	@Column(name = "Sex", length = 65535)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "PoliteAddress", length = 65535)
	public String getPoliteAddress() {
		return this.politeAddress;
	}

	public void setPoliteAddress(String politeAddress) {
		this.politeAddress = politeAddress;
	}

	@Column(name = "LetterPoliteAddress", length = 65535)
	public String getLetterPoliteAddress() {
		return this.letterPoliteAddress;
	}

	public void setLetterPoliteAddress(String letterPoliteAddress) {
		this.letterPoliteAddress = letterPoliteAddress;
	}

	@Column(name = "LastNamePrefix", length = 65535)
	public String getLastNamePrefix() {
		return this.lastNamePrefix;
	}

	public void setLastNamePrefix(String lastNamePrefix) {
		this.lastNamePrefix = lastNamePrefix;
	}

	@Column(name = "Title", length = 65535)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "FirstName", length = 65535)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", length = 65535)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DateOfBirth", length = 10)
	@JsonIgnore
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "Street", length = 65535)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "CountryCode", length = 65535)
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Column(name = "City", length = 65535)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "HomePhone", length = 65535)
	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	@Column(name = "WorkPhone", length = 65535)
	public String getWorkPhone() {
		return this.workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	@Column(name = "MobilePhone", length = 65535)
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@Column(name = "Fax", length = 65535)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "Email", length = 65535)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "WWW", length = 65535)
	public String getWww() {
		return this.www;
	}

	public void setWww(String www) {
		this.www = www;
	}

	@Column(name = "StaffID", length = 65535)
	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	@Column(name = "DoctorID")
	public Integer getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	@Column(name = "HealthInsuranceAccount", length = 65535)
	public String getHealthInsuranceAccount() {
		return this.healthInsuranceAccount;
	}

	public void setHealthInsuranceAccount(String healthInsuranceAccount) {
		this.healthInsuranceAccount = healthInsuranceAccount;
	}

	@Column(name = "HealthInsuranceStatus", length = 65535)
	public String getHealthInsuranceStatus() {
		return this.healthInsuranceStatus;
	}

	public void setHealthInsuranceStatus(String healthInsuranceStatus) {
		this.healthInsuranceStatus = healthInsuranceStatus;
	}

	@Column(name = "StatusExtension", length = 65535)
	public String getStatusExtension() {
		return this.statusExtension;
	}

	public void setStatusExtension(String statusExtension) {
		this.statusExtension = statusExtension;
	}

	@Column(name = "CardValidTo", length = 65535)
	public String getCardValidTo() {
		return this.cardValidTo;
	}

	public void setCardValidTo(String cardValidTo) {
		this.cardValidTo = cardValidTo;
	}

	@Column(name = "SurchargeStatus", length = 65535)
	public String getSurchargeStatus() {
		return this.surchargeStatus;
	}

	public void setSurchargeStatus(String surchargeStatus) {
		this.surchargeStatus = surchargeStatus;
	}

	@Column(name = "Homepatient", length = 65535)
	public String getHomepatient() {
		return this.homepatient;
	}

	public void setHomepatient(String homepatient) {
		this.homepatient = homepatient;
	}

	@Column(name = "Distance")
	public Integer getDistance() {
		return this.distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	@Column(name = "HandlingType", length = 65535)
	public String getHandlingType() {
		return this.handlingType;
	}

	public void setHandlingType(String handlingType) {
		this.handlingType = handlingType;
	}

	@Column(name = "AltPayeeActive", length = 65535)
	public String getAltPayeeActive() {
		return this.altPayeeActive;
	}

	public void setAltPayeeActive(String altPayeeActive) {
		this.altPayeeActive = altPayeeActive;
	}

	@Column(name = "APPoliteAddress", length = 65535)
	public String getAppoliteAddress() {
		return this.appoliteAddress;
	}

	public void setAppoliteAddress(String appoliteAddress) {
		this.appoliteAddress = appoliteAddress;
	}

	@Column(name = "APLetterPoliteAddress", length = 65535)
	public String getApletterPoliteAddress() {
		return this.apletterPoliteAddress;
	}

	public void setApletterPoliteAddress(String apletterPoliteAddress) {
		this.apletterPoliteAddress = apletterPoliteAddress;
	}

	@Column(name = "APLastNamePrefix", length = 65535)
	public String getAplastNamePrefix() {
		return this.aplastNamePrefix;
	}

	public void setAplastNamePrefix(String aplastNamePrefix) {
		this.aplastNamePrefix = aplastNamePrefix;
	}

	@Column(name = "APTitle", length = 65535)
	public String getAptitle() {
		return this.aptitle;
	}

	public void setAptitle(String aptitle) {
		this.aptitle = aptitle;
	}

	@Column(name = "APLastName", length = 65535)
	public String getAplastName() {
		return this.aplastName;
	}

	public void setAplastName(String aplastName) {
		this.aplastName = aplastName;
	}

	@Column(name = "APFirstName", length = 65535)
	public String getApfirstName() {
		return this.apfirstName;
	}

	public void setApfirstName(String apfirstName) {
		this.apfirstName = apfirstName;
	}

	@Column(name = "APStreet", length = 65535)
	public String getApstreet() {
		return this.apstreet;
	}

	public void setApstreet(String apstreet) {
		this.apstreet = apstreet;
	}

	@Column(name = "APZIP", length = 65535)
	public String getApzip() {
		return this.apzip;
	}

	public void setApzip(String apzip) {
		this.apzip = apzip;
	}

	@Column(name = "APCity", length = 65535)
	public String getApcity() {
		return this.apcity;
	}

	public void setApcity(String apcity) {
		this.apcity = apcity;
	}

	@Column(name = "Profession", length = 65535)
	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Column(name = "Company", length = 65535)
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Column(name = "BankID", length = 65535)
	public String getBankId() {
		return this.bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	@Column(name = "BankName", length = 65535)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "BankAccount", length = 65535)
	public String getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Column(name = "Active", length = 65535)
	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Column(name = "RecordCreationDate", length = 65535)
	public String getRecordCreationDate() {
		return this.recordCreationDate;
	}

	public void setRecordCreationDate(String recordCreationDate) {
		this.recordCreationDate = recordCreationDate;
	}

	@Column(name = "RecordModificationDate", length = 65535)
	public String getRecordModificationDate() {
		return this.recordModificationDate;
	}

	public void setRecordModificationDate(String recordModificationDate) {
		this.recordModificationDate = recordModificationDate;
	}

	@Column(name = "Remark", length = 65535)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "Deleted")
	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	@Column(name = "ExtPatientID", length = 65535)
	public String getExtPatientId() {
		return this.extPatientId;
	}

	public void setExtPatientId(String extPatientId) {
		this.extPatientId = extPatientId;
	}

	@Column(name = "IBAN", length = 65535)
	public String getIban() {
		return this.iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	@Column(name = "BIC", length = 65535)
	public String getBic() {
		return this.bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	@Transient
	public String getDateOfBirthString() {
		return sdf.format(this.dateOfBirth);
	}

	public void setDateOfBirthString(String dateOfBirthString) throws ParseException {
		this.dateOfBirth = sdf.parse(dateOfBirthString);
	}

}
