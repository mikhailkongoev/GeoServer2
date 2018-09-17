package model.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * @author m.kongoev
 */
@XmlRootElement(name = "eSearchResult")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ESearchResult implements Serializable {
	private static final long serialVersionUID = -2855476125533962101L;

	private long count;

	private long retMax;

	private long retStart;

	private List<Id> idList;

	private TranslationSet translationSet;

	private TranslationStack translationStack;

	private String queryTranslation;

	@XmlElement(name = "Count")
	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	@XmlElement(name = "RetMax")
	public long getRetMax() {
		return retMax;
	}

	public void setRetMax(long retMax) {
		this.retMax = retMax;
	}

	@XmlElement(name = "RetStart")
	public long getRetStart() {
		return retStart;
	}

	public void setRetStart(long retStart) {
		this.retStart = retStart;
	}

	@XmlElement(name = "IdList")
	public List<Id> getIdList() {
		return idList;
	}

	public void setIdList(List<Id> idList) {
		this.idList = idList;
	}

	@XmlElement(name = "TranslationSet")
	public TranslationSet getTranslationSet() {
		return translationSet;
	}

	public void setTranslationSet(TranslationSet translationSet) {
		this.translationSet = translationSet;
	}

	@XmlElement(name = "TranslationStack")
	public TranslationStack getTranslationStack() {
		return translationStack;
	}

	public void setTranslationStack(TranslationStack translationStack) {
		this.translationStack = translationStack;
	}

	@XmlElement(name = "QueryTranslation")
	public String getQueryTranslation() {
		return queryTranslation;
	}

	public void setQueryTranslation(String queryTranslation) {
		this.queryTranslation = queryTranslation;
	}

	public final static class Id {
		private Long id;

		@XmlElement(name = "Id")
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	public final static class TranslationSet {
		private List<Translation> translation;

		public final static class Translation {
			private String from;

			private String to;

			@XmlElement(name = "From")
			public String getFrom() {
				return from;
			}

			public void setFrom(String from) {
				this.from = from;
			}

			@XmlElement(name = "To")
			public String getTo() {
				return to;
			}

			public void setTo(String to) {
				this.to = to;
			}
		}

		@XmlElement(name = "Translation")
		public List<Translation> getTranslation() {
			return translation;
		}

		public void setTranslation(List<Translation> translation) {
			this.translation = translation;
		}
	}

	public final static class TranslationStack {
		private List<TermSet> termSetList;

		private List<String> op;

		public final static class TermSet {
			private String term;

			private String field;

			private long count;

			private String explode;

			@XmlElement(name = "Term")
			public String getTerm() {
				return term;
			}

			public void setTerm(String term) {
				this.term = term;
			}

			@XmlElement(name = "Field")
			public String getField() {
				return field;
			}

			public void setField(String field) {
				this.field = field;
			}

			@XmlElement(name = "Count")
			public long getCount() {
				return count;
			}

			public void setCount(long count) {
				this.count = count;
			}

			@XmlElement(name = "Explode")
			public String getExplode() {
				return explode;
			}

			public void setExplode(String explode) {
				this.explode = explode;
			}
		}

		@XmlElement(name = "TermSet")
		public List<TermSet> getTermSetList() {
			return termSetList;
		}

		public void setTermSetList(List<TermSet> termSetList) {
			this.termSetList = termSetList;
		}

		@XmlElement(name = "OP")
		public List<String> getOp() {
			return op;
		}

		public void setOp(List<String> op) {
			this.op = op;
		}
	}
}
