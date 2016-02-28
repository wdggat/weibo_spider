package edu.zjut.spider;

public class Weibo {
	private String content;
	private long time;
	private String author;
	private String url;
	private int repost;
	private int repub;
	private int comment;
	
	public Weibo(String content, long time, String author, String url,
			int repost, int repub, int comment) {
		super();
		this.content = content;
		this.time = time;
		this.author = author;
		this.url = url;
		this.repost = repost;
		this.repub = repub;
		this.comment = comment;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getRepost() {
		return repost;
	}

	public void setRepost(int repost) {
		this.repost = repost;
	}

	public int getRepub() {
		return repub;
	}

	public void setRepub(int repub) {
		this.repub = repub;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}
	
    
}
