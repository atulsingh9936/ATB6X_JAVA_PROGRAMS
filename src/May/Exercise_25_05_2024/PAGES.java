package May.Exercise_25_05_2024;

public enum PAGES {

    Home("https://app.vwo.com","homepage"),
    Login("https://app.vwo.com/login","login"),
    Dashboard("https://app.vwo.com/dashboard","Dashboard page");

    String url;
    String page;
    //home -> https://app.vwo.com
    // login -> https://app.vwo.com/login
    // dashboard ->https://app.vwo.com/dashboard


    PAGES(String url, String page) {
        this.url = url;
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
