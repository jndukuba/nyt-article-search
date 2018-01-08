package com.swstylez.nytarticlesearch;

import java.util.List;

/**
 * Created by jndukuba on 1/6/18.
 */

public class ArticleSearchResponse {

    private String status;

    private String copyright;

    private Response response;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public class Response {

        private List<Article> docs;

        public List<Article> getDocs() {
            return docs;
        }

        public void setDocs(List<Article> value) {
            docs = value;
        }

    }

}
