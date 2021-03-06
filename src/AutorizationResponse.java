public class AutorizationResponse {

    private String  username;
    private String  key;
    private Integer id;
    private Boolean hasAccess;
    private String  status = "SUCCESS";

    public AutorizationResponse(String username, String key, Integer id, Boolean hasAccess) {
        this.username   = username;
        this.id         = id;
        this.key        = key;
        this.hasAccess  = hasAccess;
    }
    public AutorizationResponse(String username, String key, Boolean hasAccess, String status) {
        this.username   = username;
        this.key        = key;
        this.hasAccess  = hasAccess;
        this.status     = status;
    }

    public String toString() {
        return "[username="+username+";key="+key+";hasAccess="+hasAccess+";status="+status+"]";
    }
}
