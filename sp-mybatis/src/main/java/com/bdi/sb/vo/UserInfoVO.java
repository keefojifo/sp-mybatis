package com.bdi.sb.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("user")
@Data
public class UserInfoVO {

	private String uiName;
	private String active;
	private String uiId;
	private String moddat;
	private String modtim;
	private Integer uiNum;
	private String credat;
	private String cretim;
	private String uiPwd;
	private String[] search;
	private String searchStr;

}
