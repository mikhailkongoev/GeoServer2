package backingbeans;

import model.interfaces.ESearchLocal;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * @author m.kongoev
 */
@ViewScoped
@ManagedBean
public class MainPageViewModel {

	@Inject
	private ESearchLocal eSearchLocal;

	private List<Long> ids;

	private String query;

	private String result;


	@PostConstruct
	private void init() {
		ids = eSearchLocal.findIds("gds",
				"\"gsm\"[Entry Type] AND \"Homo sapiens\"[Organism] AND ChIP-Seq[All Fields] AND bed[Supplementary Files]");

		eSearchLocal.findAccessionsBuIds(ids);
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
