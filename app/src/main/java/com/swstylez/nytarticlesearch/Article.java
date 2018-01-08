package com.swstylez.nytarticlesearch;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jndukuba on 1/5/2018.
 */

public class Article {

    @SerializedName("_id")
    private String id;
    private String snippet;

    @SerializedName("web_url")
    private String webUrl;

    private String source;
    private String leadParagraph;

    @SerializedName("abstract")
    private String articleAbstract;

    @SerializedName("print_page")
    private String printPage;

    private Blog blog;

    @SerializedName("pub_date")
    private String pubDate;

    @SerializedName("document_type")
    private String documentType;

    @SerializedName("news_desk")
    private String newsDesk;

    private String sectionName;
    private String subsectionName;

    @SerializedName("type_of_material")
    private String typeOfMaterial;
    private String wordCount;
    private String slideshowCredits;
    private Headline headline;
    private List<Thumbnail> multimedia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLeadParagraph() {
        return leadParagraph;
    }

    public void setLeadParagraph(String leadParagraph) {
        this.leadParagraph = leadParagraph;
    }

    public String getArticleAbstract() {
        return articleAbstract;
    }

    public void setArticleAbstract(String articleAbstract) {
        this.articleAbstract = articleAbstract;
    }

    public String getPrintPage() {
        return printPage;
    }

    public void setPrintPage(String printPage) {
        this.printPage = printPage;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getNewsDesk() {
        return newsDesk;
    }

    public void setNewsDesk(String newsDesk) {
        this.newsDesk = newsDesk;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSubsectionName() {
        return subsectionName;
    }

    public void setSubsectionName(String subsectionName) {
        this.subsectionName = subsectionName;
    }

    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public String getSlideshowCredits() {
        return slideshowCredits;
    }

    public void setSlideshowCredits(String slideshowCredits) {
        this.slideshowCredits = slideshowCredits;
    }

    public Headline getHeadline() {
        return headline;
    }

    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    public List<Thumbnail> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<Thumbnail> multimedia) {
        this.multimedia = multimedia;
    }

    public class Blog {



    }

    public class Headline {

        private String main;

        private String kicker;

        private String contentKicker;

        private String printHeadline;

        private String name;

        private String seo;

        private String sub;

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getKicker() {
            return kicker;
        }

        public void setKicker(String kicker) {
            this.kicker = kicker;
        }

        public String getContentKicker() {
            return contentKicker;
        }

        public void setContentKicker(String contentKicker) {
            this.contentKicker = contentKicker;
        }

        public String getPrintHeadline() {
            return printHeadline;
        }

        public void setPrintHeadline(String printHeadline) {
            this.printHeadline = printHeadline;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSeo() {
            return seo;
        }

        public void setSeo(String seo) {
            this.seo = seo;
        }

        public String getSub() {
            return sub;
        }

        public void setSub(String sub) {
            this.sub = sub;
        }

    }

    public class Thumbnail {

        private int rank;

        private String subtype;

        private String caption;

        private String credit;

        private String type;

        private String url;

        private int height;

        private int width;

        private String subType;

        @SerializedName("crop_name")
        private String cropName;

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getCredit() {
            return credit;
        }

        public void setCredit(String credit) {
            this.credit = credit;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public String getSubType() {
            return subType;
        }

        public void setSubType(String subType) {
            this.subType = subType;
        }

        public String getCropName() {
            return cropName;
        }

        public void setCropName(String cropName) {
            this.cropName = cropName;
        }

    }

}
