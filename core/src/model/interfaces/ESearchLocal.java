package model.interfaces;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ESearchLocal {
	List<Long> findIds(String db, String term);

	List<String> findAccessionsBuIds(List<Long> ids);
}
