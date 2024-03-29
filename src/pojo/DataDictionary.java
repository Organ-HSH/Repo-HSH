package pojo;

import java.util.Date;

public class DataDictionary {
	private int id;//主键ID
	private String typeCode;//类型编码
	private String typeName;//类型名称
	private int valueId;//类型值ID
	private String valueName;//类型值Name
	private int createdBy;//创建者（来源于backend_user用户表的用户id）
	private Date creationDate;//创建时间
	private int modifyBy;//更新者（来源于backend_user用户表的用户id）
	private Date modifyDate;//最新更新时间
	public int getId() {
		return id;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public int getValueId() {
		return valueId;
	}
	public String getValueName() {
		return valueName;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public void setValueId(int valueId) {
		this.valueId = valueId;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
