package model.storage;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author m.kongoev
 */
@XmlRootElement(name = "eSearchResult")
public class ESearchResult {
	private long count;

	private long retMax;

	private long retStart;

	private List<Long> idList;

	private TranslationSet translationSet;

	private TranslationStack translationStack;

	private String queryTranslation;

	@XmlElement
	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	@XmlElement
	public long getRetMax() {
		return retMax;
	}

	public void setRetMax(long retMax) {
		this.retMax = retMax;
	}

	@XmlElement
	public long getRetStart() {
		return retStart;
	}

	public void setRetStart(long retStart) {
		this.retStart = retStart;
	}

	@XmlElement
	public List<Long> getIdList() {
		return idList;
	}

	public void setIdList(List<Long> idList) {
		this.idList = idList;
	}

	@XmlElement
	public TranslationSet getTranslationSet() {
		return translationSet;
	}

	public void setTranslationSet(TranslationSet translationSet) {
		this.translationSet = translationSet;
	}

	@XmlElement
	public TranslationStack getTranslationStack() {
		return translationStack;
	}

	public void setTranslationStack(TranslationStack translationStack) {
		this.translationStack = translationStack;
	}

	@XmlElement
	public String getQueryTranslation() {
		return queryTranslation;
	}

	public void setQueryTranslation(String queryTranslation) {
		this.queryTranslation = queryTranslation;
	}

	public final static class TranslationSet {
		private Translation translation;

		public final static class Translation {
			private String from;

			private String to;

			@XmlElement
			public String getFrom() {
				return from;
			}

			public void setFrom(String from) {
				this.from = from;
			}

			@XmlElement
			public String getTo() {
				return to;
			}

			public void setTo(String to) {
				this.to = to;
			}
		}

		@XmlElement
		public Translation getTranslation() {
			return translation;
		}

		public void setTranslation(Translation translation) {
			this.translation = translation;
		}
	}

	public final static class TranslationStack {
		private List<TermSet> termSetList;

		public final static class TermSet {
			private String term;

			private String field;

			private long count;

			private String explode;

			@XmlElement
			public String getTerm() {
				return term;
			}

			public void setTerm(String term) {
				this.term = term;
			}

			@XmlElement
			public String getField() {
				return field;
			}

			public void setField(String field) {
				this.field = field;
			}

			@XmlElement
			public long getCount() {
				return count;
			}

			public void setCount(long count) {
				this.count = count;
			}

			@XmlElement
			public String getExplode() {
				return explode;
			}

			public void setExplode(String explode) {
				this.explode = explode;
			}
		}

		@XmlElement
		public List<TermSet> getTermSetList() {
			return termSetList;
		}

		public void setTermSetList(List<TermSet> termSetList) {
			this.termSetList = termSetList;
		}
	}
}
