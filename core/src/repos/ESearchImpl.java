package repos;

import model.interfaces.ESearchLocal;
import model.storage.ESearchResult;

import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author m.kongoev
 */
@Stateless
public class ESearchImpl implements ESearchLocal {

	private static final String REST_URI
			= "https://eutils.ncbi.nlm.nih.gov/entrez/eutils";

	private Client client = ClientBuilder.newClient();

	@Override
	public List<Long> findIds(String db, String term) {
		ESearchResult response =  client
				.target(REST_URI)
				.path("esearch.fcgi")
				.queryParam("db", "gds")
				.queryParam("term", term)
				.request(MediaType.APPLICATION_XML)
				.get(ESearchResult.class);

		return response.getIdList().stream().map(ESearchResult.Id::getId).collect(Collectors.toList());
	}

	@Override
	public List<String> findAccessionsBuIds(List<Long> ids) {
		List<String> res = new ArrayList<>();
		String response =  client
				.target(REST_URI)
				.path("efetch.fcgi")
				.queryParam("db", "gds")
				.queryParam("rettype", "xml")
				.queryParam("id", ids)
				.request(MediaType.APPLICATION_XML)
				.get().readEntity(String.class);

		res.add(response);
		return res;
	}
}
