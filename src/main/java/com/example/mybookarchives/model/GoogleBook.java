package com.example.mybookarchives.model;

public class GoogleBook {

    private Object accessInfo;
    private String etag;
    private String id;
    private String kind;
    private Object saleInfo;
    private Object searchInfo;
    private String[] authors;
    private String[] categories;
    private String description;
    private String thumbnail;
    private String smallThumbnail;
    private String language;
    private String publisher;
    private String title;
    private Object volumeInfo;
    private String publishedDate;

    public GoogleBook(Object accessInfo, String etag, String id, String kind, Object saleInfo, Object searchInfo, String[] authors, String[] categories, String description, String thumbnail, String smallThumbnail, String language, String publisher, String title, Object volumeInfo, String publishedDate) {
        super();
        this.accessInfo = accessInfo;
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.saleInfo = saleInfo;
        this.searchInfo = searchInfo;
        this.authors = authors;
        this.categories = categories;
        this.description = description;
        this.thumbnail = thumbnail;
        this.smallThumbnail = smallThumbnail;
        this.language = language;
        this.publisher = publisher;
        this.title = title;
        this.volumeInfo = volumeInfo;
        this.publishedDate = publishedDate;
    }


    public Object getAccessInfo() {
        return accessInfo;
    }

    public String getEtag() {
        return etag;
    }

    public String getId() {
        return id;
    }

    public String getKind() {
        return kind;
    }

    public Object getSaleInfo() {
        return saleInfo;
    }

    public Object getSearchInfo() {
        return searchInfo;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String[] getCategories() {
        return categories;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public String getLanguage() {
        return language;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public Object getVolumeInfo() {
        return volumeInfo;
    }

    public String getPublishedDate() {
        return publishedDate;
    }
}
