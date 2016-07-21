package patients.model;
// Generated Jul 21, 2016 4:36:14 PM by Hibernate Tools 5.1.0.Beta1

/**
 * Zip generated by hbm2java
 */
public class Zip implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7838301752647751081L;
	
	private int zipid;
	private Integer version;
	private String zip;
	private String city;
	private Integer landId;
	private String selfCreated;
	private Integer deleted;

	public Zip() {
	}

	public Zip(int zipid) {
		this.zipid = zipid;
	}

	public Zip(int zipid, String zip, String city, Integer landId, String selfCreated, Integer deleted) {
		this.zipid = zipid;
		this.zip = zip;
		this.city = city;
		this.landId = landId;
		this.selfCreated = selfCreated;
		this.deleted = deleted;
	}

	public int getZipid() {
		return this.zipid;
	}

	public void setZipid(int zipid) {
		this.zipid = zipid;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getLandId() {
		return this.landId;
	}

	public void setLandId(Integer landId) {
		this.landId = landId;
	}

	public String getSelfCreated() {
		return this.selfCreated;
	}

	public void setSelfCreated(String selfCreated) {
		this.selfCreated = selfCreated;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

}
