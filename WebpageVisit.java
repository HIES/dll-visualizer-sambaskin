/**
 * A class to model a visit to a webpage for a 
 * browser's back/forward functionality.
 * 
 * @author ian.frame
 */
public class WebpageVisit{
    
    private String url;
    private boolean usesCookies;
    
    public WebpageVisit(String url, boolean usesCookies){
        this.url = url;
        this.usesCookies = usesCookies;
    }
    
    @Override
    public String toString(){
        return "url: " + this.url + "\nUses Cookies: " + this.usesCookies;
    }
}
