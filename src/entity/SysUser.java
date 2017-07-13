package entity;

import java.util.ArrayList;

import lombok.Data;


public @Data class SysUser {

	
	private String AUTH;
	private String Uid;
	private String isAction;
	private String Sysid;
	private String UserNo;
	private String UserName;
	private ArrayList<String> DocIDs;
	private ArrayList<String> DocAuth;
}
