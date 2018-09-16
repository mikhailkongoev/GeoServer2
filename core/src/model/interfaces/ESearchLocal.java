package model.interfaces;

import model.storage.ESearchResult;

import javax.ejb.Local;

@Local
public interface ESearchLocal {
	ESearchResult sendQuery(String db, String term);
}
