package entity;

import java.util.ArrayList;

public class DocIDsAndAuth {
	private ArrayList<String> DocIDs;

	private ArrayList<String> DocAuth;

	public ArrayList<String> getDocAuth() {
		return DocAuth;
	}

	public void setDocAuth(ArrayList<String> docAuth) {
		DocAuth = docAuth;
	}

	public ArrayList<String> getDocIDs() {
		return DocIDs;
	}

	public void setDocIDs(ArrayList<String> docIDs) {
		DocIDs = docIDs;
	}
}