package backingbeans;

import model.interfaces.ESearchLocal;
import model.storage.ESearchResult;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

/**
 * @author m.kongoev
 */
@ViewScoped
@ManagedBean
public class MainPageViewModel {

	@Inject
	private ESearchLocal eSearchLocal;

	private ESearchResult searchResult;

	private List<String> mySmallList;
	private String hello;

	@PostConstruct
	private void init() {
		mySmallList = Arrays.asList("First", "Second", "Third", "Fourth", "Last");
		hello = eSearchLocal.sendQuery("gds",
				"\"gsm\"[Entry Type] AND \"Homo sapiens\"[Organism] AND ChIP-Seq[All Fields] AND bed[Supplementary Files]")
				.getQueryTranslation();
	}

	public List<String> getMySmallList() {
		return mySmallList;
	}

	public void setMySmallList(List<String> mySmallList) {
		this.mySmallList = mySmallList;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public ESearchResult getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(ESearchResult searchResult) {
		this.searchResult = searchResult;
	}
}
