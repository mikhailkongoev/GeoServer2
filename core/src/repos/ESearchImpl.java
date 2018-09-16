package repos;

import model.interfaces.ESearchLocal;
import model.storage.ESearchResult;
import org.glassfish.jersey.client.ClientResponse;

import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

/**
 * @author m.kongoev
 */
@Stateless
public class ESearchImpl implements ESearchLocal {

	private static final String REST_URI
			= "https://eutils.ncbi.nlm.nih.gov/entrez/eutils";

	private Client client = ClientBuilder.newClient();

	@Override
	public ESearchResult sendQuery(String db, String term) {
		ESearchResult response =  client
				.target(REST_URI)
				.path("esearch.fcgi")
				.queryParam("db", db)
				.queryParam("term", term)
				.request(MediaType.APPLICATION_XML)
				.get(ESearchResult.class);

		return response;
	}
}
